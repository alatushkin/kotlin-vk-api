@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.apps.SendRequestType
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/apps.sendRequest]
 *
 * Sends a request to another user in an app that uses VK authorization.
 *
 * @property userId id of the user to send a request
 * @property text request text
 * @property type request type. Values: 'invite' – if the request is sent to a user who does not have the app installed,, 'request' – if a user has already installed the app
 * @property name 
 * @property key special string key to be sent with the request
 * @property separate 
 */
class AppsSendRequestMethod(
        userId: Long,
        text: String? = null,
        type: SendRequestType? = null,
        name: String? = null,
        key: String? = null,
        separate: Boolean? = null
) : VkMethod<Long>(
    "apps.sendRequest",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Long>>() {}
), UserMethod {

    var userId: Long by props
    var text: String? by props
    var type: SendRequestType? by props
    var name: String? by props
    var key: String? by props
    var separate: Boolean? by props

    init {
        this.userId = userId
        this.text = text
        this.type = type
        this.name = name
        this.key = key
        this.separate = separate
    }

    fun setUserId(userId: Long): AppsSendRequestMethod {
        this.userId = userId
        return this
    }

    fun setText(text: String): AppsSendRequestMethod {
        this.text = text
        return this
    }

    fun setType(type: SendRequestType): AppsSendRequestMethod {
        this.type = type
        return this
    }

    fun setName(name: String): AppsSendRequestMethod {
        this.name = name
        return this
    }

    fun setKey(key: String): AppsSendRequestMethod {
        this.key = key
        return this
    }

    fun setSeparate(separate: Boolean): AppsSendRequestMethod {
        this.separate = separate
        return this
    }
}
