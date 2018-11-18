package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.leads.Lead

/**
 *  Returns lead stats data.
 *
 *  [https://vk.com/dev/leads.getStats]
 *  @property [lead_id] Lead ID.
 *  @property [secret] Secret key obtained from the lead testing interface.
 *  @property [date_start] Day to start stats from (YYYY_MM_DD, e.g.2011-09-17).
 *  @property [date_end] Day to finish stats (YYYY_MM_DD, e.g.2011-09-17).
 */
class LeadsGetStatsMethod() : VkMethod<Lead>(
    "leads.getStats",
    HashMap()
) {

    var leadId: Long? by props
    var secret: String? by props
    var dateStart: String? by props
    var dateEnd: String? by props

    constructor(
        leadId: Long? = null,
        secret: String? = null,
        dateStart: String? = null,
        dateEnd: String? = null
    ) : this() {
        this.leadId = leadId
        this.secret = secret
        this.dateStart = dateStart
        this.dateEnd = dateEnd
    }

    fun setLeadId(leadId: Long): LeadsGetStatsMethod {
        this.leadId = leadId
        return this
    }

    fun setSecret(secret: String): LeadsGetStatsMethod {
        this.secret = secret
        return this
    }

    fun setDateStart(dateStart: String): LeadsGetStatsMethod {
        this.dateStart = dateStart
        return this
    }

    fun setDateEnd(dateEnd: String): LeadsGetStatsMethod {
        this.dateEnd = dateEnd
        return this
    }

    override val classRef = LeadsGetStatsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Lead>>() {}
    }
}
