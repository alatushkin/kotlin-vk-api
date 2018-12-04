@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.storage.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
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
    object : TypeReference<VkSuccess<String>>() {}
), UserMethod {

    var key: String? by props
    var keys: Array<String>? by props
    var userId: Long? by props

    init {
        this.key = key
        this.keys = keys
        this.userId = userId
    }

    fun setKey(key: String): StorageGetMethod {
        this.key = key
        return this
    }

    fun setKeys(keys: Array<String>): StorageGetMethod {
        this.keys = keys
        return this
    }

    fun setUserId(userId: Long): StorageGetMethod {
        this.userId = userId
        return this
    }
}
