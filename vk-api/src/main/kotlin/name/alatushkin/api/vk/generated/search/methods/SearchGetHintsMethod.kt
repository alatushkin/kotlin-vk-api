package name.alatushkin.api.vk.generated.search.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.search.GetHintsResponse

/**
 *  Allows the programmer to do a quick search for any substring.
 *
 *  [https://vk.com/dev/search.getHints]
 *  @property [q] Search query string.
 *  @property [offset] Offset for querying specific result subset
 *  @property [limit] Maximum number of results to return.
 *  @property [filters]
 *  @property [search_global] 
 */
class SearchGetHintsMethod() : VkMethod<GetHintsResponse>(
    "search.getHints",
    HashMap()
) {

    var q: String? by props
    var offset: Long? by props
    var limit: Long? by props
    var filters: Array<String>? by props
    var searchGlobal: Boolean? by props

    constructor(
        q: String? = null,
        offset: Long? = null,
        limit: Long? = null,
        filters: Array<String>? = null,
        searchGlobal: Boolean? = null
    ) : this() {
        this.q = q
        this.offset = offset
        this.limit = limit
        this.filters = filters
        this.searchGlobal = searchGlobal
    }

    fun setQ(q: String): SearchGetHintsMethod {
        this.q = q
        return this
    }

    fun setOffset(offset: Long): SearchGetHintsMethod {
        this.offset = offset
        return this
    }

    fun setLimit(limit: Long): SearchGetHintsMethod {
        this.limit = limit
        return this
    }

    fun setFilters(filters: Array<String>): SearchGetHintsMethod {
        this.filters = filters
        return this
    }

    fun setSearchGlobal(searchGlobal: Boolean): SearchGetHintsMethod {
        this.searchGlobal = searchGlobal
        return this
    }

    override val classRef = SearchGetHintsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GetHintsResponse>>() {}
    }
}
