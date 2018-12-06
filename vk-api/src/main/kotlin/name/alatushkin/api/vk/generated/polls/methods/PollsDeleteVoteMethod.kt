@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.polls.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/polls.deleteVote]
 *
 * Deletes the current user's vote from the selected answer in the poll.
 *
 * @property ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 * @property pollId Poll ID.
 * @property answerId Answer ID.
 * @property isBoard 
 */
class PollsDeleteVoteMethod(
    ownerId: Long? = null,
    pollId: Long,
    answerId: Long,
    isBoard: Boolean? = null
) : VkMethod<Boolean>(
    "polls.deleteVote",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var pollId: Long by props
    var answerId: Long by props
    var isBoard: Boolean? by props

    init {
        this.ownerId = ownerId
        this.pollId = pollId
        this.answerId = answerId
        this.isBoard = isBoard
    }
}
