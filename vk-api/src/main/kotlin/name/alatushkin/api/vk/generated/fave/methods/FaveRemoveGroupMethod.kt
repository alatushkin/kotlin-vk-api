@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.removeGroup]
 *
 * Removes a community from user faves.
 *
 * @property groupId Community ID.
 */
class FaveRemoveGroupMethod(
    groupId: Long
) : VkMethod<Boolean>(
    "fave.removeGroup",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }
}
