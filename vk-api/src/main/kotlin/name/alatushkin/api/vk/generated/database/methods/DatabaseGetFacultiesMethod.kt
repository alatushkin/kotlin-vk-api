@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.database.Faculty
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserServiceMethod {

    var universityId: Long by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.universityId = universityId
        this.offset = offset
        this.count = count
    }
}
