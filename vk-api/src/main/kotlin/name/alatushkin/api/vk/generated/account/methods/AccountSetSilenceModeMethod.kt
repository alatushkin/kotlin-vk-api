package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Mutes push notifications for the set period of time.
 *
 *  [https://vk.com/dev/account.setSilenceMode]
 *  @property [device_id] Unique device ID.
 *  @property [time] Time in seconds for what notifications should be disabled. '-1' to disable forever.
 *  @property [peer_id] Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
 *  @property [sound] '1' — to enable sound in this dialog, '0' — to disable sound. Only if 'peer_id' contains user or community ID.
 */
class AccountSetSilenceModeMethod() : VkMethod<Boolean>(
    "account.setSilenceMode",
    HashMap()
) {

    var deviceId: String? by props
    var time: Long? by props
    var peerId: Long? by props
    var sound: Long? by props

    constructor(
        deviceId: String? = null,
        time: Long? = null,
        peerId: Long? = null,
        sound: Long? = null
    ) : this() {
        this.deviceId = deviceId
        this.time = time
        this.peerId = peerId
        this.sound = sound
    }

    fun setDeviceId(deviceId: String): AccountSetSilenceModeMethod {
        this.deviceId = deviceId
        return this
    }

    fun setTime(time: Long): AccountSetSilenceModeMethod {
        this.time = time
        return this
    }

    fun setPeerId(peerId: Long): AccountSetSilenceModeMethod {
        this.peerId = peerId
        return this
    }

    fun setSound(sound: Long): AccountSetSilenceModeMethod {
        this.sound = sound
        return this
    }

    override val classRef = AccountSetSilenceModeMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
