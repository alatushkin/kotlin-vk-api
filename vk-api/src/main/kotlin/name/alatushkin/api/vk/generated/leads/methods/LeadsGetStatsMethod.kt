@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.leads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.leads.Lead
import name.alatushkin.api.vk.successReference
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
    successReference()
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
}
