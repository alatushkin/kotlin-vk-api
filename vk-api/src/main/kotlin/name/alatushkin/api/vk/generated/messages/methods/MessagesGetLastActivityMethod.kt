package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.messages.LastActivity

/**
 *  Returns a user's current status and date of last activity.
 *
 *  [https://vk.com/dev/messages.getLastActivity]
 *  @property [user_id] User ID.
 */
class MessagesGetLastActivityMethod() : VkMethod<LastActivity>(
    "messages.getLastActivity",
    HashMap()
) {

    var userId: Long? by props

    constructor(
        userId: Long? = null
    ) : this() {
        this.userId = userId
    }

    fun setUserId(userId: Long): MessagesGetLastActivityMethod {
        this.userId = userId
        return this
    }

    override val classRef = MessagesGetLastActivityMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<LastActivity>>() {}
    }
}
