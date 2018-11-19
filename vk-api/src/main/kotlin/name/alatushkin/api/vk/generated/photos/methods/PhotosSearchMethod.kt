package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.Photo

/**
 *  Returns a list of photos.
 *
 *  [https://vk.com/dev/photos.search]
 *  @property [q] Search query string.
 *  @property [lat] Geographical latitude, in degrees (from '-90' to '90').
 *  @property [long] Geographical longitude, in degrees (from '-180' to '180').
 *  @property [start_time] 
 *  @property [end_time] 
 *  @property [sort] Sort order:
 *  @property [offset] Offset needed to return a specific subset of photos.
 *  @property [count] Number of photos to return.
 *  @property [radius] Radius of search in meters (works very approximately). Available values: '10', '100', '800', '6000', '50000'.
 */
class PhotosSearchMethod() : VkMethod<VkList<Photo>>(
    "photos.search",
    HashMap()
) {

    var q: String? by props
    var lat: Long? by props
    var long: Long? by props
    var startTime: Long? by props
    var endTime: Long? by props
    var sort: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var radius: Long? by props

    constructor(
        q: String? = null,
        lat: Long? = null,
        long: Long? = null,
        startTime: Long? = null,
        endTime: Long? = null,
        sort: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        radius: Long? = null
    ) : this() {
        this.q = q
        this.lat = lat
        this.long = long
        this.startTime = startTime
        this.endTime = endTime
        this.sort = sort
        this.offset = offset
        this.count = count
        this.radius = radius
    }

    fun setQ(q: String): PhotosSearchMethod {
        this.q = q
        return this
    }

    fun setLat(lat: Long): PhotosSearchMethod {
        this.lat = lat
        return this
    }

    fun setLong(long: Long): PhotosSearchMethod {
        this.long = long
        return this
    }

    fun setStartTime(startTime: Long): PhotosSearchMethod {
        this.startTime = startTime
        return this
    }

    fun setEndTime(endTime: Long): PhotosSearchMethod {
        this.endTime = endTime
        return this
    }

    fun setSort(sort: Long): PhotosSearchMethod {
        this.sort = sort
        return this
    }

    fun setOffset(offset: Long): PhotosSearchMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): PhotosSearchMethod {
        this.count = count
        return this
    }

    fun setRadius(radius: Long): PhotosSearchMethod {
        this.radius = radius
        return this
    }

    override val classRef = PhotosSearchMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Photo>>>() {}
    }
}
