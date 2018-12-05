@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.users.UserMin
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.getUsers]
 *
 * Returns a list of users whom the current user has bookmarked.
 *
 * @property offset Offset needed to return a specific subset of users.
 * @property count Number of users to return.
 */
class FaveGetUsersMethod(
        offset: Long? = null,
        count: Long? = null
) : VkMethod<VkList<UserMin>>(
    "fave.getUsers",
    mutableMapOf(),
    object : TypeReference<VkResponse<VkList<UserMin>>>() {}
), UserMethod {

    var offset: Long? by props
    var count: Long? by props

    init {
        this.offset = offset
        this.count = count
    }

    fun setOffset(offset: Long): FaveGetUsersMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): FaveGetUsersMethod {
        this.count = count
        return this
    }
}
