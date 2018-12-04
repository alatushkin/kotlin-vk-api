@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.editList]
 *
 * Edits a friend list of the current user.
 *
 * @property name Name of the friend list.
 * @property listId Friend list ID.
 * @property userIds IDs of users in the friend list.
 * @property addUserIds (Applies if 'user_ids' parameter is not set.), User IDs to add to the friend list.
 * @property deleteUserIds (Applies if 'user_ids' parameter is not set.), User IDs to delete from the friend list.
 */
class FriendsEditListMethod(
        name: String? = null,
        listId: Long,
        userIds: Array<Long>? = null,
        addUserIds: Array<Long>? = null,
        deleteUserIds: Array<Long>? = null
) : VkMethod<Boolean>(
    "friends.editList",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var name: String? by props
    var listId: Long by props
    var userIds: Array<Long>? by props
    var addUserIds: Array<Long>? by props
    var deleteUserIds: Array<Long>? by props

    init {
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
}
