@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.leads.Lead
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/leads.getStats]
 *
 * Returns lead stats data.
 *
 * @property leadId Lead ID.
 * @property secret Secret key obtained from the lead testing interface.
 * @property dateStart Day to start stats from (YYYY_MM_DD, e.g.2011-09-17).
 * @property dateEnd Day to finish stats (YYYY_MM_DD, e.g.2011-09-17).
 */
class LeadsGetStatsMethod(
        leadId: Long,
        secret: String? = null,
        dateStart: String? = null,
        dateEnd: String? = null
) : VkMethod<Lead>(
    "leads.getStats",
    mutableMapOf(),
    object : TypeReference<VkResponse<Lead>>() {}
), UserMethod {

    var leadId: Long by props
    var secret: String? by props
    var dateStart: String? by props
    var dateEnd: String? by props

    init {
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
}
