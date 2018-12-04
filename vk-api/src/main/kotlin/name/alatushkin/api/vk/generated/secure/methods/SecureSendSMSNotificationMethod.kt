@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
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
    object : TypeReference<VkSuccess<Boolean>>() {}
), ServiceMethod {

    var userId: Long by props
    var message: String by props

    init {
        this.userId = userId
        this.message = message
    }

    fun setUserId(userId: Long): SecureSendSMSNotificationMethod {
        this.userId = userId
        return this
    }

    fun setMessage(message: String): SecureSendSMSNotificationMethod {
        this.message = message
        return this
    }
}
