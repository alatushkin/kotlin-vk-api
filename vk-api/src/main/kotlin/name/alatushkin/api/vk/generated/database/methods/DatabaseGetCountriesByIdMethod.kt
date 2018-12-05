@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.Country
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
    object : TypeReference<VkResponse<Array<Country>>>() {}
), UserServiceMethod {

    var countryIds: Array<Long>? by props

    init {
        this.countryIds = countryIds
    }

    fun setCountryIds(countryIds: Array<Long>): DatabaseGetCountriesByIdMethod {
        this.countryIds = countryIds
        return this
    }
}
