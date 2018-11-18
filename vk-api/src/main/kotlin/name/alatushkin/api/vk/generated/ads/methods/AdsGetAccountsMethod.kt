package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.Account

/**
 *  Returns a list of advertising accounts.
 *
 *  [https://vk.com/dev/ads.getAccounts]

 */
class AdsGetAccountsMethod : VkMethod<Array<Account>>(
    "ads.getAccounts",
    HashMap()
) {
    override val classRef = AdsGetAccountsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Account>>>() {}
    }
}
