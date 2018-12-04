package name.alatushkin.api.vk.generated.places.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.places.PlaceMin

/**
 *  Returns information about locations by their IDs.
 *
 *  [https://vk.com/dev/places.getById]
 *  @property [places] Location IDs.
 */
class PlacesGetByIdMethod() : VkMethod<Array<PlaceMin>>(
    "places.getById",
    HashMap()
) {

    var places: Array<Long>? by props

    constructor(
        places: Array<Long>? = null
    ) : this() {
        this.places = places
    }

    fun setPlaces(places: Array<Long>): PlacesGetByIdMethod {
        this.places = places
        return this
    }

    override val classRef = PlacesGetByIdMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<PlaceMin>>>() {}
    }
}
