package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Sends 'SMS' notification to a user's mobile device.
 *
 *  [https://vk.com/dev/secure.sendSMSNotification]
 *  @property [user_id] ID of the user to whom SMS notification is sent. The user shall allow the application to send him/her notifications (, +1).
 *  @property [message] 'SMS' text to be sent in 'UTF-8' encoding. Only Latin letters and numbers are allowed. Maximum size is '160' characters.
 */
class SecureSendSMSNotificationMethod() : VkMethod<Boolean>(
    "secure.sendSMSNotification",
    HashMap()
) {

    var userId: Long? by props
    var message: String? by props

    constructor(
        userId: Long? = null,
        message: String? = null
    ) : this() {
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

    override val classRef = SecureSendSMSNotificationMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
