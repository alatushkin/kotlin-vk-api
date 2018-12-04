@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.Country
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
    object : TypeReference<VkSuccess<VkList<Country>>>() {}
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

    fun setNeedAll(needAll: Boolean): DatabaseGetCountriesMethod {
        this.needAll = needAll
        return this
    }

    fun setCode(code: String): DatabaseGetCountriesMethod {
        this.code = code
        return this
    }

    fun setOffset(offset: Long): DatabaseGetCountriesMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): DatabaseGetCountriesMethod {
        this.count = count
        return this
    }
}
