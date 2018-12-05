@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.Ad
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getAds]
 *
 * Returns number of ads.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'Available and required for advertising agencies.' ID of the client ads are retrieved from.
 * @property includeDeleted Flag that specifies whether archived ads shall be shown: *0 — show only active ads,, *1 — show all ads.
 * @property campaignIds Filter by advertising campaigns. Serialized JSON array with campaign IDs. If the parameter is null, ads of all campaigns will be shown.
 * @property adIds Filter by ads. Serialized JSON array with ad IDs. If the parameter is null, all ads will be shown.
 * @property limit Limit of number of returned ads. Used only if ad_ids parameter is null, and 'campaign_ids' parameter contains ID of only one campaign.
 * @property offset Offset. Used in the same cases as 'limit' parameter.
 */
class AdsGetAdsMethod(
        accountId: Long,
        clientId: Long? = null,
        includeDeleted: Boolean? = null,
        campaignIds: String? = null,
        adIds: String? = null,
        limit: Long? = null,
        offset: Long? = null
) : VkMethod<Array<Ad>>(
    "ads.getAds",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<Ad>>>() {}
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

    fun setAccountId(accountId: Long): AdsGetAdsMethod {
        this.accountId = accountId
        return this
    }

    fun setClientId(clientId: Long): AdsGetAdsMethod {
        this.clientId = clientId
        return this
    }

    fun setIncludeDeleted(includeDeleted: Boolean): AdsGetAdsMethod {
        this.includeDeleted = includeDeleted
        return this
    }

    fun setCampaignIds(campaignIds: String): AdsGetAdsMethod {
        this.campaignIds = campaignIds
        return this
    }

    fun setAdIds(adIds: String): AdsGetAdsMethod {
        this.adIds = adIds
        return this
    }

    fun setLimit(limit: Long): AdsGetAdsMethod {
        this.limit = limit
        return this
    }

    fun setOffset(offset: Long): AdsGetAdsMethod {
        this.offset = offset
        return this
    }
}
