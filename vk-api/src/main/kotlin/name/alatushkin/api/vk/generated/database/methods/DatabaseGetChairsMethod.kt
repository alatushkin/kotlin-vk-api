package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.Object

/**
 *  Returns list of chairs on a specified faculty.
 *
 *  [https://vk.com/dev/database.getChairs]
 *  @property [faculty_id] id of the faculty to get chairs from
 *  @property [offset] offset required to get a certain subset of chairs
 *  @property [count] amount of chairs to get
 */
class DatabaseGetChairsMethod() : VkMethod<VkList<Object>>(
    "database.getChairs",
    HashMap()
) {

    var facultyId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        facultyId: Long? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
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

    override val classRef = DatabaseGetChairsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Object>>>() {}
    }
}
