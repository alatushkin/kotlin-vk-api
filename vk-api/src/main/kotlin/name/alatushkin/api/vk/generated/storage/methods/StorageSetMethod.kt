package name.alatushkin.api.vk.generated.storage.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Saves a value of variable with the name set by 'key' parameter.
 *
 *  [https://vk.com/dev/storage.set]
 *  @property [key]
 *  @property [value]
 *  @property [user_id]
 */
class StorageSetMethod() : VkMethod<Boolean>(
    "storage.set",
    HashMap()
) {

    var key: String? by props
    var value: String? by props
    var userId: Long? by props

    constructor(
        key: String? = null,
        value: String? = null,
        userId: Long? = null
    ) : this() {
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

    override val classRef = StorageSetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
