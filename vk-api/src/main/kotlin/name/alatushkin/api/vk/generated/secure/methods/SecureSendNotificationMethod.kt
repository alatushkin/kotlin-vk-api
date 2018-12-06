@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.sendNotification]
 *
 * Sends notification to the user.
 *
 * @property userIds 
 * @property userId 
 * @property message notification text which should be sent in 'UTF-8' encoding ('254' characters maximum).
 */
class SecureSendNotificationMethod(
    userIds: Array<Long>? = null,
    userId: Long? = null,
    message: String
) : VkMethod<Array<Long>>(
    "secure.sendNotification",
    mutableMapOf(),
    successReference()
), ServiceMethod {

    var userIds: Array<Long>? by props
    var userId: Long? by props
    var message: String by props

    init {
        this.userIds = userIds
        this.userId = userId
        this.message = message
    }
}
