package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Creates clients of an advertising agency.
 *
 *  [https://vk.com/dev/ads.createClients]
 *  @property [account_id] Advertising account ID.
 *  @property [data] Serialized JSON array of objects that describe created campaigns. Description of 'client_specification' objects see below.
 */
class AdsCreateClientsMethod() : VkMethod<Array<Long>>(
    "ads.createClients",
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

    fun setAccountId(accountId: Long): AdsCreateClientsMethod {
        this.accountId = accountId
        return this
    }

    fun setData(data: String): AdsCreateClientsMethod {
        this.data = data
        return this
    }

    override val classRef = AdsCreateClientsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Long>>>() {}
    }
}
