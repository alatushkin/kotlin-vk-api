@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.leads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.leads.Start
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/leads.start]
 *
 * Creates new session for the user passing the offer.
 *
 * @property leadId Lead ID.
 * @property secret Secret key from the lead testing interface.
 */
class LeadsStartMethod(
    leadId: Long,
    secret: String
) : VkMethod<Start>(
    "leads.start",
    mutableMapOf(),
    successReference()
), UserServiceMethod {

    var leadId: Long by props
    var secret: String by props

    init {
        this.leadId = leadId
        this.secret = secret
    }
}
