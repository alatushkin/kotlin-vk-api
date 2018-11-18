package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.Client

/**
 *  Returns a list of advertising agency's clients.
 *
 *  [https://vk.com/dev/ads.getClients]
 *  @property [account_id] Advertising account ID.
 */
class AdsGetClientsMethod() : VkMethod<Array<Client>>(
    "ads.getClients",
    HashMap()
) {

    var accountId: Long? by props

    constructor(
        accountId: Long? = null
    ) : this() {
        this.accountId = accountId
    }

    fun setAccountId(accountId: Long): AdsGetClientsMethod {
        this.accountId = accountId
        return this
    }

    override val classRef = AdsGetClientsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Client>>>() {}
    }
}
