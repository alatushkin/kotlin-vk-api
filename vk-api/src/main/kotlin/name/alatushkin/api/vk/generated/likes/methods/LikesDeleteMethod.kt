@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.likes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.likes.DeleteResponse
import name.alatushkin.api.vk.generated.likes.DeleteType
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/likes.delete]
 *
 * Deletes the specified object from the 'Likes' list of the current user.
 *
 * @property type Object type: 'post' — post on user or community wall, 'comment' — comment on a wall post, 'photo' — photo, 'audio' — audio, 'video' — video, 'note' — note, 'photo_comment' — comment on the photo, 'video_comment' — comment on the video, 'topic_comment' — comment in the discussion, 'sitepage' — page of the site where the [vk.com/dev/Like|Like widget] is installed
 * @property ownerId ID of the user or community that owns the object.
 * @property itemId Object ID.
 */
class LikesDeleteMethod(
        type: DeleteType,
        ownerId: Long? = null,
        itemId: Long
) : VkMethod<DeleteResponse>(
    "likes.delete",
    mutableMapOf(),
    object : TypeReference<VkResponse<DeleteResponse>>() {}
), UserMethod {

    var type: DeleteType by props
    var ownerId: Long? by props
    var itemId: Long by props

    init {
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
}
