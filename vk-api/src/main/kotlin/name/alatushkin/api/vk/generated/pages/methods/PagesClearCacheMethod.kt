@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/pages.clearCache]
 *
 * Allows to clear the cache of particular 'external' pages which may be attached to VK posts.
 *
 * @property url Address of the page where you need to refesh the cached version
 */
class PagesClearCacheMethod(
        url: String
) : VkMethod<Boolean>(
    "pages.clearCache",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserServiceMethod {

    var url: String by props

    init {
        this.url = url
    }

    fun setUrl(url: String): PagesClearCacheMethod {
        this.url = url
        return this
    }
}
