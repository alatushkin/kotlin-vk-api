@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.docs.Doc
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/docs.search]
 *
 * Returns a list of documents matching the search criteria.
 *
 * @property q Search query string.
 * @property searchOwn 
 * @property count Number of results to return.
 * @property offset Offset needed to return a specific subset of results.
 */
class DocsSearchMethod(
        q: String,
        searchOwn: Boolean? = null,
        count: Long? = null,
        offset: Long? = null
) : VkMethod<VkList<Doc>>(
    "docs.search",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<Doc>>>() {}
), UserGroupMethod {

    var q: String by props
    var searchOwn: Boolean? by props
    var count: Long? by props
    var offset: Long? by props

    init {
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
}
