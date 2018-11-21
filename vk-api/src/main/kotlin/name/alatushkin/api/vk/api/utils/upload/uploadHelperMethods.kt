package name.alatushkin.api.vk.api.utils.upload

import com.fasterxml.jackson.module.kotlin.readValue
import name.alatushkin.api.vk.MethodExecutor
import name.alatushkin.api.vk.MethodExecutorWithException
import name.alatushkin.api.vk.VK_OBJECT_MAPPER
import name.alatushkin.api.vk.api.VkErrorException
import name.alatushkin.api.vk.generated.docs.Doc
import name.alatushkin.api.vk.generated.docs.GetMessagesUploadServerType
import name.alatushkin.api.vk.generated.docs.methods.DocsGetMessagesUploadServerMethod
import name.alatushkin.api.vk.generated.docs.methods.DocsSaveMethod
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.generated.photos.methods.PhotosGetMessagesUploadServerMethod
import name.alatushkin.api.vk.generated.photos.methods.PhotosSaveMessagesPhotoMethod
import name.alatushkin.api.vk.throwExceptionsOnError
import name.alatushkin.httpclient.FilePart
import name.alatushkin.httpclient.HttpMethod
import name.alatushkin.httpclient.RequestBody
import java.nio.charset.Charset

data class UploadPhotoResponse(val server: Long, val hash: String, val photo: String)

@Throws(VkErrorException::class)
suspend fun MethodExecutor.uploadMessagePhoto(peerId: Long, byteArray: ByteArray): Photo {
    return this.throwExceptionsOnError().uploadMessagePhoto(peerId, byteArray)
}

@Throws(VkErrorException::class)
suspend fun MethodExecutorWithException.uploadMessagePhoto(peerId: Long, byteArray: ByteArray): Photo {
    val uploadUrl = this(PhotosGetMessagesUploadServerMethod(peerId)).uploadUrl
    val response = httpClient(
        HttpMethod.POST(
            url = uploadUrl,
            body = RequestBody.MultipartBody(
                mapOf("photo" to FilePart("someName.jpg", "image/jpg", byteArray))
            )
        )
    )
    val uploadPhototResponse: UploadPhotoResponse =
        VK_OBJECT_MAPPER.readValue(response.data.toString(Charset.forName("UTF-8")))

    return this(
        PhotosSaveMessagesPhotoMethod(
            photo = uploadPhototResponse.photo,
            hash = uploadPhototResponse.hash,
            server = uploadPhototResponse.server
        )
    ).first()
}

data class UploadDocumentResponse(val file: String)

@Throws(VkErrorException::class)
suspend fun MethodExecutorWithException.uploadMessageDocument(
    peerId: Long,
    fileName: String,
    byteArray: ByteArray,
    vararg tags: String
): Doc {
    val uploadUrl = this(DocsGetMessagesUploadServerMethod(GetMessagesUploadServerType.DOC, peerId)).uploadUrl

    val response = httpClient(
        HttpMethod.POST(
            url = uploadUrl,
            body = RequestBody.MultipartBody(
                mapOf("file" to FilePart(fileName, guessContentTypeByFilename(fileName), byteArray))
            )
        )
    )
    val uploadDocumentResponse: UploadDocumentResponse =
        VK_OBJECT_MAPPER.readValue(response.data.toString(Charset.forName("UTF-8")))

    return this(
        DocsSaveMethod(
            file = uploadDocumentResponse.file,
            title = fileName,
            tags = tags.joinToString(",")
        )
    ).first()
}

@Throws(VkErrorException::class)
suspend fun MethodExecutor.uploadMessageDocument(peerId: Long, fileName: String, byteArray: ByteArray): Doc {
    return this.throwExceptionsOnError().uploadMessageDocument(peerId, fileName, byteArray)
}