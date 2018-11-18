package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Deletes a photo album belonging to the current user.
 *
 *  [https://vk.com/dev/photos.deleteAlbum]
 *  @property [album_id] Album ID.
 *  @property [group_id] ID of the community that owns the album.
 */
class PhotosDeleteAlbumMethod() : VkMethod<Boolean>(
    "photos.deleteAlbum",
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

    fun setAlbumId(albumId: Long): PhotosDeleteAlbumMethod {
        this.albumId = albumId
        return this
    }

    fun setGroupId(groupId: Long): PhotosDeleteAlbumMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = PhotosDeleteAlbumMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
