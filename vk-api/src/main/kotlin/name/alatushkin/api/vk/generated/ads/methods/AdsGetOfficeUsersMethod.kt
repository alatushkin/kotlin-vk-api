package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.Users

/**
 *  Returns a list of managers and supervisors of advertising account.
 *
 *  [https://vk.com/dev/ads.getOfficeUsers]
 *  @property [account_id] Advertising account ID.
 */
class AdsGetOfficeUsersMethod() : VkMethod<Array<Users>>(
    "ads.getOfficeUsers",
    HashMap()
) {

    var accountId: Long? by props

    constructor(
        accountId: Long? = null
    ) : this() {
        this.accountId = accountId
    }

    fun setAccountId(accountId: Long): AdsGetOfficeUsersMethod {
        this.accountId = accountId
        return this
    }

    override val classRef = AdsGetOfficeUsersMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Users>>>() {}
    }
}
