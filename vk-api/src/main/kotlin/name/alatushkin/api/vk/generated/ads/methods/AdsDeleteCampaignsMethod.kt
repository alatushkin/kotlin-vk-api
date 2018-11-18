package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Archives advertising campaigns.
 *
 *  [https://vk.com/dev/ads.deleteCampaigns]
 *  @property [account_id] Advertising account ID.
 *  @property [ids] Serialized JSON array with IDs of deleted campaigns.
 */
class AdsDeleteCampaignsMethod() : VkMethod<Long>(
    "ads.deleteCampaigns",
    HashMap()
) {

    var accountId: Long? by props
    var ids: String? by props

    constructor(
        accountId: Long? = null,
        ids: String? = null
    ) : this() {
        this.accountId = accountId
        this.ids = ids
    }

    fun setAccountId(accountId: Long): AdsDeleteCampaignsMethod {
        this.accountId = accountId
        return this
    }

    fun setIds(ids: String): AdsDeleteCampaignsMethod {
        this.ids = ids
        return this
    }

    override val classRef = AdsDeleteCampaignsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Long>>() {}
    }
}
