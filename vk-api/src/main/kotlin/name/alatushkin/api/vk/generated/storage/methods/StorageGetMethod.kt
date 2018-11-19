package name.alatushkin.api.vk.generated.storage.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Returns a value of variable with the name set by key parameter.
 *
 *  [https://vk.com/dev/storage.get]
 *  @property [key]
 *  @property [keys]
 *  @property [user_id]
 */
class StorageGetMethod() : VkMethod<String>(
    "storage.get",
    HashMap()
) {

    var key: String? by props
    var keys: Array<String>? by props
    var userId: Long? by props

    constructor(
        key: String? = null,
        keys: Array<String>? = null,
        userId: Long? = null
    ) : this() {
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

    override val classRef = StorageGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<String>>() {}
    }
}
