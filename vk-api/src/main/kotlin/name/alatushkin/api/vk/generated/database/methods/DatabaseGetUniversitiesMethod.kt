package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.database.University

/**
 *  Returns a list of higher education institutions.
 *
 *  [https://vk.com/dev/database.getUniversities]
 *  @property [q] Search query.
 *  @property [country_id] Country ID.
 *  @property [city_id] City ID.
 *  @property [offset] Offset needed to return a specific subset of universities.
 *  @property [count] Number of universities to return.
 */
class DatabaseGetUniversitiesMethod() : VkMethod<VkList<University>>(
    "database.getUniversities",
    HashMap()
) {

    var q: String? by props
    var countryId: Long? by props
    var cityId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        q: String? = null,
        countryId: Long? = null,
        cityId: Long? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.q = q
        this.countryId = countryId
        this.cityId = cityId
        this.offset = offset
        this.count = count
    }

    fun setQ(q: String): DatabaseGetUniversitiesMethod {
        this.q = q
        return this
    }

    fun setCountryId(countryId: Long): DatabaseGetUniversitiesMethod {
        this.countryId = countryId
        return this
    }

    fun setCityId(cityId: Long): DatabaseGetUniversitiesMethod {
        this.cityId = cityId
        return this
    }

    fun setOffset(offset: Long): DatabaseGetUniversitiesMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): DatabaseGetUniversitiesMethod {
        this.count = count
        return this
    }

    override val classRef = DatabaseGetUniversitiesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<University>>>() {}
    }
}
