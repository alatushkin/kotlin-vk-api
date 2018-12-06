@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.status.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/status.set]
 *
 * Sets a new status for the current user.
 *
 * @property text Text of the new status.
 * @property groupId Identifier of a community to set a status in. If left blank the status is set to current user.
 */
class StatusSetMethod(
    text: String? = null,
    groupId: Long? = null
) : VkMethod<Boolean>(
    "status.set",
    mutableMapOf(),
    successReference()
), UserMethod {

    var text: String? by props
    var groupId: Long? by props

    init {
        this.text = text
        this.groupId = groupId
    }
}
