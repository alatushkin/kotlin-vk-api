package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.users.UserMin

/**
 *  Returns a user's blacklist.
 *
 *  [https://vk.com/dev/account.getBanned]
 *  @property [offset] Offset needed to return a specific subset of results.
 *  @property [count] Number of results to return.
 */
class AccountGetBannedMethod() : VkMethod<VkList<UserMin>>(
    "account.getBanned",
    HashMap()
) {

    var offset: Long? by props
    var count: Long? by props

    constructor(
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.offset = offset
        this.count = count
    }

    fun setOffset(offset: Long): AccountGetBannedMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): AccountGetBannedMethod {
        this.count = count
        return this
    }

    override val classRef = AccountGetBannedMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<UserMin>>>() {}
    }
}
