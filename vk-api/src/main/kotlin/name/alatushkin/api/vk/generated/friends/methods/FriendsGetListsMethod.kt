package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.friends.FriendsList

/**
 *  Returns a list of the user's friend lists.
 *
 *  [https://vk.com/dev/friends.getLists]
 *  @property [user_id] User ID.
 *  @property [return_system] '1' — to return system friend lists. By default: '0'.
 */
class FriendsGetListsMethod() : VkMethod<VkList<FriendsList>>(
    "friends.getLists",
    HashMap()
) {

    var userId: Long? by props
    var returnSystem: Boolean? by props

    constructor(
        userId: Long? = null,
        returnSystem: Boolean? = null
    ) : this() {
        this.userId = userId
        this.returnSystem = returnSystem
    }

    fun setUserId(userId: Long): FriendsGetListsMethod {
        this.userId = userId
        return this
    }

    fun setReturnSystem(returnSystem: Boolean): FriendsGetListsMethod {
        this.returnSystem = returnSystem
        return this
    }

    override val classRef = FriendsGetListsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<FriendsList>>>() {}
    }
}
