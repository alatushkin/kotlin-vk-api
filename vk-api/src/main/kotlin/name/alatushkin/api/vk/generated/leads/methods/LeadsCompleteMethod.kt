@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.leads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.leads.Complete
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserServiceMethod {

    var vkSid: String by props
    var secret: String by props
    var comment: String? by props

    init {
        this.vkSid = vkSid
        this.secret = secret
        this.comment = comment
    }
}
