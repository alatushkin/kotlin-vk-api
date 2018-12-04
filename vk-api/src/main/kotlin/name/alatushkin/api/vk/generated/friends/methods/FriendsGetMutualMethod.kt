@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getMutual]
 *
 * Returns a list of user IDs of the mutual friends of two users.
 *
 * @property sourceUid ID of the user whose friends will be checked against the friends of the user specified in 'target_uid'.
 * @property targetUid ID of the user whose friends will be checked against the friends of the user specified in 'source_uid'.
 * @property order Sort order: 'random' — random order
 * @property count Number of mutual friends to return.
 * @property offset Offset needed to return a specific subset of mutual friends.
 */
class FriendsGetMutualMethod(
        sourceUid: Long? = null,
        targetUid: Long? = null,
        order: String? = null,
        count: Long? = null,
        offset: Long? = null
) : VkMethod<Array<Long>>(
    "friends.getMutual",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Array<Long>>>() {}
), UserMethod {

    var sourceUid: Long? by props
    var targetUid: Long? by props
    var order: String? by props
    var count: Long? by props
    var offset: Long? by props

    init {
        this.sourceUid = sourceUid
        this.targetUid = targetUid
        this.order = order
        this.count = count
        this.offset = offset
    }

    fun setSourceUid(sourceUid: Long): FriendsGetMutualMethod {
        this.sourceUid = sourceUid
        return this
    }

    fun setTargetUid(targetUid: Long): FriendsGetMutualMethod {
        this.targetUid = targetUid
        return this
    }

    fun setOrder(order: String): FriendsGetMutualMethod {
        this.order = order
        return this
    }

    fun setCount(count: Long): FriendsGetMutualMethod {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): FriendsGetMutualMethod {
        this.offset = offset
        return this
    }
}
