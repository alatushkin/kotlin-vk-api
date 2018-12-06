@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.utils.LinkChecked
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserGroupServiceMethod {

    var url: String by props

    init {
        this.url = url
    }
}
