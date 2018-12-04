@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.saveMarketPhoto]
 *
 * Saves market photos after successful uploading.
 *
 * @property groupId Community ID.
 * @property photo Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property server Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property cropData Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property cropHash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 */
class PhotosSaveMarketPhotoMethod(
        groupId: Long? = null,
        photo: String,
        server: Long,
        hash: String,
        cropData: String? = null,
        cropHash: String? = null
) : VkMethod<Array<Photo>>(
    "photos.saveMarketPhoto",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Array<Photo>>>() {}
), UserMethod {

    var groupId: Long? by props
    var photo: String by props
    var server: Long by props
    var hash: String by props
    var cropData: String? by props
    var cropHash: String? by props

    init {
        this.groupId = groupId
        this.photo = photo
        this.server = server
        this.hash = hash
        this.cropData = cropData
        this.cropHash = cropHash
    }

    fun setGroupId(groupId: Long): PhotosSaveMarketPhotoMethod {
        this.groupId = groupId
        return this
    }

    fun setPhoto(photo: String): PhotosSaveMarketPhotoMethod {
        this.photo = photo
        return this
    }

    fun setServer(server: Long): PhotosSaveMarketPhotoMethod {
        this.server = server
        return this
    }

    fun setHash(hash: String): PhotosSaveMarketPhotoMethod {
        this.hash = hash
        return this
    }

    fun setCropData(cropData: String): PhotosSaveMarketPhotoMethod {
        this.cropData = cropData
        return this
    }

    fun setCropHash(cropHash: String): PhotosSaveMarketPhotoMethod {
        this.cropHash = cropHash
        return this
    }
}
