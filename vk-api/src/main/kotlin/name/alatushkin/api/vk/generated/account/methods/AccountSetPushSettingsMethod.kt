@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Boolean>>() {}
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

    fun setDeviceId(deviceId: String): AccountSetPushSettingsMethod {
        this.deviceId = deviceId
        return this
    }

    fun setSettings(settings: String): AccountSetPushSettingsMethod {
        this.settings = settings
        return this
    }

    fun setKey(key: String): AccountSetPushSettingsMethod {
        this.key = key
        return this
    }

    fun setValue(value: Array<String>): AccountSetPushSettingsMethod {
        this.value = value
        return this
    }
}
