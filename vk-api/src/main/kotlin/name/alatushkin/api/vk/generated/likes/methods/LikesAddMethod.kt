@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.likes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.likes.AddResponse
import name.alatushkin.api.vk.generated.likes.AddType
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/likes.add]
 *
 * Adds the specified object to the 'Likes' list of the current user.
 *
 * @property type Object type: 'post' — post on user or community wall, 'comment' — comment on a wall post, 'photo' — photo, 'audio' — audio, 'video' — video, 'note' — note, 'photo_comment' — comment on the photo, 'video_comment' — comment on the video, 'topic_comment' — comment in the discussion, 'sitepage' — page of the site where the [vk.com/dev/Like|Like widget] is installed
 * @property ownerId ID of the user or community that owns the object.
 * @property itemId Object ID.
 * @property accessKey Access key required for an object owned by a private entity.
 */
class LikesAddMethod(
        type: AddType,
        ownerId: Long? = null,
        itemId: Long,
        accessKey: String? = null
) : VkMethod<AddResponse>(
    "likes.add",
    mutableMapOf(),
    object : TypeReference<VkSuccess<AddResponse>>() {}
), UserMethod {

    var type: AddType by props
    var ownerId: Long? by props
    var itemId: Long by props
    var accessKey: String? by props

    init {
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
}
