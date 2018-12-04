@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.wall.Filter
import name.alatushkin.api.vk.generated.wall.GetExtendedResponse
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/wall.get]
 *
 * Returns a list of posts on a user wall or community wall.
 *
 * @property ownerId ID of the user or community that owns the wall. By default, current user ID. Use a negative value to designate a community ID.
 * @property domain User or community short address.
 * @property offset Offset needed to return a specific subset of posts.
 * @property count Number of posts to return (maximum 100).
 * @property filter Filter to apply: 'owner' — posts by the wall owner, 'others' — posts by someone else, 'all' — posts by the wall owner and others (default), 'postponed' — timed posts (only available for calls with an 'access_token'), 'suggests' — suggested posts on a community wall
 * @property fields 
 */
class WallGetMethodExtended(
        ownerId: Long? = null,
        domain: String? = null,
        offset: Long? = null,
        count: Long? = null,
        filter: Filter? = null,
        fields: Array<String>? = null
) : VkMethod<GetExtendedResponse>(
    "wall.get",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkSuccess<GetExtendedResponse>>() {}
), UserServiceMethod {

    var ownerId: Long? by props
    var domain: String? by props
    var offset: Long? by props
    var count: Long? by props
    var filter: Filter? by props
    var fields: Array<String>? by props

    init {
        this.ownerId = ownerId
        this.domain = domain
        this.offset = offset
        this.count = count
        this.filter = filter
        this.fields = fields
    }

    fun setOwnerId(ownerId: Long): WallGetMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setDomain(domain: String): WallGetMethodExtended {
        this.domain = domain
        return this
    }

    fun setOffset(offset: Long): WallGetMethodExtended {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): WallGetMethodExtended {
        this.count = count
        return this
    }

    fun setFilter(filter: Filter): WallGetMethodExtended {
        this.filter = filter
        return this
    }

    fun setFields(fields: Array<String>): WallGetMethodExtended {
        this.fields = fields
        return this
    }
}
