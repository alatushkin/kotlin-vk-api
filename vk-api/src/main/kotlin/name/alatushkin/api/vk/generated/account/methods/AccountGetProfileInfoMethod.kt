package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.account.UserSettings

/**
 *  Returns the current account info.
 *
 *  [https://vk.com/dev/account.getProfileInfo]

 */
class AccountGetProfileInfoMethod : VkMethod<UserSettings>(
    "account.getProfileInfo",
    HashMap()
) {
    override val classRef = AccountGetProfileInfoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<UserSettings>>() {}
    }
}
