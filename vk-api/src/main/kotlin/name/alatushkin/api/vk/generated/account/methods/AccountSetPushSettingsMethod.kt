@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.setPushSettings]
 *
 * Change push settings.
 *
 * @property deviceId Unique device ID.
 * @property settings Push settings in a [vk.com/dev/push_settings|special format].
 * @property key Notification key.
 * @property value New value for the key in a [vk.com/dev/push_settings|special format].
 */
class AccountSetPushSettingsMethod(
    deviceId: String,
    settings: String? = null,
    key: String? = null,
    value: Array<String>? = null
) : VkMethod<Boolean>(
    "account.setPushSettings",
    mutableMapOf(),
    successReference()
), UserMethod {

    var deviceId: String by props
    var settings: String? by props
    var key: String? by props
    var value: Array<String>? by props

    init {
        this.deviceId = deviceId
        this.settings = settings
        this.key = key
        this.value = value
    }
}
