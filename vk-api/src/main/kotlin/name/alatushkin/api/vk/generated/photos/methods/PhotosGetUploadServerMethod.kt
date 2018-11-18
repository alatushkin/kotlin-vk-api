package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.PhotoUpload

/**
 *  Returns the server address for photo upload.
 *
 *  [https://vk.com/dev/photos.getUploadServer]
 *  @property [album_id] Album ID.
 *  @property [group_id] ID of community that owns the album (if the photo will be uploaded to a community album).
 */
class PhotosGetUploadServerMethod() : VkMethod<PhotoUpload>(
    "photos.getUploadServer",
    HashMap()
) {

    var albumId: Long? by props
    var groupId: Long? by props

    constructor(
        albumId: Long? = null,
        groupId: Long? = null
    ) : this() {
        this.albumId = albumId
        this.groupId = groupId
    }

    fun setAlbumId(albumId: Long): PhotosGetUploadServerMethod {
        this.albumId = albumId
        return this
    }

    fun setGroupId(groupId: Long): PhotosGetUploadServerMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = PhotosGetUploadServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<PhotoUpload>>() {}
    }
}
