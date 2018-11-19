package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Sends notification to the user.
 *
 *  [https://vk.com/dev/secure.sendNotification]
 *  @property [user_ids]
 *  @property [user_id]
 *  @property [message] notification text which should be sent in 'UTF-8' encoding ('254' characters maximum).
 */
class SecureSendNotificationMethod() : VkMethod<Array<Long>>(
    "secure.sendNotification",
    HashMap()
) {

    var userIds: Array<Long>? by props
    var userId: Long? by props
    var message: String? by props

    constructor(
        userIds: Array<Long>? = null,
        userId: Long? = null,
        message: String? = null
    ) : this() {
        this.userIds = userIds
        this.userId = userId
        this.message = message
    }

    fun setUserIds(userIds: Array<Long>): SecureSendNotificationMethod {
        this.userIds = userIds
        return this
    }

    fun setUserId(userId: Long): SecureSendNotificationMethod {
        this.userId = userId
        return this
    }

    fun setMessage(message: String): SecureSendNotificationMethod {
        this.message = message
        return this
    }

    override val classRef = SecureSendNotificationMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Long>>>() {}
    }
}
