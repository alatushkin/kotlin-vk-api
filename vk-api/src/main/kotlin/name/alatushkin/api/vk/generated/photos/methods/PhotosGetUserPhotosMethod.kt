package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.Photo

/**
 *  Returns a list of photos in which a user is tagged.
 *
 *  [https://vk.com/dev/photos.getUserPhotos]
 *  @property [user_id] User ID.
 *  @property [offset] Offset needed to return a specific subset of photos. By default, '0'.
 *  @property [count] Number of photos to return. Maximum value is 1000.
 *  @property [extended] '1' — to return an additional 'likes' field, '0' — (default)
 *  @property [sort] Sort order: '1' — by date the tag was added in ascending order, '0' — by date the tag was added in descending order
 */
class PhotosGetUserPhotosMethod() : VkMethod<VkList<Photo>>(
    "photos.getUserPhotos",
    HashMap()
) {

    var userId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var extended: Boolean? by props
    var sort: String? by props

    constructor(
        userId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        extended: Boolean? = null,
        sort: String? = null
    ) : this() {
        this.userId = userId
        this.offset = offset
        this.count = count
        this.extended = extended
        this.sort = sort
    }

    fun setUserId(userId: Long): PhotosGetUserPhotosMethod {
        this.userId = userId
        return this
    }

    fun setOffset(offset: Long): PhotosGetUserPhotosMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): PhotosGetUserPhotosMethod {
        this.count = count
        return this
    }

    fun setExtended(extended: Boolean): PhotosGetUserPhotosMethod {
        this.extended = extended
        return this
    }

    fun setSort(sort: String): PhotosGetUserPhotosMethod {
        this.sort = sort
        return this
    }

    override val classRef = PhotosGetUserPhotosMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Photo>>>() {}
    }
}
