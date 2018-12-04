package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.database.School

/**
 *  Returns a list of schools.
 *
 *  [https://vk.com/dev/database.getSchools]
 *  @property [q] Search query.
 *  @property [city_id] City ID.
 *  @property [offset] Offset needed to return a specific subset of schools.
 *  @property [count] Number of schools to return.
 */
class DatabaseGetSchoolsMethod() : VkMethod<VkList<School>>(
    "database.getSchools",
    HashMap()
) {

    var q: String? by props
    var cityId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        q: String? = null,
        cityId: Long? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.q = q
        this.cityId = cityId
        this.offset = offset
        this.count = count
    }

    fun setQ(q: String): DatabaseGetSchoolsMethod {
        this.q = q
        return this
    }

    fun setCityId(cityId: Long): DatabaseGetSchoolsMethod {
        this.cityId = cityId
        return this
    }

    fun setOffset(offset: Long): DatabaseGetSchoolsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): DatabaseGetSchoolsMethod {
        this.count = count
        return this
    }

    override val classRef = DatabaseGetSchoolsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<School>>>() {}
    }
}
