package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.docs.Doc

/**
 *  Returns a list of documents matching the search criteria.
 *
 *  [https://vk.com/dev/docs.search]
 *  @property [q] Search query string.
 *  @property [search_own]
 *  @property [count] Number of results to return.
 *  @property [offset] Offset needed to return a specific subset of results.
 */
class DocsSearchMethod() : VkMethod<VkList<Doc>>(
    "docs.search",
    HashMap()
) {

    var q: String? by props
    var searchOwn: Boolean? by props
    var count: Long? by props
    var offset: Long? by props

    constructor(
        q: String? = null,
        searchOwn: Boolean? = null,
        count: Long? = null,
        offset: Long? = null
    ) : this() {
        this.q = q
        this.searchOwn = searchOwn
        this.count = count
        this.offset = offset
    }

    fun setQ(q: String): DocsSearchMethod {
        this.q = q
        return this
    }

    fun setSearchOwn(searchOwn: Boolean): DocsSearchMethod {
        this.searchOwn = searchOwn
        return this
    }

    fun setCount(count: Long): DocsSearchMethod {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): DocsSearchMethod {
        this.offset = offset
        return this
    }

    override val classRef = DocsSearchMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Doc>>>() {}
    }
}
