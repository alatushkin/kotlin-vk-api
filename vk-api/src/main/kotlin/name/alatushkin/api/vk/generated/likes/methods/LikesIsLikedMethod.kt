package name.alatushkin.api.vk.generated.likes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.likes.IsLikedResponse
import name.alatushkin.api.vk.generated.likes.IsLikedType

/**
 *  Checks for the object in the 'Likes' list of the specified user.
 *
 *  [https://vk.com/dev/likes.isLiked]
 *  @property [user_id] User ID.
 *  @property [type] Object type: 'post' — post on user or community wall, 'comment' — comment on a wall post, 'photo' — photo, 'audio' — audio, 'video' — video, 'note' — note, 'photo_comment' — comment on the photo, 'video_comment' — comment on the video, 'topic_comment' — comment in the discussion
 *  @property [owner_id] ID of the user or community that owns the object.
 *  @property [item_id] Object ID.
 */
class LikesIsLikedMethod() : VkMethod<IsLikedResponse>(
    "likes.isLiked",
    HashMap()
) {

    var userId: Long? by props
    var type: IsLikedType? by props
    var ownerId: Long? by props
    var itemId: Long? by props

    constructor(
        userId: Long? = null,
        type: IsLikedType? = null,
        ownerId: Long? = null,
        itemId: Long? = null
    ) : this() {
        this.userId = userId
        this.type = type
        this.ownerId = ownerId
        this.itemId = itemId
    }

    fun setUserId(userId: Long): LikesIsLikedMethod {
        this.userId = userId
        return this
    }

    fun setType(type: IsLikedType): LikesIsLikedMethod {
        this.type = type
        return this
    }

    fun setOwnerId(ownerId: Long): LikesIsLikedMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): LikesIsLikedMethod {
        this.itemId = itemId
        return this
    }

    override val classRef = LikesIsLikedMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<IsLikedResponse>>() {}
    }
}
