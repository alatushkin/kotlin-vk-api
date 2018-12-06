@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.users.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var userId: Long? by props

    init {
        this.userId = userId
    }
}
