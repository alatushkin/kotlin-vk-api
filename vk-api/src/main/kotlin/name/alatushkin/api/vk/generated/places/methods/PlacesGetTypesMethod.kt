@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.places.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.places.Types
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/places.getTypes]
 *
 * Returns a list of all types of locations.
 *

 */
class PlacesGetTypesMethod : VkMethod<Array<Types>>(
    "places.getTypes",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<Types>>>() {}
), UserMethod
