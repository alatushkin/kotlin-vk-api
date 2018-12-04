package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.account.AccountCounters

/**
 *  Returns non-null values of user counters.
 *
 *  [https://vk.com/dev/account.getCounters]
 *  @property [filter] Counters to be returned.
 */
class AccountGetCountersMethod() : VkMethod<AccountCounters>(
    "account.getCounters",
    HashMap()
) {

    var filter: Array<String>? by props

    constructor(
        filter: Array<String>? = null
    ) : this() {
        this.filter = filter
    }

    fun setFilter(filter: Array<String>): AccountGetCountersMethod {
        this.filter = filter
        return this
    }

    override val classRef = AccountGetCountersMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<AccountCounters>>() {}
    }
}
