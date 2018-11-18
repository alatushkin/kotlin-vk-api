package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Creates advertising campaigns.
 *
 *  [https://vk.com/dev/ads.createCampaigns]
 *  @property [account_id] Advertising account ID.
 *  @property [data] Serialized JSON array of objects that describe created campaigns. Description of 'campaign_specification' objects see below.
 */
class AdsCreateCampaignsMethod() : VkMethod<Array<Long>>(
    "ads.createCampaigns",
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

    fun setAccountId(accountId: Long): AdsCreateCampaignsMethod {
        this.accountId = accountId
        return this
    }

    fun setData(data: String): AdsCreateCampaignsMethod {
        this.data = data
        return this
    }

    override val classRef = AdsCreateCampaignsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Long>>>() {}
    }
}
