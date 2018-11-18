package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.account.Offer

/**
 *  Returns a list of active ads (offers) which executed by the user will bring him/her respective number of votes to his balance in the application.
 *
 *  [https://vk.com/dev/account.getActiveOffers]
 *  @property [count] Number of results to return.
 */
class AccountGetActiveOffersMethod() : VkMethod<VkList<Offer>>(
    "account.getActiveOffers",
    HashMap()
) {

    var count: Long? by props

    constructor(
        count: Long? = null
    ) : this() {
        this.count = count
    }

    fun setCount(count: Long): AccountGetActiveOffersMethod {
        this.count = count
        return this
    }

    override val classRef = AccountGetActiveOffersMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Offer>>>() {}
    }
}
