@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.storage.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var key: String by props
    var value: String? by props
    var userId: Long? by props

    init {
        this.key = key
        this.value = value
        this.userId = userId
    }

    fun setKey(key: String): StorageSetMethod {
        this.key = key
        return this
    }

    fun setValue(value: String): StorageSetMethod {
        this.value = value
        return this
    }

    fun setUserId(userId: Long): StorageSetMethod {
        this.userId = userId
        return this
    }
}
