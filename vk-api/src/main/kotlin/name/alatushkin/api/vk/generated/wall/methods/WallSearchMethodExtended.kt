package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.wall.SearchExtendedResponse

/**
 *  Allows to search posts on user or community walls.
 *
 *  [https://vk.com/dev/wall.search]
 *  @property [owner_id] user or community id. "Remember that for a community 'owner_id' must be negative."
 *  @property [domain] user or community screen name.
 *  @property [query] search query string.
 *  @property [owners_only] '1' – returns only page owner's posts.
 *  @property [count] count of posts to return.
 *  @property [offset] Offset needed to return a specific subset of posts.
 *  @property [fields]
 */
class WallSearchMethodExtended() : VkMethod<SearchExtendedResponse>(
    "wall.search",
    mutableMapOf("extended" to "1")
) {

    var ownerId: Long? by props
    var domain: String? by props
    var query: String? by props
    var ownersOnly: Boolean? by props
    var count: Long? by props
    var offset: Long? by props
    var fields: Array<String>? by props

    constructor(
        ownerId: Long? = null,
        domain: String? = null,
        query: String? = null,
        ownersOnly: Boolean? = null,
        count: Long? = null,
        offset: Long? = null,
        fields: Array<String>? = null
    ) : this() {
        this.ownerId = ownerId
        this.domain = domain
        this.query = query
        this.ownersOnly = ownersOnly
        this.count = count
        this.offset = offset
        this.fields = fields
    }

    fun setOwnerId(ownerId: Long): WallSearchMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setDomain(domain: String): WallSearchMethodExtended {
        this.domain = domain
        return this
    }

    fun setQuery(query: String): WallSearchMethodExtended {
        this.query = query
        return this
    }

    fun setOwnersOnly(ownersOnly: Boolean): WallSearchMethodExtended {
        this.ownersOnly = ownersOnly
        return this
    }

    fun setCount(count: Long): WallSearchMethodExtended {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): WallSearchMethodExtended {
        this.offset = offset
        return this
    }

    fun setFields(fields: Array<String>): WallSearchMethodExtended {
        this.fields = fields
        return this
    }

    override val classRef = WallSearchMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<SearchExtendedResponse>>() {}
    }
}
