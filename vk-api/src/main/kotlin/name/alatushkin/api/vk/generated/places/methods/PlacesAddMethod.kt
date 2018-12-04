package name.alatushkin.api.vk.generated.places.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.places.AddResponse

/**
 *  Adds a new location to the location database.
 *
 *  [https://vk.com/dev/places.add]
 *  @property [type] ID of the location's type (e.g., '1' — Home, '2' — Work). To get location type IDs, use the [vk.com/dev/places.getTypes|places.getTypes] method.
 *  @property [title] Title of the location.
 *  @property [latitude] Geographical latitude, in degrees (from '-90' to '90').
 *  @property [longitude] Geographical longitude, in degrees (from '-180' to '180').
 *  @property [country] ID of the location's country. To get country IDs, use the [vk.com/dev/database.getCountries|database.getCountries] method.
 *  @property [city] ID of the location's city. To get city IDs, use the [vk.com/dev/database.getCities|database.getCities] method.
 *  @property [address] Street address of the location (e.g., '125 Elm Street').
 */
class PlacesAddMethod() : VkMethod<AddResponse>(
    "places.add",
    HashMap()
) {

    var type: Long? by props
    var title: String? by props
    var latitude: Double? by props
    var longitude: Double? by props
    var country: Long? by props
    var city: Long? by props
    var address: String? by props

    constructor(
        type: Long? = null,
        title: String? = null,
        latitude: Double? = null,
        longitude: Double? = null,
        country: Long? = null,
        city: Long? = null,
        address: String? = null
    ) : this() {
        this.type = type
        this.title = title
        this.latitude = latitude
        this.longitude = longitude
        this.country = country
        this.city = city
        this.address = address
    }

    fun setType(type: Long): PlacesAddMethod {
        this.type = type
        return this
    }

    fun setTitle(title: String): PlacesAddMethod {
        this.title = title
        return this
    }

    fun setLatitude(latitude: Double): PlacesAddMethod {
        this.latitude = latitude
        return this
    }

    fun setLongitude(longitude: Double): PlacesAddMethod {
        this.longitude = longitude
        return this
    }

    fun setCountry(country: Long): PlacesAddMethod {
        this.country = country
        return this
    }

    fun setCity(city: Long): PlacesAddMethod {
        this.city = city
        return this
    }

    fun setAddress(address: String): PlacesAddMethod {
        this.address = address
        return this
    }

    override val classRef = PlacesAddMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<AddResponse>>() {}
    }
}
