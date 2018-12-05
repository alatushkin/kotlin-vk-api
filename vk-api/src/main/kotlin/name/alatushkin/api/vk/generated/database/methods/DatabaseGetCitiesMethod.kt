@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.database.City
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getCities]
 *
 * Returns a list of cities.
 *
 * @property countryId Country ID.
 * @property regionId Region ID.
 * @property q Search query.
 * @property needAll '1' — to return all cities in the country, '0' — to return major cities in the country (default),
 * @property offset Offset needed to return a specific subset of cities.
 * @property count Number of cities to return.
 */
class DatabaseGetCitiesMethod(
        countryId: Long,
        regionId: Long? = null,
        q: String? = null,
        needAll: Boolean? = null,
        offset: Long? = null,
        count: Long? = null
) : VkMethod<VkList<City>>(
    "database.getCities",
    mutableMapOf(),
    object : TypeReference<VkResponse<VkList<City>>>() {}
), UserServiceMethod {

    var countryId: Long by props
    var regionId: Long? by props
    var q: String? by props
    var needAll: Boolean? by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.countryId = countryId
        this.regionId = regionId
        this.q = q
        this.needAll = needAll
        this.offset = offset
        this.count = count
    }

    fun setCountryId(countryId: Long): DatabaseGetCitiesMethod {
        this.countryId = countryId
        return this
    }

    fun setRegionId(regionId: Long): DatabaseGetCitiesMethod {
        this.regionId = regionId
        return this
    }

    fun setQ(q: String): DatabaseGetCitiesMethod {
        this.q = q
        return this
    }

    fun setNeedAll(needAll: Boolean): DatabaseGetCitiesMethod {
        this.needAll = needAll
        return this
    }

    fun setOffset(offset: Long): DatabaseGetCitiesMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): DatabaseGetCitiesMethod {
        this.count = count
        return this
    }
}
