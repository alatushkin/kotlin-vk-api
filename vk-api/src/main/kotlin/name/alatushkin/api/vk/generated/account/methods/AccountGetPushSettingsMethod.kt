@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.account.PushSettings
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
    object : TypeReference<VkResponse<PushSettings>>() {}
), UserMethod {

    var deviceId: String? by props

    init {
        this.deviceId = deviceId
    }

    fun setDeviceId(deviceId: String): AccountGetPushSettingsMethod {
        this.deviceId = deviceId
        return this
    }
}
