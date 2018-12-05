@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.unregisterDevice]
 *
 * Unsubscribes a device from push notifications.
 *
 * @property deviceId Unique device ID.
 */
class AccountUnregisterDeviceMethod(
        deviceId: String? = null
) : VkMethod<Boolean>(
    "account.unregisterDevice",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var deviceId: String? by props

    init {
        this.deviceId = deviceId
    }

    fun setDeviceId(deviceId: String): AccountUnregisterDeviceMethod {
        this.deviceId = deviceId
        return this
    }
}
