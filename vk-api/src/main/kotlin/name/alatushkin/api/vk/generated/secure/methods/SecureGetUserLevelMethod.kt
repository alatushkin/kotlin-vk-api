@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.secure.Level
import name.alatushkin.api.vk.successReference
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
    successReference()
), ServiceMethod {

    var userIds: Array<Long> by props

    init {
        this.userIds = userIds
    }
}
