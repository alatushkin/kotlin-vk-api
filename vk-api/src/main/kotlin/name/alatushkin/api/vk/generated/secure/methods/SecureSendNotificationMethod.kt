@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
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
    object : TypeReference<VkSuccess<Array<Long>>>() {}
), ServiceMethod {

    var userIds: Array<Long>? by props
    var userId: Long? by props
    var message: String by props

    init {
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
}
