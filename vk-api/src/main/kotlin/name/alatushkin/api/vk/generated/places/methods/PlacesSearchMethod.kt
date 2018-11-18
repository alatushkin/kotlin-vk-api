package name.alatushkin.api.vk.generated.places.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.places.PlaceFull
import name.alatushkin.api.vk.generated.places.SearchRadius

/**
 *  Returns a list of locations that match the search criteria.
 *
 *  [https://vk.com/dev/places.search]
 *  @property [q] Search query string.
 *  @property [city] City ID.
 *  @property [latitude] Geographical latitude of the initial search point, in degrees (from '-90' to '90').
 *  @property [longitude] Geographical longitude of the initial search point, in degrees (from '-180' to '180').
 *  @property [radius] Radius of the search zone: '1' — 100 m. (default), '2' — 800 m. '3' — 6 km. '4' — 50 km.
 *  @property [offset] Offset needed to return a specific subset of locations.
 *  @property [count] Number of locations to return.
 */
class PlacesSearchMethod() : VkMethod<VkList<PlaceFull>>(
    "places.search",
    HashMap()
) {

    var q: String? by props
    var city: Long? by props
    var latitude: Long? by props
    var longitude: Long? by props
    var radius: SearchRadius? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        q: String? = null,
        city: Long? = null,
        latitude: Long? = null,
        longitude: Long? = null,
        radius: SearchRadius? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.q = q
        this.city = city
        this.latitude = latitude
        this.longitude = longitude
        this.radius = radius
        this.offset = offset
        this.count = count
    }

    fun setQ(q: String): PlacesSearchMethod {
        this.q = q
        return this
    }

    fun setCity(city: Long): PlacesSearchMethod {
        this.city = city
        return this
    }

    fun setLatitude(latitude: Long): PlacesSearchMethod {
        this.latitude = latitude
        return this
    }

    fun setLongitude(longitude: Long): PlacesSearchMethod {
        this.longitude = longitude
        return this
    }

    fun setRadius(radius: SearchRadius): PlacesSearchMethod {
        this.radius = radius
        return this
    }

    fun setOffset(offset: Long): PlacesSearchMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): PlacesSearchMethod {
        this.count = count
        return this
    }

    override val classRef = PlacesSearchMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<PlaceFull>>>() {}
    }
}
