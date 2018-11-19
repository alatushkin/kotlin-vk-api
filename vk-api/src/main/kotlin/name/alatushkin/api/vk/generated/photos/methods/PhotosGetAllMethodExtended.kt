package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.GetAllExtendedResponse

/**
 *  Returns a list of photos belonging to a user or community, in reverse chronological order.
 *
 *  [https://vk.com/dev/photos.getAll]
 *  @property [owner_id] ID of a user or community that owns the photos. Use a negative value to designate a community ID.
 *  @property [offset] Offset needed to return a specific subset of photos. By default, '0'.
 *  @property [count] Number of photos to return.
 *  @property [photo_sizes] '1' – to return image sizes in [vk.com/dev/photo_sizes|special format].
 *  @property [no_service_albums] '1' – to return photos only from standard albums, '0' – to return all photos including those in service albums, e.g., 'My wall photos' (default)
 *  @property [need_hidden] '1' – to show information about photos being hidden from the block above the wall.
 *  @property [skip_hidden] '1' – not to return photos being hidden from the block above the wall. Works only with owner_id>0, no_service_albums is ignored.
 */
class PhotosGetAllMethodExtended() : VkMethod<GetAllExtendedResponse>(
    "photos.getAll",
    mutableMapOf("extended" to "1")
) {

    var ownerId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var photoSizes: Boolean? by props
    var noServiceAlbums: Boolean? by props
    var needHidden: Boolean? by props
    var skipHidden: Boolean? by props

    constructor(
        ownerId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        photoSizes: Boolean? = null,
        noServiceAlbums: Boolean? = null,
        needHidden: Boolean? = null,
        skipHidden: Boolean? = null
    ) : this() {
        this.ownerId = ownerId
        this.offset = offset
        this.count = count
        this.photoSizes = photoSizes
        this.noServiceAlbums = noServiceAlbums
        this.needHidden = needHidden
        this.skipHidden = skipHidden
    }

    fun setOwnerId(ownerId: Long): PhotosGetAllMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setOffset(offset: Long): PhotosGetAllMethodExtended {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): PhotosGetAllMethodExtended {
        this.count = count
        return this
    }

    fun setPhotoSizes(photoSizes: Boolean): PhotosGetAllMethodExtended {
        this.photoSizes = photoSizes
        return this
    }

    fun setNoServiceAlbums(noServiceAlbums: Boolean): PhotosGetAllMethodExtended {
        this.noServiceAlbums = noServiceAlbums
        return this
    }

    fun setNeedHidden(needHidden: Boolean): PhotosGetAllMethodExtended {
        this.needHidden = needHidden
        return this
    }

    fun setSkipHidden(skipHidden: Boolean): PhotosGetAllMethodExtended {
        this.skipHidden = skipHidden
        return this
    }

    override val classRef = PhotosGetAllMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GetAllExtendedResponse>>() {}
    }
}
