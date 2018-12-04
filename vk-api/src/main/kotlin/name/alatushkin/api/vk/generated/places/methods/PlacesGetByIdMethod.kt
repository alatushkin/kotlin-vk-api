@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.places.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.places.PlaceMin
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/places.getById]
 *
 * Returns information about locations by their IDs.
 *
 * @property places Location IDs.
 */
class PlacesGetByIdMethod(
        places: Array<Long>
) : VkMethod<Array<PlaceMin>>(
    "places.getById",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Array<PlaceMin>>>() {}
), UserMethod {

    var places: Array<Long> by props

    init {
        this.places = places
    }

    fun setPlaces(places: Array<Long>): PlacesGetByIdMethod {
        this.places = places
        return this
    }
}
