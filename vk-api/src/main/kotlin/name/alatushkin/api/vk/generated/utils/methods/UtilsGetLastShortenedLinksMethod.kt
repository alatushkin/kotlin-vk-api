@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.utils.LastShortenedLink
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/utils.getLastShortenedLinks]
 *
 * Returns a list of user's shortened links.
 *
 * @property count Number of links to return.
 * @property offset Offset needed to return a specific subset of links.
 */
class UtilsGetLastShortenedLinksMethod(
    count: Long? = null,
    offset: Long? = null
) : VkMethod<VkList<LastShortenedLink>>(
    "utils.getLastShortenedLinks",
    mutableMapOf(),
    successReference()
), UserGroupServiceMethod {

    var count: Long? by props
    var offset: Long? by props

    init {
        this.count = count
        this.offset = offset
    }
}
