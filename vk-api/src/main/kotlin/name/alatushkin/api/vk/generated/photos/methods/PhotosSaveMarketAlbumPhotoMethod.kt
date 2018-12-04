package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.photos.Photo

/**
 *  Saves market album photos after successful uploading.
 *
 *  [https://vk.com/dev/photos.saveMarketAlbumPhoto]
 *  @property [group_id] Community ID.
 *  @property [photo] Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 *  @property [server] Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 *  @property [hash] Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 */
class PhotosSaveMarketAlbumPhotoMethod() : VkMethod<Array<Photo>>(
    "photos.saveMarketAlbumPhoto",
    HashMap()
) {

    var groupId: Long? by props
    var photo: String? by props
    var server: Long? by props
    var hash: String? by props

    constructor(
        groupId: Long? = null,
        photo: String? = null,
        server: Long? = null,
        hash: String? = null
    ) : this() {
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

    override val classRef = PhotosSaveMarketAlbumPhotoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Photo>>>() {}
    }
}
