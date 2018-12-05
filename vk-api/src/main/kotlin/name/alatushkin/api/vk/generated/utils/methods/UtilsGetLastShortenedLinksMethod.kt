@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.utils.LastShortenedLink
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
    object : TypeReference<VkResponse<VkList<LastShortenedLink>>>() {}
), UserGroupServiceMethod {

    var count: Long? by props
    var offset: Long? by props

    init {
        this.count = count
        this.offset = offset
    }

    fun setCount(count: Long): UtilsGetLastShortenedLinksMethod {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): UtilsGetLastShortenedLinksMethod {
        this.offset = offset
        return this
    }
}
