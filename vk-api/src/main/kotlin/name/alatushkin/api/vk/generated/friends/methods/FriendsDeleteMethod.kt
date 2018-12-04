package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.friends.DeleteResponse

/**
 *  Declines a friend request or deletes a user from the current user's friend list.
 *
 *  [https://vk.com/dev/friends.delete]
 *  @property [user_id] ID of the user whose friend request is to be declined or who is to be deleted from the current user's friend list.
 */
class FriendsDeleteMethod() : VkMethod<DeleteResponse>(
    "friends.delete",
    HashMap()
) {

    var userId: Long? by props

    constructor(
        userId: Long? = null
    ) : this() {
        this.userId = userId
    }

    fun setUserId(userId: Long): FriendsDeleteMethod {
        this.userId = userId
        return this
    }

    override val classRef = FriendsDeleteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<DeleteResponse>>() {}
    }
}
