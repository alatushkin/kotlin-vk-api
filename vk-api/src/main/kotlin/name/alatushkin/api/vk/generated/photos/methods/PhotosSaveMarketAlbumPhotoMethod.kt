@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.saveMarketAlbumPhoto]
 *
 * Saves market album photos after successful uploading.
 *
 * @property groupId Community ID.
 * @property photo Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property server Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 */
class PhotosSaveMarketAlbumPhotoMethod(
        groupId: Long,
        photo: String,
        server: Long,
        hash: String
) : VkMethod<Array<Photo>>(
    "photos.saveMarketAlbumPhoto",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<Photo>>>() {}
), UserMethod {

    var groupId: Long by props
    var photo: String by props
    var server: Long by props
    var hash: String by props

    init {
        this.groupId = groupId
        this.photo = photo
        this.server = server
        this.hash = hash
    }

    fun setGroupId(groupId: Long): PhotosSaveMarketAlbumPhotoMethod {
        this.groupId = groupId
        return this
    }

    fun setPhoto(photo: String): PhotosSaveMarketAlbumPhotoMethod {
        this.photo = photo
        return this
    }

    fun setServer(server: Long): PhotosSaveMarketAlbumPhotoMethod {
        this.server = server
        return this
    }

    fun setHash(hash: String): PhotosSaveMarketAlbumPhotoMethod {
        this.hash = hash
        return this
    }
}
