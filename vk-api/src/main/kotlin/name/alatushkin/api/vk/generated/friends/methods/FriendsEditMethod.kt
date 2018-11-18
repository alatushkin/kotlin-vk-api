package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Edits the friend lists of the selected user.
 *
 *  [https://vk.com/dev/friends.edit]
 *  @property [user_id] ID of the user whose friend list is to be edited.
 *  @property [list_ids] IDs of the friend lists to which to add the user.
 */
class FriendsEditMethod() : VkMethod<Boolean>(
    "friends.edit",
    HashMap()
) {

    var userId: Long? by props
    var listIds: Array<Long>? by props

    constructor(
        userId: Long? = null,
        listIds: Array<Long>? = null
    ) : this() {
        this.userId = userId
        this.listIds = listIds
    }

    fun setUserId(userId: Long): FriendsEditMethod {
        this.userId = userId
        return this
    }

    fun setListIds(listIds: Array<Long>): FriendsEditMethod {
        this.listIds = listIds
        return this
    }

    override val classRef = FriendsEditMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
