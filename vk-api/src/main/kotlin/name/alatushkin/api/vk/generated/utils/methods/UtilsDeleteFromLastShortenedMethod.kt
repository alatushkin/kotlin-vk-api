@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/utils.deleteFromLastShortened]
 *
 * Deletes shortened link from user's list.
 *
 * @property key Link key (characters after vk.cc/).
 */
class UtilsDeleteFromLastShortenedMethod(
    key: String
) : VkMethod<Boolean>(
    "utils.deleteFromLastShortened",
    mutableMapOf(),
    successReference()
), UserGroupServiceMethod {

    var key: String by props

    init {
        this.key = key
    }
}
