package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Archives clients of an advertising agency.
 *
 *  [https://vk.com/dev/ads.deleteClients]
 *  @property [account_id] Advertising account ID.
 *  @property [ids] Serialized JSON array with IDs of deleted clients.
 */
class AdsDeleteClientsMethod() : VkMethod<Long>(
    "ads.deleteClients",
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

    fun setAccountId(accountId: Long): AdsDeleteClientsMethod {
        this.accountId = accountId
        return this
    }

    fun setIds(ids: String): AdsDeleteClientsMethod {
        this.ids = ids
        return this
    }

    override val classRef = AdsDeleteClientsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Long>>() {}
    }
}
