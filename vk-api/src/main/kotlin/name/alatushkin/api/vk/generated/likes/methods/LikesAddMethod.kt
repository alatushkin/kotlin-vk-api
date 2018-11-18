package name.alatushkin.api.vk.generated.likes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.likes.AddResponse
import name.alatushkin.api.vk.generated.likes.AddType

/**
 *  Adds the specified object to the 'Likes' list of the current user.
 *
 *  [https://vk.com/dev/likes.add]
 *  @property [type] Object type: 'post' — post on user or community wall, 'comment' — comment on a wall post, 'photo' — photo, 'audio' — audio, 'video' — video, 'note' — note, 'photo_comment' — comment on the photo, 'video_comment' — comment on the video, 'topic_comment' — comment in the discussion, 'sitepage' — page of the site where the [vk.com/dev/Like|Like widget] is installed
 *  @property [owner_id] ID of the user or community that owns the object.
 *  @property [item_id] Object ID.
 *  @property [access_key] Access key required for an object owned by a private entity.
 */
class LikesAddMethod() : VkMethod<AddResponse>(
    "likes.add",
    HashMap()
) {

    var type: AddType? by props
    var ownerId: Long? by props
    var itemId: Long? by props
    var accessKey: String? by props

    constructor(
        type: AddType? = null,
        ownerId: Long? = null,
        itemId: Long? = null,
        accessKey: String? = null
    ) : this() {
        this.type = type
        this.ownerId = ownerId
        this.itemId = itemId
        this.accessKey = accessKey
    }

    fun setType(type: AddType): LikesAddMethod {
        this.type = type
        return this
    }

    fun setOwnerId(ownerId: Long): LikesAddMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): LikesAddMethod {
        this.itemId = itemId
        return this
    }

    fun setAccessKey(accessKey: String): LikesAddMethod {
        this.accessKey = accessKey
        return this
    }

    override val classRef = LikesAddMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<AddResponse>>() {}
    }
}
