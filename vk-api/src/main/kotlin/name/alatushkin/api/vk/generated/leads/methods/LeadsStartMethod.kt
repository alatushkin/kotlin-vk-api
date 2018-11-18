package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.leads.Start

/**
 *  Creates new session for the user passing the offer.
 *
 *  [https://vk.com/dev/leads.start]
 *  @property [lead_id] Lead ID.
 *  @property [secret] Secret key from the lead testing interface.
 */
class LeadsStartMethod() : VkMethod<Start>(
    "leads.start",
    HashMap()
) {

    var leadId: Long? by props
    var secret: String? by props

    constructor(
        leadId: Long? = null,
        secret: String? = null
    ) : this() {
        this.leadId = leadId
        this.secret = secret
    }

    fun setLeadId(leadId: Long): LeadsStartMethod {
        this.leadId = leadId
        return this
    }

    fun setSecret(secret: String): LeadsStartMethod {
        this.secret = secret
        return this
    }

    override val classRef = LeadsStartMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Start>>() {}
    }
}
