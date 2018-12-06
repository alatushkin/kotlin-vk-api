@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.storage.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/storage.getKeys]
 *
 * Returns the names of all variables.
 *
 * @property userId user id, whose variables names are returned if they were requested with a server method.
 * @property count amount of variable names the info needs to be collected from.
 */
class StorageGetKeysMethod(
    userId: Long? = null,
    count: Long? = null
) : VkMethod<Array<String>>(
    "storage.getKeys",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long? by props
    var count: Long? by props

    init {
        this.userId = userId
        this.count = count
    }
}
