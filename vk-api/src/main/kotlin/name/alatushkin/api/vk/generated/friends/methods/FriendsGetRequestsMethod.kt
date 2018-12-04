@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.friends.GetRequestsResponse
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
class FriendsGetRequestsMethod(
        offset: Long? = null,
        count: Long? = null,
        out: Boolean? = null,
        sort: String? = null,
        suggested: Boolean? = null
) : VkMethod<GetRequestsResponse>(
    "friends.getRequests",
    mutableMapOf(),
    object : TypeReference<VkSuccess<GetRequestsResponse>>() {}
), UserMethod {

    var offset: Long? by props
    var count: Long? by props
    var out: Boolean? by props
    var sort: String? by props
    var suggested: Boolean? by props

    init {
        this.offset = offset
        this.count = count
        this.out = out
        this.sort = sort
        this.suggested = suggested
    }

    fun setOffset(offset: Long): FriendsGetRequestsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): FriendsGetRequestsMethod {
        this.count = count
        return this
    }

    fun setOut(out: Boolean): FriendsGetRequestsMethod {
        this.out = out
        return this
    }

    fun setSort(sort: String): FriendsGetRequestsMethod {
        this.sort = sort
        return this
    }

    fun setSuggested(suggested: Boolean): FriendsGetRequestsMethod {
        this.suggested = suggested
        return this
    }
}
