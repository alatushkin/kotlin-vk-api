@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.addGroup]
 *
 * Adds a community to user faves.
 *
 * @property groupId Community ID.
 */
class FaveAddGroupMethod(
    groupId: Long
) : VkMethod<Boolean>(
    "fave.addGroup",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }
}
