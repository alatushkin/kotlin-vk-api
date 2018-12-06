@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.wall.SearchExtendedResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/wall.search]
 *
 * Allows to search posts on user or community walls.
 *
 * @property ownerId user or community id. "Remember that for a community 'owner_id' must be negative."
 * @property domain user or community screen name.
 * @property query search query string.
 * @property ownersOnly '1' – returns only page owner's posts.
 * @property count count of posts to return.
 * @property offset Offset needed to return a specific subset of posts.
 * @property fields 
 */
class WallSearchMethodExtended(
    ownerId: Long? = null,
    domain: String? = null,
    query: String? = null,
    ownersOnly: Boolean? = null,
    count: Long? = null,
    offset: Long? = null,
    fields: Array<String>? = null
) : VkMethod<SearchExtendedResponse>(
    "wall.search",
    mutableMapOf("extended" to "1"),
    successReference()
), UserServiceMethod {

    var ownerId: Long? by props
    var domain: String? by props
    var query: String? by props
    var ownersOnly: Boolean? by props
    var count: Long? by props
    var offset: Long? by props
    var fields: Array<String>? by props

    init {
        this.ownerId = ownerId
        this.domain = domain
        this.query = query
        this.ownersOnly = ownersOnly
        this.count = count
        this.offset = offset
        this.fields = fields
    }
}
