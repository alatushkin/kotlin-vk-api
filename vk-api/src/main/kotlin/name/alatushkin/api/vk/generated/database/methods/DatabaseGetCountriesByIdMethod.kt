@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.Country
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getCountriesById]
 *
 * Returns information about countries by their IDs.
 *
 * @property countryIds Country IDs.
 */
class DatabaseGetCountriesByIdMethod(
    countryIds: Array<Long>? = null
) : VkMethod<Array<Country>>(
    "database.getCountriesById",
    mutableMapOf(),
    successReference()
), UserServiceMethod {

    var countryIds: Array<Long>? by props

    init {
        this.countryIds = countryIds
    }
}
