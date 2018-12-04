package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.FloodStats

/**
 *  Returns information about current state of a counter — number of remaining runs of methods and time to the next counter nulling in seconds.
 *
 *  [https://vk.com/dev/ads.getFloodStats]
 *  @property [account_id] Advertising account ID.
 */
class AdsGetFloodStatsMethod() : VkMethod<FloodStats>(
    "ads.getFloodStats",
    HashMap()
) {

    var accountId: Long? by props

    constructor(
        accountId: Long? = null
    ) : this() {
        this.accountId = accountId
    }

    fun setAccountId(accountId: Long): AdsGetFloodStatsMethod {
        this.accountId = accountId
        return this
    }

    override val classRef = AdsGetFloodStatsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<FloodStats>>() {}
    }
}
