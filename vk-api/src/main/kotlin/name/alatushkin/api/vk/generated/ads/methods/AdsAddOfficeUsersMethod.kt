package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Adds managers and/or supervisors to advertising account.
 *
 *  [https://vk.com/dev/ads.addOfficeUsers]
 *  @property [account_id] Advertising account ID.
 *  @property [data] Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
 */
class AdsAddOfficeUsersMethod() : VkMethod<Boolean>(
    "ads.addOfficeUsers",
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

    fun setAccountId(accountId: Long): AdsAddOfficeUsersMethod {
        this.accountId = accountId
        return this
    }

    fun setData(data: String): AdsAddOfficeUsersMethod {
        this.data = data
        return this
    }

    override val classRef = AdsAddOfficeUsersMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
