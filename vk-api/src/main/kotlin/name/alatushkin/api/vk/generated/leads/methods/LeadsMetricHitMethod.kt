@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.leads.MetricHitResponse
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/leads.metricHit]
 *
 * Counts the metric event.
 *
 * @property data Metric data obtained in the lead interface.
 */
class LeadsMetricHitMethod(
        data: String
) : VkMethod<MetricHitResponse>(
    "leads.metricHit",
    mutableMapOf(),
    object : TypeReference<VkSuccess<MetricHitResponse>>() {}
), UserServiceMethod {

    var data: String by props

    init {
        this.data = data
    }

    fun setData(data: String): LeadsMetricHitMethod {
        this.data = data
        return this
    }
}
