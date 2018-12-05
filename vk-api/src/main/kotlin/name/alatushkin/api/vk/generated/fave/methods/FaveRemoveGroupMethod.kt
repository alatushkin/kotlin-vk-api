@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var groupId: Long by props

    init {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): FaveRemoveGroupMethod {
        this.groupId = groupId
        return this
    }
}
