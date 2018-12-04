package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.database.Region

/**
 *  Returns a list of regions.
 *
 *  [https://vk.com/dev/database.getRegions]
 *  @property [country_id] Country ID, received in [vk.com/dev/database.getCountries|database.getCountries] method.
 *  @property [q] Search query.
 *  @property [offset] Offset needed to return specific subset of regions.
 *  @property [count] Number of regions to return.
 */
class DatabaseGetRegionsMethod() : VkMethod<VkList<Region>>(
    "database.getRegions",
    HashMap()
) {

    var countryId: Long? by props
    var q: String? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        countryId: Long? = null,
        q: String? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
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

    override val classRef = DatabaseGetRegionsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<Region>>>() {}
    }
}
