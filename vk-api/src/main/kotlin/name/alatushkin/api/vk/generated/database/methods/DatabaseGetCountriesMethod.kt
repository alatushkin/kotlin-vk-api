@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.common.Country
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getCountries]
 *
 * Returns a list of countries.
 *
 * @property needAll '1' — to return a full list of all countries, '0' — to return a list of countries near the current user's country (default).
 * @property code Country codes in [vk.com/dev/country_codes|ISO 3166-1 alpha-2] standard.
 * @property offset Offset needed to return a specific subset of countries.
 * @property count Number of countries to return.
 */
class DatabaseGetCountriesMethod(
    needAll: Boolean? = null,
    code: String? = null,
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<Country>>(
    "database.getCountries",
    mutableMapOf(),
    successReference()
), UserServiceMethod {

    var needAll: Boolean? by props
    var code: String? by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.needAll = needAll
        this.code = code
        this.offset = offset
        this.count = count
    }
}
