package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Marks a current user as offline.
 *
 *  [https://vk.com/dev/account.setOffline]

 */
class AccountSetOfflineMethod : VkMethod<Boolean>(
    "account.setOffline",
    HashMap()
) {
    override val classRef = AccountSetOfflineMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
