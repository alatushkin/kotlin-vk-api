@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.likes.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.likes.IsLikedResponse
import name.alatushkin.api.vk.generated.likes.IsLikedType
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/likes.isLiked]
 *
 * Checks for the object in the 'Likes' list of the specified user.
 *
 * @property userId User ID.
 * @property type Object type: 'post' — post on user or community wall, 'comment' — comment on a wall post, 'photo' — photo, 'audio' — audio, 'video' — video, 'note' — note, 'photo_comment' — comment on the photo, 'video_comment' — comment on the video, 'topic_comment' — comment in the discussion
 * @property ownerId ID of the user or community that owns the object.
 * @property itemId Object ID.
 */
class LikesIsLikedMethod(
    userId: Long? = null,
    type: IsLikedType,
    ownerId: Long? = null,
    itemId: Long
) : VkMethod<IsLikedResponse>(
    "likes.isLiked",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long? by props
    var type: IsLikedType by props
    var ownerId: Long? by props
    var itemId: Long by props

    init {
        this.userId = userId
        this.type = type
        this.ownerId = ownerId
        this.itemId = itemId
    }
}
