@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.removeUser]
 *
 * Removes a profile from user faves.
 *
 * @property userId Profile ID.
 */
class FaveRemoveUserMethod(
    userId: Long
) : VkMethod<Boolean>(
    "fave.removeUser",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long by props

    init {
        this.userId = userId
    }
}
