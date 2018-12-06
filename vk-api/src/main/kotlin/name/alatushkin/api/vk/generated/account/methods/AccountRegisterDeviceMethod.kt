@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.registerDevice]
 *
 * Subscribes an iOS/Android/Windows Phone-based device to receive push notifications
 *
 * @property token Device token used to send notifications. (for mpns, the token shall be URL for sending of notifications)
 * @property deviceModel String name of device model.
 * @property deviceYear Device year.
 * @property deviceId Unique device ID.
 * @property systemVersion String version of device operating system.
 * @property settings Push settings in a [vk.com/dev/push_settings|special format].
 */
class AccountRegisterDeviceMethod(
    token: String,
    deviceModel: String? = null,
    deviceYear: Long? = null,
    deviceId: String,
    systemVersion: String? = null,
    settings: String? = null
) : VkMethod<Boolean>(
    "account.registerDevice",
    mutableMapOf(),
    successReference()
), UserMethod {

    var token: String by props
    var deviceModel: String? by props
    var deviceYear: Long? by props
    var deviceId: String by props
    var systemVersion: String? by props
    var settings: String? by props

    init {
        this.token = token
        this.deviceModel = deviceModel
        this.deviceYear = deviceYear
        this.deviceId = deviceId
        this.systemVersion = systemVersion
        this.settings = settings
    }
}
