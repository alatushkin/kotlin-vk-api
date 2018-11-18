package name.alatushkin.api.vk.generated.video

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.messages.MessageAttachment
import name.alatushkin.api.vk.generated.notifications.NotificationParent
import name.alatushkin.api.vk.generated.wall.CommentAttachment
import name.alatushkin.api.vk.generated.wall.WallpostAttachment

interface Video : WallpostAttachment,
    CommentAttachment,
    MessageAttachment,
    NotificationParent {
    val id: Long?
    val ownerId: Long?
    val title: String?
    val duration: Long?
    val description: String?
    val date: VkDate?
    val views: Long?
    val comments: Long?
    val photo130: String?
    val photo320: String?
    val photo640: String?
    val photo800: String?
    val accessKey: String?
    val addingDate: Long?
    val player: String?
    val canEdit: Boolean?
    val canAdd: Boolean?
    val processing: Boolean?
    val live: Boolean?
    val files: VideoFiles?
    val platform: String?
    val width: Long?
    val height: Long?
}