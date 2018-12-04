package name.alatushkin.api.vk.generated.storage.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Returns the names of all variables.
 *
 *  [https://vk.com/dev/storage.getKeys]
 *  @property [user_id] user id, whose variables names are returned if they were requested with a server method.
 *  @property [count] amount of variable names the info needs to be collected from.
 */
class StorageGetKeysMethod() : VkMethod<Array<String>>(
    "storage.getKeys",
    HashMap()
) {

    var userId: Long? by props
    var count: Long? by props

    constructor(
        userId: Long? = null,
        count: Long? = null
    ) : this() {
        this.userId = userId
        this.count = count
    }

    fun setUserId(userId: Long): StorageGetKeysMethod {
        this.userId = userId
        return this
    }

    fun setCount(count: Long): StorageGetKeysMethod {
        this.count = count
        return this
    }

    override val classRef = StorageGetKeysMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<String>>>() {}
    }
}
