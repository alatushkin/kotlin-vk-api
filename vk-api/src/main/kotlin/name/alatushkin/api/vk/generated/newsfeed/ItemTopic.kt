package name.alatushkin.api.vk.generated.newsfeed

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.CommentsInfo
import name.alatushkin.api.vk.generated.common.LikesInfo

open class ItemTopic(
    val postId: Long,
    val text: String,
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    override val type: NewsfeedItemType? = null,
    override val sourceId: Long? = null,
    override val date: VkDate? = null
) : NewsfeedItem
