@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.fave.FavesLink
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.getLinks]
 *
 * Returns a list of links that the current user has bookmarked.
 *
 * @property offset Offset needed to return a specific subset of users.
 * @property count Number of results to return.
 */
class FaveGetLinksMethod(
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<FavesLink>>(
    "fave.getLinks",
    mutableMapOf(),
    successReference()
), UserMethod {

    var offset: Long? by props
    var count: Long? by props

    init {
        this.offset = offset
        this.count = count
    }
}
