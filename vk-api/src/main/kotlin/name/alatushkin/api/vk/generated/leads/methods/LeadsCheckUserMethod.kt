package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.leads.Checked

/**
 *  Checks if the user can start the lead.
 *
 *  [https://vk.com/dev/leads.checkUser]
 *  @property [lead_id] Lead ID.
 *  @property [test_result] Value to be return in 'result' field when test mode is used.
 *  @property [age] User age.
 *  @property [country] User country code.
 */
class LeadsCheckUserMethod() : VkMethod<Checked>(
    "leads.checkUser",
    HashMap()
) {

    var leadId: Long? by props
    var testResult: Long? by props
    var age: Long? by props
    var country: String? by props

    constructor(
        leadId: Long? = null,
        testResult: Long? = null,
        age: Long? = null,
        country: String? = null
    ) : this() {
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

    override val classRef = LeadsCheckUserMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Checked>>() {}
    }
}
