@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.secure.Level
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.getUserLevel]
 *
 * Returns one of the previously set game levels of one or more users in the application.
 *
 * @property userIds 
 */
class SecureGetUserLevelMethod(
        userIds: Array<Long>
) : VkMethod<Array<Level>>(
    "secure.getUserLevel",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<Level>>>() {}
), ServiceMethod {

    var userIds: Array<Long> by props

    init {
        this.userIds = userIds
    }

    fun setUserIds(userIds: Array<Long>): SecureGetUserLevelMethod {
        this.userIds = userIds
        return this
    }
}
