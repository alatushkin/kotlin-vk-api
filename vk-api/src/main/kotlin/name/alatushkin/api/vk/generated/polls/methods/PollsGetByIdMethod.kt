@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.polls.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.polls.Poll
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/polls.getById]
 *
 * Returns detailed information about a poll by its ID.
 *
 * @property ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 * @property isBoard '1' – poll is in a board, '0' – poll is on a wall. '0' by default.
 * @property pollId Poll ID.
 */
class PollsGetByIdMethod(
    ownerId: Long? = null,
    isBoard: Boolean? = null,
    pollId: Long
) : VkMethod<Poll>(
    "polls.getById",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var isBoard: Boolean? by props
    var pollId: Long by props

    init {
        this.ownerId = ownerId
        this.isBoard = isBoard
        this.pollId = pollId
    }
}
