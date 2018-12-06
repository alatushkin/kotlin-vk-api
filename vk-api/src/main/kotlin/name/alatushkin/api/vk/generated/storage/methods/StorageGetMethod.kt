@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.storage.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/storage.get]
 *
 * Returns a value of variable with the name set by key parameter.
 *
 * @property key 
 * @property keys 
 * @property userId 
 */
class StorageGetMethod(
    key: String? = null,
    keys: Array<String>? = null,
    userId: Long? = null
) : VkMethod<String>(
    "storage.get",
    mutableMapOf(),
    successReference()
), UserMethod {

    var key: String? by props
    var keys: Array<String>? by props
    var userId: Long? by props

    init {
        this.key = key
        this.keys = keys
        this.userId = userId
    }
}
