package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Subscribes an iOS/Android/Windows Phone-based device to receive push notifications
 *
 *  [https://vk.com/dev/account.registerDevice]
 *  @property [token] Device token used to send notifications. (for mpns, the token shall be URL for sending of notifications)
 *  @property [device_model] String name of device model.
 *  @property [device_year] Device year.
 *  @property [device_id] Unique device ID.
 *  @property [system_version] String version of device operating system.
 *  @property [settings] Push settings in a [vk.com/dev/push_settings|special format].
 */
class AccountRegisterDeviceMethod() : VkMethod<Boolean>(
    "account.registerDevice",
    HashMap()
) {

    var token: String? by props
    var deviceModel: String? by props
    var deviceYear: Long? by props
    var deviceId: String? by props
    var systemVersion: String? by props
    var settings: String? by props

    constructor(
        token: String? = null,
        deviceModel: String? = null,
        deviceYear: Long? = null,
        deviceId: String? = null,
        systemVersion: String? = null,
        settings: String? = null
    ) : this() {
        this.token = token
        this.deviceModel = deviceModel
        this.deviceYear = deviceYear
        this.deviceId = deviceId
        this.systemVersion = systemVersion
        this.settings = settings
    }

    fun setToken(token: String): AccountRegisterDeviceMethod {
        this.token = token
        return this
    }

    fun setDeviceModel(deviceModel: String): AccountRegisterDeviceMethod {
        this.deviceModel = deviceModel
        return this
    }

    fun setDeviceYear(deviceYear: Long): AccountRegisterDeviceMethod {
        this.deviceYear = deviceYear
        return this
    }

    fun setDeviceId(deviceId: String): AccountRegisterDeviceMethod {
        this.deviceId = deviceId
        return this
    }

    fun setSystemVersion(systemVersion: String): AccountRegisterDeviceMethod {
        this.systemVersion = systemVersion
        return this
    }

    fun setSettings(settings: String): AccountRegisterDeviceMethod {
        this.settings = settings
        return this
    }

    override val classRef = AccountRegisterDeviceMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
