package name.alatushkin.api.vk.api

import com.fasterxml.jackson.module.kotlin.readValue
import name.alatushkin.api.vk.MethodExecutor
import name.alatushkin.api.vk.VK_OBJECT_MAPPER
import name.alatushkin.api.vk.generated.audio.Audio
import name.alatushkin.api.vk.generated.docs.Doc
import name.alatushkin.api.vk.generated.market.MarketItem
import name.alatushkin.api.vk.generated.messages.AudioMessage
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.generated.photos.methods.PhotosGetMessagesUploadServerMethod
import name.alatushkin.api.vk.generated.photos.methods.PhotosSaveMessagesPhotoMethod
import name.alatushkin.api.vk.generated.polls.Poll
import name.alatushkin.api.vk.generated.video.Video
import name.alatushkin.api.vk.generated.video.VideoFull
import name.alatushkin.api.vk.generated.wall.Wallpost
import name.alatushkin.api.vk.throwExceptionsOnError
import name.alatushkin.httpclient.FilePart
import name.alatushkin.httpclient.HttpMethod
import name.alatushkin.httpclient.RequestBody
import java.nio.charset.Charset

data class UploadPhotoResponse(val server: Long, val hash: String, val photo: String)

suspend fun MethodExecutor.uploadMessagePhoto(peerId: Long, byteArray: ByteArray): Photo {
    val api = this.throwExceptionsOnError()
    val uploadUrl = api(PhotosGetMessagesUploadServerMethod(peerId)).uploadUrl
    val response = httpClient(
        HttpMethod.POST(
            url = uploadUrl,
            body = RequestBody.MultipartBody(
                mapOf("photo" to FilePart("someName.jpg", "image.jpg", byteArray))
            )
        )
    )
    val uploadPhototResponse: UploadPhotoResponse =
        VK_OBJECT_MAPPER.readValue(response.data.toString(Charset.forName("UTF-8")))

    return api(
        PhotosSaveMessagesPhotoMethod(
            photo = uploadPhototResponse.photo,
            hash = uploadPhototResponse.hash,
            server = uploadPhototResponse.server
        )
    ).first()
}

private fun attachmentId(type: String, id: Long, ownerId: Long, accessKey: String? = null): String {
    return "$type${ownerId}_$id" + (accessKey?.let { "_$accessKey" } ?: "")
}

fun Photo.toAttachmentId() = attachmentId("photo", id, ownerId, accessKey)
fun Photo.fullId() = attachmentId("", id, ownerId, accessKey)

fun VideoFull.toAttachmentId() = attachmentId("video", id!!, ownerId!!, accessKey)
fun VideoFull.fullId() = attachmentId("", id!!, ownerId!!, accessKey)

fun Video.toAttachmentId() = attachmentId("video", id!!, ownerId!!, accessKey)
fun Video.fullId() = attachmentId("", id!!, ownerId!!, accessKey)

fun Audio.toAttachmentId() = attachmentId("audio", id, ownerId, accessKey)
fun Audio.fullId() = attachmentId("", id, ownerId, accessKey)

fun Doc.toAttachmentId() = attachmentId("doc", id, ownerId, accessKey)
fun Doc.fullId() = attachmentId("", id, ownerId, accessKey)

fun Wallpost.toAttachmentId() = attachmentId("wall", id!!, ownerId!!, accessKey)
fun Wallpost.fullId() = attachmentId("", id!!, ownerId!!, accessKey)

fun MarketItem.toAttachmentId() = attachmentId("market", id, ownerId)
fun MarketItem.fullId() = attachmentId("", id, ownerId)

fun Poll.toAttachmentId() = attachmentId("poll", id, ownerId)
fun Poll.fullId() = attachmentId("", id, ownerId)

fun AudioMessage.fullId() = attachmentId("", id, ownerId)



