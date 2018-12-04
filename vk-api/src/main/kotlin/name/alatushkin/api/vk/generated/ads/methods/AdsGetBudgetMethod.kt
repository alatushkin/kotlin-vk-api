package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Returns current budget of the advertising account.
 *
 *  [https://vk.com/dev/ads.getBudget]
 *  @property [account_id] Advertising account ID.
 */
class AdsGetBudgetMethod() : VkMethod<Long>(
    "ads.getBudget",
    HashMap()
) {

    var accountId: Long? by props

    constructor(
        accountId: Long? = null
    ) : this() {
        this.accountId = accountId
    }

    fun setAccountId(accountId: Long): AdsGetBudgetMethod {
        this.accountId = accountId
        return this
    }

    override val classRef = AdsGetBudgetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Long>>() {}
    }
}
