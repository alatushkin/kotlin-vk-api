@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.leads.Checked
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
    object : TypeReference<VkSuccess<Checked>>() {}
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

    fun setLeadId(leadId: Long): LeadsCheckUserMethod {
        this.leadId = leadId
        return this
    }

    fun setTestResult(testResult: Long): LeadsCheckUserMethod {
        this.testResult = testResult
        return this
    }

    fun setAge(age: Long): LeadsCheckUserMethod {
        this.age = age
        return this
    }

    fun setCountry(country: String): LeadsCheckUserMethod {
        this.country = country
        return this
    }
}
