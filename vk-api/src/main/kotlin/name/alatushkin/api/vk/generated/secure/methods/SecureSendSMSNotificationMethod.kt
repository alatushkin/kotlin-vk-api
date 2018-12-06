@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.sendSMSNotification]
 *
 * Sends 'SMS' notification to a user's mobile device.
 *
 * @property userId ID of the user to whom SMS notification is sent. The user shall allow the application to send him/her notifications (, +1).
 * @property message 'SMS' text to be sent in 'UTF-8' encoding. Only Latin letters and numbers are allowed. Maximum size is '160' characters.
 */
class SecureSendSMSNotificationMethod(
    userId: Long,
    message: String
) : VkMethod<Boolean>(
    "secure.sendSMSNotification",
    mutableMapOf(),
    successReference()
), ServiceMethod {

    var userId: Long by props
    var message: String by props

    init {
        this.userId = userId
        this.message = message
    }
}
