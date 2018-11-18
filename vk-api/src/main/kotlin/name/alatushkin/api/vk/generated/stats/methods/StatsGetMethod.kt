package name.alatushkin.api.vk.generated.stats.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.stats.Period

/**
 *  Returns statistics of a community or an application.
 *
 *  [https://vk.com/dev/stats.get]
 *  @property [group_id] Community ID.
 *  @property [app_id] Application ID.
 *  @property [date_from] Latest datestamp (in Unix time) of statistics to return.
 *  @property [date_to] End datestamp (in Unix time) of statistics to return.
 */
class StatsGetMethod() : VkMethod<Array<Period>>(
    "stats.get",
    HashMap()
) {

    var groupId: Long? by props
    var appId: Long? by props
    var dateFrom: String? by props
    var dateTo: String? by props

    constructor(
        groupId: Long? = null,
        appId: Long? = null,
        dateFrom: String? = null,
        dateTo: String? = null
    ) : this() {
        this.groupId = groupId
        this.appId = appId
        this.dateFrom = dateFrom
        this.dateTo = dateTo
    }

    fun setGroupId(groupId: Long): StatsGetMethod {
        this.groupId = groupId
        return this
    }

    fun setAppId(appId: Long): StatsGetMethod {
        this.appId = appId
        return this
    }

    fun setDateFrom(dateFrom: String): StatsGetMethod {
        this.dateFrom = dateFrom
        return this
    }

    fun setDateTo(dateTo: String): StatsGetMethod {
        this.dateTo = dateTo
        return this
    }

    override val classRef = StatsGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Period>>>() {}
    }
}
