package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Edits a friend list of the current user.
 *
 *  [https://vk.com/dev/friends.editList]
 *  @property [name] Name of the friend list.
 *  @property [list_id] Friend list ID.
 *  @property [user_ids] IDs of users in the friend list.
 *  @property [add_user_ids] (Applies if 'user_ids' parameter is not set.), User IDs to add to the friend list.
 *  @property [delete_user_ids] (Applies if 'user_ids' parameter is not set.), User IDs to delete from the friend list.
 */
class FriendsEditListMethod() : VkMethod<Boolean>(
    "friends.editList",
    HashMap()
) {

    var name: String? by props
    var listId: Long? by props
    var userIds: Array<Long>? by props
    var addUserIds: Array<Long>? by props
    var deleteUserIds: Array<Long>? by props

    constructor(
        name: String? = null,
        listId: Long? = null,
        userIds: Array<Long>? = null,
        addUserIds: Array<Long>? = null,
        deleteUserIds: Array<Long>? = null
    ) : this() {
        this.name = name
        this.listId = listId
        this.userIds = userIds
        this.addUserIds = addUserIds
        this.deleteUserIds = deleteUserIds
    }

    fun setName(name: String): FriendsEditListMethod {
        this.name = name
        return this
    }

    fun setListId(listId: Long): FriendsEditListMethod {
        this.listId = listId
        return this
    }

    fun setUserIds(userIds: Array<Long>): FriendsEditListMethod {
        this.userIds = userIds
        return this
    }

    fun setAddUserIds(addUserIds: Array<Long>): FriendsEditListMethod {
        this.addUserIds = addUserIds
        return this
    }

    fun setDeleteUserIds(deleteUserIds: Array<Long>): FriendsEditListMethod {
        this.deleteUserIds = deleteUserIds
        return this
    }

    override val classRef = FriendsEditListMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
