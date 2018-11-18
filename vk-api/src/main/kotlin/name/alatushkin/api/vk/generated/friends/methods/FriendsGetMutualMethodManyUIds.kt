package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.friends.MutualFriend

/**
 *  Returns a list of user IDs of the mutual friends of two users.
 *
 *  [https://vk.com/dev/friends.getMutual]
 *  @property [source_uid] ID of the user whose friends will be checked against the friends of the user specified in 'target_uid'.
 *  @property [target_uid] ID of the user whose friends will be checked against the friends of the user specified in 'source_uid'.
 *  @property [target_uids] IDs of the users whose friends will be checked against the friends of the user specified in 'source_uid'.
 *  @property [order] Sort order: 'random' — random order
 *  @property [count] Number of mutual friends to return.
 *  @property [offset] Offset needed to return a specific subset of mutual friends.
 */
class FriendsGetMutualMethodManyUIds() : VkMethod<Array<MutualFriend>>(
    "friends.getMutual",
    HashMap()
) {

    var sourceUid: Long? by props
    var targetUid: Long? by props
    var targetUids: Array<Long>? by props
    var order: String? by props
    var count: Long? by props
    var offset: Long? by props

    constructor(
        sourceUid: Long? = null,
        targetUid: Long? = null,
        targetUids: Array<Long>? = null,
        order: String? = null,
        count: Long? = null,
        offset: Long? = null
    ) : this() {
        this.sourceUid = sourceUid
        this.targetUid = targetUid
        this.targetUids = targetUids
        this.order = order
        this.count = count
        this.offset = offset
    }

    fun setSourceUid(sourceUid: Long): FriendsGetMutualMethodManyUIds {
        this.sourceUid = sourceUid
        return this
    }

    fun setTargetUid(targetUid: Long): FriendsGetMutualMethodManyUIds {
        this.targetUid = targetUid
        return this
    }

    fun setTargetUids(targetUids: Array<Long>): FriendsGetMutualMethodManyUIds {
        this.targetUids = targetUids
        return this
    }

    fun setOrder(order: String): FriendsGetMutualMethodManyUIds {
        this.order = order
        return this
    }

    fun setCount(count: Long): FriendsGetMutualMethodManyUIds {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): FriendsGetMutualMethodManyUIds {
        this.offset = offset
        return this
    }

    override val classRef = FriendsGetMutualMethodManyUIds.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<MutualFriend>>>() {}
    }
}
