@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.ads.DemoStats
import name.alatushkin.api.vk.generated.ads.GetDemographicsIdsType
import name.alatushkin.api.vk.generated.ads.Period
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getDemographics]
 *
 * Returns demographics for ads or campaigns.
 *
 * @property accountId Advertising account ID.
 * @property idsType Type of requested objects listed in 'ids' parameter: *ad — ads,, *campaign — campaigns.
 * @property ids IDs requested ads or campaigns, separated with a comma, depending on the value set in 'ids_type'. Maximum 2000 objects.
 * @property period Data grouping by dates: *day — statistics by days,, *month — statistics by months,, *overall — overall statistics. 'date_from' and 'date_to' parameters set temporary limits.
 * @property dateFrom Date to show statistics from. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — day it was created on,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — month it was created in,, *overall: 0.
 * @property dateTo Date to show statistics to. For different value of 'period' different date format is used: *day: YYYY-MM-DD, example: 2011-09-27 — September 27, 2011, **0 — current day,, *month: YYYY-MM, example: 2011-09 — September 2011, **0 — current month,, *overall: 0.
 */
class AdsGetDemographicsMethod(
    accountId: Long,
    idsType: GetDemographicsIdsType,
    ids: String,
    period: Period,
    dateFrom: String,
    dateTo: String
) : VkMethod<Array<DemoStats>>(
    "ads.getDemographics",
    mutableMapOf(),
    successReference()
), UserMethod {

    var accountId: Long by props
    var idsType: GetDemographicsIdsType by props
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
}
