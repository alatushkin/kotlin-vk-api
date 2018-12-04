@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.removeUser]
 *
 * Removes a profile from user faves.
 *
 * @property userId Profile ID.
 */
class FaveRemoveUserMethod(
        userId: Long
) : VkMethod<Boolean>(
    "fave.removeUser",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var userId: Long by props

    init {
        this.userId = userId
    }

    fun setUserId(userId: Long): FaveRemoveUserMethod {
        this.userId = userId
        return this
    }
}
