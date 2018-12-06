@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.setSilenceMode]
 *
 * Mutes push notifications for the set period of time.
 *
 * @property deviceId Unique device ID.
 * @property time Time in seconds for what notifications should be disabled. '-1' to disable forever.
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
 * @property sound '1' — to enable sound in this dialog, '0' — to disable sound. Only if 'peer_id' contains user or community ID.
 */
class AccountSetSilenceModeMethod(
    deviceId: String? = null,
    time: Long? = null,
    peerId: Long? = null,
    sound: Long? = null
) : VkMethod<Boolean>(
    "account.setSilenceMode",
    mutableMapOf(),
    successReference()
), UserMethod {

    var deviceId: String? by props
    var time: Long? by props
    var peerId: Long? by props
    var sound: Long? by props

    init {
        this.deviceId = deviceId
        this.time = time
        this.peerId = peerId
        this.sound = sound
    }
}
