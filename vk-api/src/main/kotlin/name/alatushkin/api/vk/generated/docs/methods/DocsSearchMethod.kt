@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.docs.Doc
import name.alatushkin.api.vk.successReference
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
    successReference()
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
}
