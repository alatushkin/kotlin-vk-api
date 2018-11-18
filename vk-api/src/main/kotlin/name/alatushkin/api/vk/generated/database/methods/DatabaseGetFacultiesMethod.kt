package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.database.Faculty

/**
 *  Returns a list of faculties (i.e., university departments).
 *
 *  [https://vk.com/dev/database.getFaculties]
 *  @property [university_id] University ID.
 *  @property [offset] Offset needed to return a specific subset of faculties.
 *  @property [count] Number of faculties to return.
 */
class DatabaseGetFacultiesMethod() : VkMethod<VkList<Faculty>>(
    "database.getFaculties",
    HashMap()
) {

    var universityId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        universityId: Long? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
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

    override val classRef = DatabaseGetFacultiesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Faculty>>>() {}
    }
}
