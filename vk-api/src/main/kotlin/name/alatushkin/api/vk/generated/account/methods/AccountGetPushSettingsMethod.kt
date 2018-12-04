package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.account.PushSettings

/**
 *  Gets settings of push notifications.
 *
 *  [https://vk.com/dev/account.getPushSettings]
 *  @property [device_id] Unique device ID.
 */
class AccountGetPushSettingsMethod() : VkMethod<PushSettings>(
    "account.getPushSettings",
    HashMap()
) {

    var deviceId: String? by props

    constructor(
        deviceId: String? = null
    ) : this() {
        this.deviceId = deviceId
    }

    fun setDeviceId(deviceId: String): AccountGetPushSettingsMethod {
        this.deviceId = deviceId
        return this
    }

    override val classRef = AccountGetPushSettingsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<PushSettings>>() {}
    }
}
