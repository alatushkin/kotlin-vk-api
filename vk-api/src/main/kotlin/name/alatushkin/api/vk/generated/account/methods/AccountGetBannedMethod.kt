@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.users.UserMin
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.getBanned]
 *
 * Returns a user's blacklist.
 *
 * @property offset Offset needed to return a specific subset of results.
 * @property count Number of results to return.
 */
class AccountGetBannedMethod(
        offset: Long? = null,
        count: Long? = null
) : VkMethod<VkList<UserMin>>(
    "account.getBanned",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<UserMin>>>() {}
), UserMethod {

    var offset: Long? by props
    var count: Long? by props

    init {
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
}
