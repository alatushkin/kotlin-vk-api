@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.friends.FriendStatus
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.areFriends]
 *
 * Checks the current user's friendship status with other specified users.
 *
 * @property userIds IDs of the users whose friendship status to check.
 * @property needSign '1' — to return 'sign' field. 'sign' is md5("{id}_{user_id}_{friends_status}_{application_secret}"), where id is current user ID. This field allows to check that data has not been modified by the client. By default: '0'.
 */
class FriendsAreFriendsMethod(
        userIds: Array<Long>,
        needSign: Boolean? = null
) : VkMethod<Array<FriendStatus>>(
    "friends.areFriends",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<FriendStatus>>>() {}
), UserMethod {

    var userIds: Array<Long> by props
    var needSign: Boolean? by props

    init {
        this.userIds = userIds
        this.needSign = needSign
    }

    fun setUserIds(userIds: Array<Long>): FriendsAreFriendsMethod {
        this.userIds = userIds
        return this
    }

    fun setNeedSign(needSign: Boolean): FriendsAreFriendsMethod {
        this.needSign = needSign
        return this
    }
}
