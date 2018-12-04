package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.leads.Complete

/**
 *  Completes the lead started by user.
 *
 *  [https://vk.com/dev/leads.complete]
 *  @property [vk_sid] Session obtained as GET parameter when session started.
 *  @property [secret] Secret key from the lead testing interface.
 *  @property [comment] Comment text.
 */
class LeadsCompleteMethod() : VkMethod<Complete>(
    "leads.complete",
    HashMap()
) {

    var vkSid: String? by props
    var secret: String? by props
    var comment: String? by props

    constructor(
        vkSid: String? = null,
        secret: String? = null,
        comment: String? = null
    ) : this() {
        this.vkSid = vkSid
        this.secret = secret
        this.comment = comment
    }

    fun setVkSid(vkSid: String): LeadsCompleteMethod {
        this.vkSid = vkSid
        return this
    }

    fun setSecret(secret: String): LeadsCompleteMethod {
        this.secret = secret
        return this
    }

    fun setComment(comment: String): LeadsCompleteMethod {
        this.comment = comment
        return this
    }

    override val classRef = LeadsCompleteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Complete>>() {}
    }
}
