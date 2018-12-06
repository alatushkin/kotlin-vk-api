@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.addUser]
 *
 * Adds a profile to user faves.
 *
 * @property userId Profile ID.
 */
class FaveAddUserMethod(
    userId: Long
) : VkMethod<Boolean>(
    "fave.addUser",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long by props

    init {
        this.userId = userId
    }
}
