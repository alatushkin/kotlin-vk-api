package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.secure.Transaction

/**
 *  Shows history of votes transaction between users and the application.
 *
 *  [https://vk.com/dev/secure.getTransactionsHistory]

 */
class SecureGetTransactionsHistoryMethod : VkMethod<Array<Transaction>>(
    "secure.getTransactionsHistory",
    HashMap()
) {
    override val classRef = SecureGetTransactionsHistoryMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Transaction>>>() {}
    }
}
