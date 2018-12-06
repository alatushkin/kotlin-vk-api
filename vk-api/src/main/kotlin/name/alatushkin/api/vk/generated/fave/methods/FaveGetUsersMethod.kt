@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.users.UserMin
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.getUsers]
 *
 * Returns a list of users whom the current user has bookmarked.
 *
 * @property offset Offset needed to return a specific subset of users.
 * @property count Number of users to return.
 */
class FaveGetUsersMethod(
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<UserMin>>(
    "fave.getUsers",
    mutableMapOf(),
    successReference()
), UserMethod {

    var offset: Long? by props
    var count: Long? by props

    init {
        this.offset = offset
        this.count = count
    }
}
