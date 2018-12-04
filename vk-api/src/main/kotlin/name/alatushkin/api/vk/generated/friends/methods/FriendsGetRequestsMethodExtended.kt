@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.friends.RequestsXtrMessage
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getRequests]
 *
 * Returns information about the current user's incoming and outgoing friend requests.
 *
 * @property offset Offset needed to return a specific subset of friend requests.
 * @property count Number of friend requests to return (default 100, maximum 1000).
 * @property out '1' — to return outgoing requests, '0' — to return incoming requests (default)
 * @property sort Sort order: '1' — by number of mutual friends, '0' — by date
 * @property suggested '1' — to return a list of suggested friends, '0' — to return friend requests (default)
 */
class FriendsGetRequestsMethodExtended(
        offset: Long? = null,
        count: Long? = null,
        out: Boolean? = null,
        sort: VkDate? = null,
        suggested: Boolean? = null
) : VkMethod<VkList<RequestsXtrMessage>>(
    "friends.getRequests",
    mutableMapOf("extended" to "1", "need_mutual" to "1"),
    object : TypeReference<VkSuccess<VkList<RequestsXtrMessage>>>() {}
), UserMethod {

    var offset: Long? by props
    var count: Long? by props
    var out: Boolean? by props
    var sort: VkDate? by props
    var suggested: Boolean? by props

    init {
        this.offset = offset
        this.count = count
        this.out = out
        this.sort = sort
        this.suggested = suggested
    }

    fun setOffset(offset: Long): FriendsGetRequestsMethodExtended {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): FriendsGetRequestsMethodExtended {
        this.count = count
        return this
    }

    fun setOut(out: Boolean): FriendsGetRequestsMethodExtended {
        this.out = out
        return this
    }

    fun setSort(sort: VkDate): FriendsGetRequestsMethodExtended {
        this.sort = sort
        return this
    }

    fun setSuggested(suggested: Boolean): FriendsGetRequestsMethodExtended {
        this.suggested = suggested
        return this
    }
}
