@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.setOnline]
 *
 * Marks the current user as online for 15 minutes.
 *
 * @property voip '1' if videocalls are available for current device.
 */
class AccountSetOnlineMethod(
    voip: Boolean? = null
) : VkMethod<Boolean>(
    "account.setOnline",
    mutableMapOf(),
    successReference()
), UserMethod {

    var voip: Boolean? by props

    init {
        this.voip = voip
    }
}
