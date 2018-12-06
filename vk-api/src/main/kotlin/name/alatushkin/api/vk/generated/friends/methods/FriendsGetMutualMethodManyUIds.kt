@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.friends.MutualFriend
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getMutual]
 *
 * Returns a list of user IDs of the mutual friends of two users.
 *
 * @property sourceUid ID of the user whose friends will be checked against the friends of the user specified in 'target_uid'.
 * @property targetUid ID of the user whose friends will be checked against the friends of the user specified in 'source_uid'.
 * @property targetUids IDs of the users whose friends will be checked against the friends of the user specified in 'source_uid'.
 * @property order Sort order: 'random' — random order
 * @property count Number of mutual friends to return.
 * @property offset Offset needed to return a specific subset of mutual friends.
 */
class FriendsGetMutualMethodManyUIds(
    sourceUid: Long? = null,
    targetUid: Long? = null,
    targetUids: Array<Long>? = null,
    order: String? = null,
    count: Long? = null,
    offset: Long? = null
) : VkMethod<Array<MutualFriend>>(
    "friends.getMutual",
    mutableMapOf(),
    successReference()
), UserMethod {

    var sourceUid: Long? by props
    var targetUid: Long? by props
    var targetUids: Array<Long>? by props
    var order: String? by props
    var count: Long? by props
    var offset: Long? by props

    init {
        this.sourceUid = sourceUid
        this.targetUid = targetUid
        this.targetUids = targetUids
        this.order = order
        this.count = count
        this.offset = offset
    }
}
