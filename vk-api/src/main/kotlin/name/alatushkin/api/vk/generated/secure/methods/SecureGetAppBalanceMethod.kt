package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Returns payment balance of the application in hundredth of a vote.
 *
 *  [https://vk.com/dev/secure.getAppBalance]

 */
class SecureGetAppBalanceMethod : VkMethod<Long>(
    "secure.getAppBalance",
    HashMap()
) {
    override val classRef = SecureGetAppBalanceMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Long>>() {}
    }
}
