@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.database.School
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getSchools]
 *
 * Returns a list of schools.
 *
 * @property q Search query.
 * @property cityId City ID.
 * @property offset Offset needed to return a specific subset of schools.
 * @property count Number of schools to return.
 */
class DatabaseGetSchoolsMethod(
        q: String? = null,
        cityId: Long,
        offset: Long? = null,
        count: Long? = null
) : VkMethod<VkList<School>>(
    "database.getSchools",
    mutableMapOf(),
    object : TypeReference<VkResponse<VkList<School>>>() {}
), UserServiceMethod {

    var q: String? by props
    var cityId: Long by props
    var offset: Long? by props
    var count: Long? by props

    init {
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
}
