@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.AdLayout
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getAdsLayout]
 *
 * Returns descriptions of ad layouts.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'For advertising agencies.' ID of the client ads are retrieved from.
 * @property includeDeleted Flag that specifies whether archived ads shall be shown. *0 — show only active ads,, *1 — show all ads.
 * @property campaignIds Filter by advertising campaigns. Serialized JSON array with campaign IDs. If the parameter is null, ads of all campaigns will be shown.
 * @property adIds Filter by ads. Serialized JSON array with ad IDs. If the parameter is null, all ads will be shown.
 * @property limit Limit of number of returned ads. Used only if 'ad_ids' parameter is null, and 'campaign_ids' parameter contains ID of only one campaign.
 * @property offset Offset. Used in the same cases as 'limit' parameter.
 */
class AdsGetAdsLayoutMethod(
        accountId: Long,
        clientId: Long? = null,
        includeDeleted: Boolean? = null,
        campaignIds: String? = null,
        adIds: String? = null,
        limit: Long? = null,
        offset: Long? = null
) : VkMethod<Array<AdLayout>>(
    "ads.getAdsLayout",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Array<AdLayout>>>() {}
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

    fun setAccountId(accountId: Long): AdsGetAdsLayoutMethod {
        this.accountId = accountId
        return this
    }

    fun setClientId(clientId: Long): AdsGetAdsLayoutMethod {
        this.clientId = clientId
        return this
    }

    fun setIncludeDeleted(includeDeleted: Boolean): AdsGetAdsLayoutMethod {
        this.includeDeleted = includeDeleted
        return this
    }

    fun setCampaignIds(campaignIds: String): AdsGetAdsLayoutMethod {
        this.campaignIds = campaignIds
        return this
    }

    fun setAdIds(adIds: String): AdsGetAdsLayoutMethod {
        this.adIds = adIds
        return this
    }

    fun setLimit(limit: Long): AdsGetAdsLayoutMethod {
        this.limit = limit
        return this
    }

    fun setOffset(offset: Long): AdsGetAdsLayoutMethod {
        this.offset = offset
        return this
    }
}
