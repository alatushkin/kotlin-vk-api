@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.database.Faculty
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getFaculties]
 *
 * Returns a list of faculties (i.e., university departments).
 *
 * @property universityId University ID.
 * @property offset Offset needed to return a specific subset of faculties.
 * @property count Number of faculties to return.
 */
class DatabaseGetFacultiesMethod(
        universityId: Long,
        offset: Long? = null,
        count: Long? = null
) : VkMethod<VkList<Faculty>>(
    "database.getFaculties",
    mutableMapOf(),
    object : TypeReference<VkResponse<VkList<Faculty>>>() {}
), UserServiceMethod {

    var universityId: Long by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.universityId = universityId
        this.offset = offset
        this.count = count
    }

    fun setUniversityId(universityId: Long): DatabaseGetFacultiesMethod {
        this.universityId = universityId
        return this
    }

    fun setOffset(offset: Long): DatabaseGetFacultiesMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): DatabaseGetFacultiesMethod {
        this.count = count
        return this
    }
}
