package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Deletes a friend list of the current user.
 *
 *  [https://vk.com/dev/friends.deleteList]
 *  @property [list_id] ID of the friend list to delete.
 */
class FriendsDeleteListMethod() : VkMethod<Boolean>(
    "friends.deleteList",
    HashMap()
) {

    var listId: Long? by props

    constructor(
        listId: Long? = null
    ) : this() {
        this.listId = listId
    }

    fun setListId(listId: Long): FriendsDeleteListMethod {
        this.listId = listId
        return this
    }

    override val classRef = FriendsDeleteListMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
