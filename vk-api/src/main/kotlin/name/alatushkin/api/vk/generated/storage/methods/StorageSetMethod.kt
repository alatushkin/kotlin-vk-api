@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.storage.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/storage.set]
 *
 * Saves a value of variable with the name set by 'key' parameter.
 *
 * @property key 
 * @property value 
 * @property userId 
 */
class StorageSetMethod(
    key: String,
    value: String? = null,
    userId: Long? = null
) : VkMethod<Boolean>(
    "storage.set",
    mutableMapOf(),
    successReference()
), UserMethod {

    var key: String by props
    var value: String? by props
    var userId: Long? by props

    init {
        this.key = key
        this.value = value
        this.userId = userId
    }
}
