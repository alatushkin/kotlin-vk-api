@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.leads.Complete
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/leads.complete]
 *
 * Completes the lead started by user.
 *
 * @property vkSid Session obtained as GET parameter when session started.
 * @property secret Secret key from the lead testing interface.
 * @property comment Comment text.
 */
class LeadsCompleteMethod(
        vkSid: String,
        secret: String,
        comment: String? = null
) : VkMethod<Complete>(
    "leads.complete",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Complete>>() {}
), UserServiceMethod {

    var vkSid: String by props
    var secret: String by props
    var comment: String? by props

    init {
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
}
