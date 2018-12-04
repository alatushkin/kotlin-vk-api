package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.friends.AddListResponse

/**
 *  Creates a new friend list for the current user.
 *
 *  [https://vk.com/dev/friends.addList]
 *  @property [name] Name of the friend list.
 *  @property [user_ids] IDs of users to be added to the friend list.
 */
class FriendsAddListMethod() : VkMethod<AddListResponse>(
    "friends.addList",
    HashMap()
) {

    var name: String? by props
    var userIds: Array<Long>? by props

    constructor(
        name: String? = null,
        userIds: Array<Long>? = null
    ) : this() {
        this.name = name
        this.userIds = userIds
    }

    fun setName(name: String): FriendsAddListMethod {
        this.name = name
        return this
    }

    fun setUserIds(userIds: Array<Long>): FriendsAddListMethod {
        this.userIds = userIds
        return this
    }

    override val classRef = FriendsAddListMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<AddListResponse>>() {}
    }
}
