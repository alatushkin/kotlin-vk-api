@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getAlbumsCount]
 *
 * Returns the number of photo albums belonging to a user or community.
 *
 * @property userId User ID.
 * @property groupId Community ID.
 */
class PhotosGetAlbumsCountMethod(
        userId: Long? = null,
        groupId: Long? = null
) : VkMethod<Long>(
    "photos.getAlbumsCount",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Long>>() {}
), UserMethod {

    var userId: Long? by props
    var groupId: Long? by props

    init {
        this.userId = userId
        this.groupId = groupId
    }

    fun setUserId(userId: Long): PhotosGetAlbumsCountMethod {
        this.userId = userId
        return this
    }

    fun setGroupId(groupId: Long): PhotosGetAlbumsCountMethod {
        this.groupId = groupId
        return this
    }
}
