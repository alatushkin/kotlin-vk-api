package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.leads.MetricHitResponse

/**
 *  Counts the metric event.
 *
 *  [https://vk.com/dev/leads.metricHit]
 *  @property [data] Metric data obtained in the lead interface.
 */
class LeadsMetricHitMethod() : VkMethod<MetricHitResponse>(
    "leads.metricHit",
    HashMap()
) {

    var data: String? by props

    constructor(
        data: String? = null
    ) : this() {
        this.data = data
    }

    fun setData(data: String): LeadsMetricHitMethod {
        this.data = data
        return this
    }

    override val classRef = LeadsMetricHitMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<MetricHitResponse>>() {}
    }
}
