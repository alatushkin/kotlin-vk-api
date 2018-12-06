@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.places.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.places.Types
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod
