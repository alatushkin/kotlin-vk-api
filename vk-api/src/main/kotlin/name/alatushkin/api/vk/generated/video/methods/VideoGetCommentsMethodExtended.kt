@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.video.Sort
import name.alatushkin.api.vk.generated.wall.WallComment
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.getComments]
 *
 * Returns a list of comments on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 * @property needLikes '1' — to return an additional 'likes' field
 * @property startCommentId 
 * @property offset Offset needed to return a specific subset of comments.
 * @property count Number of comments to return.
 * @property sort Sort order: 'asc' — oldest comment first, 'desc' — newest comment first
 */
class VideoGetCommentsMethodExtended(
    ownerId: Long? = null,
    videoId: Long,
    needLikes: Boolean? = null,
    startCommentId: Long? = null,
    offset: Long? = null,
    count: Long? = null,
    sort: Sort? = null
) : VkMethod<VkList<WallComment>>(
    "video.getComments",
    mutableMapOf("extended" to "1"),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var videoId: Long by props
    var needLikes: Boolean? by props
    var startCommentId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var sort: Sort? by props

    init {
        this.ownerId = ownerId
        this.videoId = videoId
        this.needLikes = needLikes
        this.startCommentId = startCommentId
        this.offset = offset
        this.count = count
        this.sort = sort
    }
}
