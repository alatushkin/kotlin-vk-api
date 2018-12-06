@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.status.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.status.Status
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/status.get]
 *
 * Returns data required to show the status of a user or community.
 *
 * @property userId User ID or community ID. Use a negative value to designate a community ID.
 * @property groupId 
 */
class StatusGetMethod(
    userId: Long? = null,
    groupId: Long? = null
) : VkMethod<Status>(
    "status.get",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long? by props
    var groupId: Long? by props

    init {
        this.userId = userId
        this.groupId = groupId
    }
}
