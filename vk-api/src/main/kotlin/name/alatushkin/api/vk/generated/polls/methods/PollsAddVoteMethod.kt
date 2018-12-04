@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.polls.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/polls.addVote]
 *
 * Adds the current user's vote to the selected answer in the poll.
 *
 * @property ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 * @property pollId Poll ID.
 * @property answerId Answer ID.
 * @property isBoard 
 */
class PollsAddVoteMethod(
        ownerId: Long? = null,
        pollId: Long,
        answerId: Long,
        isBoard: Boolean? = null
) : VkMethod<Boolean>(
    "polls.addVote",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
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

    fun setOwnerId(ownerId: Long): PollsAddVoteMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPollId(pollId: Long): PollsAddVoteMethod {
        this.pollId = pollId
        return this
    }

    fun setAnswerId(answerId: Long): PollsAddVoteMethod {
        this.answerId = answerId
        return this
    }

    fun setIsBoard(isBoard: Boolean): PollsAddVoteMethod {
        this.isBoard = isBoard
        return this
    }
}
