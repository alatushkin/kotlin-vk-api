package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.friends.FriendStatus

/**
 *  Checks the current user's friendship status with other specified users.
 *
 *  [https://vk.com/dev/friends.areFriends]
 *  @property [user_ids] IDs of the users whose friendship status to check.
 *  @property [need_sign] '1' — to return 'sign' field. 'sign' is md5("{id}_{user_id}_{friends_status}_{application_secret}"), where id is current user ID. This field allows to check that data has not been modified by the client. By default: '0'.
 */
class FriendsAreFriendsMethod() : VkMethod<Array<FriendStatus>>(
    "friends.areFriends",
    HashMap()
) {

    var userIds: Array<Long>? by props
    var needSign: Boolean? by props

    constructor(
        userIds: Array<Long>? = null,
        needSign: Boolean? = null
    ) : this() {
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

    override val classRef = FriendsAreFriendsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<FriendStatus>>>() {}
    }
}
