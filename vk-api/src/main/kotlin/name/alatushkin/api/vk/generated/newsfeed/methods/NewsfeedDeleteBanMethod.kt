@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.deleteBan]
 *
 * Allows news from previously banned users and communities to be shown in the current user's newsfeed.
 *
 * @property userIds 
 * @property groupIds 
 */
class NewsfeedDeleteBanMethod(
    userIds: Array<Long>? = null,
    groupIds: Array<Long>? = null
) : VkMethod<Boolean>(
    "newsfeed.deleteBan",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userIds: Array<Long>? by props
    var groupIds: Array<Long>? by props

    init {
        this.userIds = userIds
        this.groupIds = groupIds
    }
}
