@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stats.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.stats.Period
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/stats.get]
 *
 * Returns statistics of a community or an application.
 *
 * @property groupId Community ID.
 * @property appId Application ID.
 * @property dateFrom Latest datestamp (in Unix time) of statistics to return.
 * @property dateTo End datestamp (in Unix time) of statistics to return.
 */
class StatsGetMethod(
        groupId: Long? = null,
        appId: Long? = null,
        dateFrom: String? = null,
        dateTo: String? = null
) : VkMethod<Array<Period>>(
    "stats.get",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<Period>>>() {}
), UserMethod {

    var groupId: Long? by props
    var appId: Long? by props
    var dateFrom: String? by props
    var dateTo: String? by props

    init {
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
}
