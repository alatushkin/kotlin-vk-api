@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.account.PushSettings
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.getPushSettings]
 *
 * Gets settings of push notifications.
 *
 * @property deviceId Unique device ID.
 */
class AccountGetPushSettingsMethod(
    deviceId: String? = null
) : VkMethod<PushSettings>(
    "account.getPushSettings",
    mutableMapOf(),
    successReference()
), UserMethod {

    var deviceId: String? by props

    init {
        this.deviceId = deviceId
    }
}
