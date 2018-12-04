@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.Object
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getChairs]
 *
 * Returns list of chairs on a specified faculty.
 *
 * @property facultyId id of the faculty to get chairs from
 * @property offset offset required to get a certain subset of chairs
 * @property count amount of chairs to get
 */
class DatabaseGetChairsMethod(
        facultyId: Long,
        offset: Long? = null,
        count: Long? = null
) : VkMethod<VkList<Object>>(
    "database.getChairs",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<Object>>>() {}
), UserServiceMethod {

    var facultyId: Long by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.facultyId = facultyId
        this.offset = offset
        this.count = count
    }

    fun setFacultyId(facultyId: Long): DatabaseGetChairsMethod {
        this.facultyId = facultyId
        return this
    }

    fun setOffset(offset: Long): DatabaseGetChairsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): DatabaseGetChairsMethod {
        this.count = count
        return this
    }
}
