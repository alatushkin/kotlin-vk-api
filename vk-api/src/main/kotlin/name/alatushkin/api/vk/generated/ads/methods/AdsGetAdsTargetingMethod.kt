@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.TargSettings
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getAdsTargeting]
 *
 * Returns ad targeting parameters.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'For advertising agencies.' ID of the client ads are retrieved from.
 * @property includeDeleted flag that specifies whether archived ads shall be shown: *0 — show only active ads,, *1 — show all ads.
 * @property campaignIds Filter by advertising campaigns. Serialized JSON array with campaign IDs. If the parameter is null, ads of all campaigns will be shown.
 * @property adIds Filter by ads. Serialized JSON array with ad IDs. If the parameter is null, all ads will be shown.
 * @property limit Limit of number of returned ads. Used only if 'ad_ids' parameter is null, and 'campaign_ids' parameter contains ID of only one campaign.
 * @property offset Offset needed to return a specific subset of results.
 */
class AdsGetAdsTargetingMethod(
        accountId: Long,
        clientId: Long? = null,
        includeDeleted: Boolean? = null,
        campaignIds: String? = null,
        adIds: String? = null,
        limit: Long? = null,
        offset: Long? = null
) : VkMethod<Array<TargSettings>>(
    "ads.getAdsTargeting",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<TargSettings>>>() {}
), UserMethod {

    var accountId: Long by props
    var clientId: Long? by props
    var includeDeleted: Boolean? by props
    var campaignIds: String? by props
    var adIds: String? by props
    var limit: Long? by props
    var offset: Long? by props

    init {
        this.accountId = accountId
        this.clientId = clientId
        this.includeDeleted = includeDeleted
        this.campaignIds = campaignIds
        this.adIds = adIds
        this.limit = limit
        this.offset = offset
    }

    fun setAccountId(accountId: Long): AdsGetAdsTargetingMethod {
        this.accountId = accountId
        return this
    }

    fun setClientId(clientId: Long): AdsGetAdsTargetingMethod {
        this.clientId = clientId
        return this
    }

    fun setIncludeDeleted(includeDeleted: Boolean): AdsGetAdsTargetingMethod {
        this.includeDeleted = includeDeleted
        return this
    }

    fun setCampaignIds(campaignIds: String): AdsGetAdsTargetingMethod {
        this.campaignIds = campaignIds
        return this
    }

    fun setAdIds(adIds: String): AdsGetAdsTargetingMethod {
        this.adIds = adIds
        return this
    }

    fun setLimit(limit: Long): AdsGetAdsTargetingMethod {
        this.limit = limit
        return this
    }

    fun setOffset(offset: Long): AdsGetAdsTargetingMethod {
        this.offset = offset
        return this
    }
}
