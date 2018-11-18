package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.PhotoAlbumFull

/**
 *  Returns a list of a user's or community's photo albums.
 *
 *  [https://vk.com/dev/photos.getAlbums]
 *  @property [owner_id] ID of the user or community that owns the albums.
 *  @property [album_ids] Album IDs.
 *  @property [offset] Offset needed to return a specific subset of albums.
 *  @property [count] Number of albums to return.
 *  @property [need_system] '1' — to return system albums with negative IDs
 *  @property [need_covers] '1' — to return an additional 'thumb_src' field, '0' — (default)
 *  @property [photo_sizes] '1' — to return photo sizes in a
 */
class PhotosGetAlbumsMethod() : VkMethod<VkList<PhotoAlbumFull>>(
    "photos.getAlbums",
    HashMap()
) {

    var ownerId: Long? by props
    var albumIds: Array<Long>? by props
    var offset: Long? by props
    var count: Long? by props
    var needSystem: Boolean? by props
    var needCovers: Boolean? by props
    var photoSizes: Boolean? by props

    constructor(
        ownerId: Long? = null,
        albumIds: Array<Long>? = null,
        offset: Long? = null,
        count: Long? = null,
        needSystem: Boolean? = null,
        needCovers: Boolean? = null,
        photoSizes: Boolean? = null
    ) : this() {
        this.ownerId = ownerId
        this.albumIds = albumIds
        this.offset = offset
        this.count = count
        this.needSystem = needSystem
        this.needCovers = needCovers
        this.photoSizes = photoSizes
    }

    fun setOwnerId(ownerId: Long): PhotosGetAlbumsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumIds(albumIds: Array<Long>): PhotosGetAlbumsMethod {
        this.albumIds = albumIds
        return this
    }

    fun setOffset(offset: Long): PhotosGetAlbumsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): PhotosGetAlbumsMethod {
        this.count = count
        return this
    }

    fun setNeedSystem(needSystem: Boolean): PhotosGetAlbumsMethod {
        this.needSystem = needSystem
        return this
    }

    fun setNeedCovers(needCovers: Boolean): PhotosGetAlbumsMethod {
        this.needCovers = needCovers
        return this
    }

    fun setPhotoSizes(photoSizes: Boolean): PhotosGetAlbumsMethod {
        this.photoSizes = photoSizes
        return this
    }

    override val classRef = PhotosGetAlbumsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<PhotoAlbumFull>>>() {}
    }
}
