@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.leads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.leads.Checked
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/leads.checkUser]
 *
 * Checks if the user can start the lead.
 *
 * @property leadId Lead ID.
 * @property testResult Value to be return in 'result' field when test mode is used.
 * @property age User age.
 * @property country User country code.
 */
class LeadsCheckUserMethod(
    leadId: Long,
    testResult: Long? = null,
    age: Long? = null,
    country: String? = null
) : VkMethod<Checked>(
    "leads.checkUser",
    mutableMapOf(),
    successReference()
), UserMethod {

    var leadId: Long by props
    var testResult: Long? by props
    var age: Long? by props
    var country: String? by props

    init {
        this.leadId = leadId
        this.testResult = testResult
        this.age = age
        this.country = country
    }
}
