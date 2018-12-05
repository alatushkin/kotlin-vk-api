@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.utils.LinkChecked
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/utils.checkLink]
 *
 * Checks whether a link is blocked in VK.
 *
 * @property url Link to check (e.g., 'http://google.com').
 */
class UtilsCheckLinkMethod(
        url: String
) : VkMethod<LinkChecked>(
    "utils.checkLink",
    mutableMapOf(),
    object : TypeReference<VkResponse<LinkChecked>>() {}
), UserGroupServiceMethod {

    var url: String by props

    init {
        this.url = url
    }

    fun setUrl(url: String): UtilsCheckLinkMethod {
        this.url = url
        return this
    }
}
