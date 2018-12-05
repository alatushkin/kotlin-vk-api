@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.IdsType
import name.alatushkin.api.vk.generated.ads.Period
import name.alatushkin.api.vk.generated.ads.Stats
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getStatistics]
 *
 * Returns statistics of performance indicators for ads, campaigns, clients or the whole account.
 *
 * @property accountId Advertising account ID.
 * @property idsType Type of requested objects listed in 'ids' parameter: *ad — ads,, *campaign — campaigns,, *client — clients,, *office — account.
 * @property ids IDs requested ads, campaigns, clients or account, separated with a comma, depending on the value set in 'ids_type'. Maximum 2000 objects.
 * @property period Data grouping by dates: *day — statistics by days,, *month — statistics by months,, *overall — overall statistics. 'date_from' and 'date_to' parameters set temporary limits.
 * @property dateFrom Date to show statistics from. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — day it was created on,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — month it was created in,, *overall: 0.
 * @property dateTo Date to show statistics to. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — current day,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — current month,, *overall: 0.
 */
class AdsGetStatisticsMethod(
        accountId: Long,
        idsType: IdsType,
        ids: String,
        period: Period,
        dateFrom: String,
        dateTo: String
) : VkMethod<Array<Stats>>(
    "ads.getStatistics",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<Stats>>>() {}
), UserMethod {

    var accountId: Long by props
    var idsType: IdsType by props
    var ids: String by props
    var period: Period by props
    var dateFrom: String by props
    var dateTo: String by props

    init {
        this.accountId = accountId
        this.idsType = idsType
        this.ids = ids
        this.period = period
        this.dateFrom = dateFrom
        this.dateTo = dateTo
    }

    fun setAccountId(accountId: Long): AdsGetStatisticsMethod {
        this.accountId = accountId
        return this
    }

    fun setIdsType(idsType: IdsType): AdsGetStatisticsMethod {
        this.idsType = idsType
        return this
    }

    fun setIds(ids: String): AdsGetStatisticsMethod {
        this.ids = ids
        return this
    }

    fun setPeriod(period: Period): AdsGetStatisticsMethod {
        this.period = period
        return this
    }

    fun setDateFrom(dateFrom: String): AdsGetStatisticsMethod {
        this.dateFrom = dateFrom
        return this
    }

    fun setDateTo(dateTo: String): AdsGetStatisticsMethod {
        this.dateTo = dateTo
        return this
    }
}
