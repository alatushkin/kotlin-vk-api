package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Unsubscribes a device from push notifications.
 *
 *  [https://vk.com/dev/account.unregisterDevice]
 *  @property [device_id] Unique device ID.
 */
class AccountUnregisterDeviceMethod() : VkMethod<Boolean>(
    "account.unregisterDevice",
    HashMap()
) {

    var deviceId: String? by props

    constructor(
        deviceId: String? = null
    ) : this() {
        this.deviceId = deviceId
    }

    fun setDeviceId(deviceId: String): AccountUnregisterDeviceMethod {
        this.deviceId = deviceId
        return this
    }

    override val classRef = AccountUnregisterDeviceMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
