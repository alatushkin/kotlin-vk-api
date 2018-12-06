@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var deviceId: String? by props

    init {
        this.deviceId = deviceId
    }
}
