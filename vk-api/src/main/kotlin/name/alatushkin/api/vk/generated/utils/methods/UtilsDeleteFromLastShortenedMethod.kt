@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Boolean>>() {}
), UserGroupServiceMethod {

    var key: String by props

    init {
        this.key = key
    }

    fun setKey(key: String): UtilsDeleteFromLastShortenedMethod {
        this.key = key
        return this
    }
}
