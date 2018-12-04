package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.wall.WallpostFull

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
class WallSearchMethod() : VkMethod<VkList<WallpostFull>>(
    "wall.search",
    mutableMapOf()
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

    fun setOwnerId(ownerId: Long): WallSearchMethod {
        this.ownerId = ownerId
        return this
    }

    fun setDomain(domain: String): WallSearchMethod {
        this.domain = domain
        return this
    }

    fun setQuery(query: String): WallSearchMethod {
        this.query = query
        return this
    }

    fun setOwnersOnly(ownersOnly: Boolean): WallSearchMethod {
        this.ownersOnly = ownersOnly
        return this
    }

    fun setCount(count: Long): WallSearchMethod {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): WallSearchMethod {
        this.offset = offset
        return this
    }

    fun setFields(fields: Array<String>): WallSearchMethod {
        this.fields = fields
        return this
    }

    override val classRef = WallSearchMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<WallpostFull>>>() {}
    }
}
