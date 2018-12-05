@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.users.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/users.isAppUser]
 *
 * Returns information whether a user installed the application.
 *
 * @property userId 
 */
class UsersIsAppUserMethod(
        userId: Long? = null
) : VkMethod<Boolean>(
    "users.isAppUser",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var userId: Long? by props

    init {
        this.userId = userId
    }

    fun setUserId(userId: Long): UsersIsAppUserMethod {
        this.userId = userId
        return this
    }
}
