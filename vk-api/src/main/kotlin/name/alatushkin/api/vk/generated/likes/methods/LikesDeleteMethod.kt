package name.alatushkin.api.vk.generated.likes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.likes.DeleteResponse
import name.alatushkin.api.vk.generated.likes.DeleteType

/**
 *  Deletes the specified object from the 'Likes' list of the current user.
 *
 *  [https://vk.com/dev/likes.delete]
 *  @property [type] Object type: 'post' — post on user or community wall, 'comment' — comment on a wall post, 'photo' — photo, 'audio' — audio, 'video' — video, 'note' — note, 'photo_comment' — comment on the photo, 'video_comment' — comment on the video, 'topic_comment' — comment in the discussion, 'sitepage' — page of the site where the [vk.com/dev/Like|Like widget] is installed
 *  @property [owner_id] ID of the user or community that owns the object.
 *  @property [item_id] Object ID.
 */
class LikesDeleteMethod() : VkMethod<DeleteResponse>(
    "likes.delete",
    HashMap()
) {

    var type: DeleteType? by props
    var ownerId: Long? by props
    var itemId: Long? by props

    constructor(
        type: DeleteType? = null,
        ownerId: Long? = null,
        itemId: Long? = null
    ) : this() {
        this.type = type
        this.ownerId = ownerId
        this.itemId = itemId
    }

    fun setType(type: DeleteType): LikesDeleteMethod {
        this.type = type
        return this
    }

    fun setOwnerId(ownerId: Long): LikesDeleteMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): LikesDeleteMethod {
        this.itemId = itemId
        return this
    }

    override val classRef = LikesDeleteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<DeleteResponse>>() {}
    }
}
