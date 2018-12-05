@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.addBan]
 *
 * Prevents news from specified users and communities from appearing in the current user's newsfeed.
 *
 * @property userIds 
 * @property groupIds 
 */
class NewsfeedAddBanMethod(
        userIds: Array<Long>? = null,
        groupIds: Array<Long>? = null
) : VkMethod<Boolean>(
    "newsfeed.addBan",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var userIds: Array<Long>? by props
    var groupIds: Array<Long>? by props

    init {
        this.userIds = userIds
        this.groupIds = groupIds
    }

    fun setUserIds(userIds: Array<Long>): NewsfeedAddBanMethod {
        this.userIds = userIds
        return this
    }

    fun setGroupIds(groupIds: Array<Long>): NewsfeedAddBanMethod {
        this.groupIds = groupIds
        return this
    }
}
