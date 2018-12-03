package name.alatushkin.api.vk.api

import name.alatushkin.api.vk.VkClient
import name.alatushkin.api.vk.generated.audio.Audio
import name.alatushkin.api.vk.generated.docs.Doc
import name.alatushkin.api.vk.generated.market.MarketItem
import name.alatushkin.api.vk.generated.messages.AudioMessage
import name.alatushkin.api.vk.generated.messages.methods.MessagesSetActivityMethod
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.generated.polls.Poll
import name.alatushkin.api.vk.generated.video.Video
import name.alatushkin.api.vk.generated.video.VideoFull
import name.alatushkin.api.vk.generated.wall.Wallpost

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

suspend fun VkClient.sendTypings(groupId: Long, peerId: Long) {
    this(
        MessagesSetActivityMethod(
            peerId = peerId,
            type = "typing",
            groupId = groupId
        )
    )
}

