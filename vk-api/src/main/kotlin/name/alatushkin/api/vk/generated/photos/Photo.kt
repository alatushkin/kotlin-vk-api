package name.alatushkin.api.vk.generated.photos

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.messages.MessageAttachment
import name.alatushkin.api.vk.generated.notifications.NotificationParent
import name.alatushkin.api.vk.generated.wall.CommentAttachment
import name.alatushkin.api.vk.generated.wall.WallpostAttachment

interface Photo : WallpostAttachment,
    CommentAttachment,
    MessageAttachment,
    NotificationParent {
    val id: Long
    val albumId: Long
    val ownerId: Long
    val userId: Long?
    val sizes: Array<Image>?
    val postId: Long?
    val width: Long?
    val height: Long?
    val text: String?
    val date: VkDate
    val lat: Double?
    val long: Double?
    val accessKey: String?
}