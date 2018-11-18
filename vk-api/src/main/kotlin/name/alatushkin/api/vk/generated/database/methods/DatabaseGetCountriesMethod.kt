package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.Country

/**
 *  Returns a list of countries.
 *
 *  [https://vk.com/dev/database.getCountries]
 *  @property [need_all] '1' — to return a full list of all countries, '0' — to return a list of countries near the current user's country (default).
 *  @property [code] Country codes in [vk.com/dev/country_codes|ISO 3166-1 alpha-2] standard.
 *  @property [offset] Offset needed to return a specific subset of countries.
 *  @property [count] Number of countries to return.
 */
class DatabaseGetCountriesMethod() : VkMethod<VkList<Country>>(
    "database.getCountries",
    HashMap()
) {

    var needAll: Boolean? by props
    var code: String? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        needAll: Boolean? = null,
        code: String? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
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

    override val classRef = DatabaseGetCountriesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Country>>>() {}
    }
}
