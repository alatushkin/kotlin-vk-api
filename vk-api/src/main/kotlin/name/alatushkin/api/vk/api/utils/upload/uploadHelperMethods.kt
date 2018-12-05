package name.alatushkin.api.vk.api.utils.upload

import com.fasterxml.jackson.module.kotlin.readValue
import name.alatushkin.api.vk.VK_OBJECT_MAPPER
import name.alatushkin.api.vk.generated.docs.Doc
import name.alatushkin.api.vk.generated.docs.GetMessagesUploadServerType
import name.alatushkin.api.vk.generated.docs.methods.DocsGetMessagesUploadServerMethod
import name.alatushkin.api.vk.generated.docs.methods.DocsSaveMethod
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.generated.photos.methods.PhotosGetMessagesUploadServerMethod
import name.alatushkin.api.vk.generated.photos.methods.PhotosSaveMessagesPhotoMethod
import name.alatushkin.api.vk.tokens.UserGroupMethod
import name.alatushkin.api.vk.tokens.VkClient
import name.alatushkin.api.vk.tokens.invoke
import name.alatushkin.httpclient.FilePart
import name.alatushkin.httpclient.HttpMethod
import name.alatushkin.httpclient.RequestBody
import java.nio.charset.Charset

data class UploadPhotoResponse(val server: Long, val hash: String, val photo: String)

suspend fun VkClient<UserGroupMethod>.uploadMessagePhoto(peerId: Long, byteArray: ByteArray): Photo {
    val uploadUrl = this(PhotosGetMessagesUploadServerMethod(peerId)).uploadUrl
    val response = httpClient(
        HttpMethod.POST(
            url = uploadUrl,
            body = RequestBody.MultipartBody(
                mapOf("photo" to FilePart("someName.jpg", "image/jpg", byteArray))
            )
        )
    )
    val uploadPhotoResponse: UploadPhotoResponse =
        VK_OBJECT_MAPPER.readValue(response.data.toString(Charset.forName("UTF-8")))

    return this(
        PhotosSaveMessagesPhotoMethod(
            photo = uploadPhotoResponse.photo,
            hash = uploadPhotoResponse.hash,
            server = uploadPhotoResponse.server
        )
    ).first()
}

data class UploadDocumentResponse(val file: String)

suspend fun VkClient<UserGroupMethod>.uploadMessageDocument(
    peerId: Long,
    fileName: String,
    byteArray: ByteArray,
    tags: List<String> = emptyList()
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