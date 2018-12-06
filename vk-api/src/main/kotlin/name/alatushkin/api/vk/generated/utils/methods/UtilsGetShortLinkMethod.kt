@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.utils.ShortLink
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserGroupServiceMethod {

    var url: String by props
    var private: Boolean? by props

    init {
        this.url = url
        this.private = private
    }
}
