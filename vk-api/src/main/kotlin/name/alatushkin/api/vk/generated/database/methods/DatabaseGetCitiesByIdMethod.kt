@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.Object
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getCitiesById]
 *
 * Returns information about cities by their IDs.
 *
 * @property cityIds City IDs.
 */
class DatabaseGetCitiesByIdMethod(
    cityIds: Array<Long>? = null
) : VkMethod<Array<Object>>(
    "database.getCitiesById",
    mutableMapOf(),
    successReference()
), UserServiceMethod {

    var cityIds: Array<Long>? by props

    init {
        this.cityIds = cityIds
    }
}
