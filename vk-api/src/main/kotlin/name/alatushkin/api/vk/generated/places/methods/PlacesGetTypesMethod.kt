package name.alatushkin.api.vk.generated.places.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.places.Types

/**
 *  Returns a list of all types of locations.
 *
 *  [https://vk.com/dev/places.getTypes]

 */
class PlacesGetTypesMethod : VkMethod<Array<Types>>(
    "places.getTypes",
    HashMap()
) {
    override val classRef = PlacesGetTypesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Types>>>() {}
    }
}
