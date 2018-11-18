package name.alatushkin.api.vk.generated.users.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Returns information whether a user installed the application.
 *
 *  [https://vk.com/dev/users.isAppUser]
 *  @property [user_id] null
 */
class UsersIsAppUserMethod() : VkMethod<Boolean>(
    "users.isAppUser",
    HashMap()
) {

    var userId: Long? by props

    constructor(
        userId: Long? = null
    ) : this() {
        this.userId = userId
    }

    fun setUserId(userId: Long): UsersIsAppUserMethod {
        this.userId = userId
        return this
    }

    override val classRef = UsersIsAppUserMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
