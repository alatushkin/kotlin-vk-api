package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Edits advertising campaigns.
 *
 *  [https://vk.com/dev/ads.updateCampaigns]
 *  @property [account_id] Advertising account ID.
 *  @property [data] Serialized JSON array of objects that describe changes in campaigns. Description of 'campaign_mod' objects see below.
 */
class AdsUpdateCampaignsMethod() : VkMethod<Long>(
    "ads.updateCampaigns",
    HashMap()
) {

    var accountId: Long? by props
    var data: String? by props

    constructor(
        accountId: Long? = null,
        data: String? = null
    ) : this() {
        this.accountId = accountId
        this.data = data
    }

    fun setAccountId(accountId: Long): AdsUpdateCampaignsMethod {
        this.accountId = accountId
        return this
    }

    fun setData(data: String): AdsUpdateCampaignsMethod {
        this.data = data
        return this
    }

    override val classRef = AdsUpdateCampaignsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Long>>() {}
    }
}
