@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.UploadServer
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getMarketAlbumUploadServer]
 *
 * Returns the server address for market album photo upload.
 *
 * @property groupId Community ID.
 */
class PhotosGetMarketAlbumUploadServerMethod(
        groupId: Long
) : VkMethod<UploadServer>(
    "photos.getMarketAlbumUploadServer",
    mutableMapOf(),
    object : TypeReference<VkResponse<UploadServer>>() {}
), UserMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): PhotosGetMarketAlbumUploadServerMethod {
        this.groupId = groupId
        return this
    }
}
