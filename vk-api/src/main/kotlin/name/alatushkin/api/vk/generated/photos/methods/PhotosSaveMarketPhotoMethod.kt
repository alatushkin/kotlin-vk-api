package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.photos.Photo

/**
 *  Saves market photos after successful uploading.
 *
 *  [https://vk.com/dev/photos.saveMarketPhoto]
 *  @property [group_id] Community ID.
 *  @property [photo] Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 *  @property [server] Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 *  @property [hash] Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 *  @property [crop_data] Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 *  @property [crop_hash] Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 */
class PhotosSaveMarketPhotoMethod() : VkMethod<Array<Photo>>(
    "photos.saveMarketPhoto",
    HashMap()
) {

    var groupId: Long? by props
    var photo: String? by props
    var server: Long? by props
    var hash: String? by props
    var cropData: String? by props
    var cropHash: String? by props

    constructor(
        groupId: Long? = null,
        photo: String? = null,
        server: Long? = null,
        hash: String? = null,
        cropData: String? = null,
        cropHash: String? = null
    ) : this() {
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

    override val classRef = PhotosSaveMarketPhotoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Photo>>>() {}
    }
}
