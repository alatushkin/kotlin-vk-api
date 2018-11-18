package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Edits clients of an advertising agency.
 *
 *  [https://vk.com/dev/ads.updateClients]
 *  @property [account_id] Advertising account ID.
 *  @property [data] Serialized JSON array of objects that describe changes in clients. Description of 'client_mod' objects see below.
 */
class AdsUpdateClientsMethod() : VkMethod<Long>(
    "ads.updateClients",
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

    fun setAccountId(accountId: Long): AdsUpdateClientsMethod {
        this.accountId = accountId
        return this
    }

    fun setData(data: String): AdsUpdateClientsMethod {
        this.data = data
        return this
    }

    override val classRef = AdsUpdateClientsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Long>>() {}
    }
}
