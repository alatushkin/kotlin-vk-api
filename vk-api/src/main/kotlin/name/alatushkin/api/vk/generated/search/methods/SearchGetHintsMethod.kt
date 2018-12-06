@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.search.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.search.GetHintsResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/search.getHints]
 *
 * Allows the programmer to do a quick search for any substring.
 *
 * @property q Search query string.
 * @property offset Offset for querying specific result subset
 * @property limit Maximum number of results to return.
 * @property filters 
 * @property searchGlobal 
 */
class SearchGetHintsMethod(
    q: String? = null,
    offset: Long? = null,
    limit: Long? = null,
    filters: Array<String>? = null,
    searchGlobal: Boolean? = null
) : VkMethod<GetHintsResponse>(
    "search.getHints",
    mutableMapOf(),
    successReference()
), UserMethod {

    var q: String? by props
    var offset: Long? by props
    var limit: Long? by props
    var filters: Array<String>? by props
    var searchGlobal: Boolean? by props

    init {
        this.q = q
        this.offset = offset
        this.limit = limit
        this.filters = filters
        this.searchGlobal = searchGlobal
    }
}
