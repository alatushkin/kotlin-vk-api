package name.alatushkin.api.vk.generated.widgets

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.users.UserFull

open class CommentRepliesItem(
    val cid: Long? = null,
    val uid: Long? = null,
    val date: VkDate? = null,
    val text: String? = null,
    val likes: WidgetLikes? = null,
    val user: UserFull? = null
)