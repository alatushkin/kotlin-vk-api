@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var voip: Boolean? by props

    init {
        this.voip = voip
    }

    fun setVoip(voip: Boolean): AccountSetOnlineMethod {
        this.voip = voip
        return this
    }
}
