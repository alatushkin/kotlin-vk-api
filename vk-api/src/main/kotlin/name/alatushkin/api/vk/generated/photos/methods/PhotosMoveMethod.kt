package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Moves a photo from one album to another.
 *
 *  [https://vk.com/dev/photos.move]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [target_album_id] ID of the album to which the photo will be moved.
 *  @property [photo_id] Photo ID.
 */
class PhotosMoveMethod() : VkMethod<Boolean>(
    "photos.move",
    HashMap()
) {

    var ownerId: Long? by props
    var targetAlbumId: Long? by props
    var photoId: Long? by props

    constructor(
        ownerId: Long? = null,
        targetAlbumId: Long? = null,
        photoId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.targetAlbumId = targetAlbumId
        this.photoId = photoId
    }

    fun setOwnerId(ownerId: Long): PhotosMoveMethod {
        this.ownerId = ownerId
        return this
    }

    fun setTargetAlbumId(targetAlbumId: Long): PhotosMoveMethod {
        this.targetAlbumId = targetAlbumId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosMoveMethod {
        this.photoId = photoId
        return this
    }

    override val classRef = PhotosMoveMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
