@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.database.Region
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getRegions]
 *
 * Returns a list of regions.
 *
 * @property countryId Country ID, received in [vk.com/dev/database.getCountries|database.getCountries] method.
 * @property q Search query.
 * @property offset Offset needed to return specific subset of regions.
 * @property count Number of regions to return.
 */
class DatabaseGetRegionsMethod(
        countryId: Long,
        q: String? = null,
        offset: Long? = null,
        count: Long? = null
) : VkMethod<VkList<Region>>(
    "database.getRegions",
    mutableMapOf(),
    object : TypeReference<VkResponse<VkList<Region>>>() {}
), UserServiceMethod {

    var countryId: Long by props
    var q: String? by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.countryId = countryId
        this.q = q
        this.offset = offset
        this.count = count
    }

    fun setCountryId(countryId: Long): DatabaseGetRegionsMethod {
        this.countryId = countryId
        return this
    }

    fun setQ(q: String): DatabaseGetRegionsMethod {
        this.q = q
        return this
    }

    fun setOffset(offset: Long): DatabaseGetRegionsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): DatabaseGetRegionsMethod {
        this.count = count
        return this
    }
}
