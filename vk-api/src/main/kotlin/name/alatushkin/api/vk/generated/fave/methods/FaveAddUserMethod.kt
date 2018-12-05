@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.addUser]
 *
 * Adds a profile to user faves.
 *
 * @property userId Profile ID.
 */
class FaveAddUserMethod(
        userId: Long
) : VkMethod<Boolean>(
    "fave.addUser",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var userId: Long by props

    init {
        this.userId = userId
    }

    fun setUserId(userId: Long): FaveAddUserMethod {
        this.userId = userId
        return this
    }
}
