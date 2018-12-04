package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Removes managers and/or supervisors from advertising account.
 *
 *  [https://vk.com/dev/ads.removeOfficeUsers]
 *  @property [account_id] Advertising account ID.
 *  @property [ids] Serialized JSON array with IDs of deleted managers.
 */
class AdsRemoveOfficeUsersMethod() : VkMethod<Boolean>(
    "ads.removeOfficeUsers",
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

    fun setAccountId(accountId: Long): AdsRemoveOfficeUsersMethod {
        this.accountId = accountId
        return this
    }

    fun setIds(ids: String): AdsRemoveOfficeUsersMethod {
        this.ids = ids
        return this
    }

    override val classRef = AdsRemoveOfficeUsersMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
