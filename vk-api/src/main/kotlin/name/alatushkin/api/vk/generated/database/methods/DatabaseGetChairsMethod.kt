@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.common.Object
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserServiceMethod {

    var facultyId: Long by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.facultyId = facultyId
        this.offset = offset
        this.count = count
    }
}
