@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.utils.ShortLink
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/utils.getShortLink]
 *
 * Allows to receive a link shortened via vk.cc.
 *
 * @property url URL to be shortened.
 * @property private 1 — private stats, 0 — public stats.
 */
class UtilsGetShortLinkMethod(
        url: String,
        private: Boolean? = null
) : VkMethod<ShortLink>(
    "utils.getShortLink",
    mutableMapOf(),
    object : TypeReference<VkSuccess<ShortLink>>() {}
), UserGroupServiceMethod {

    var url: String by props
    var private: Boolean? by props

    init {
        this.url = url
        this.private = private
    }

    fun setUrl(url: String): UtilsGetShortLinkMethod {
        this.url = url
        return this
    }

    fun setPrivate(private: Boolean): UtilsGetShortLinkMethod {
        this.private = private
        return this
    }
}
