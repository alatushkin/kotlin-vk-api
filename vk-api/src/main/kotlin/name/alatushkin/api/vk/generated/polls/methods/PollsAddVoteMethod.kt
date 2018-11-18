package name.alatushkin.api.vk.generated.polls.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Adds the current user's vote to the selected answer in the poll.
 *
 *  [https://vk.com/dev/polls.addVote]
 *  @property [owner_id] ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 *  @property [poll_id] Poll ID.
 *  @property [answer_id] Answer ID.
 *  @property [is_board] null
 */
class PollsAddVoteMethod() : VkMethod<Boolean>(
    "polls.addVote",
    HashMap()
) {

    var ownerId: Long? by props
    var pollId: Long? by props
    var answerId: Long? by props
    var isBoard: Boolean? by props

    constructor(
        ownerId: Long? = null,
        pollId: Long? = null,
        answerId: Long? = null,
        isBoard: Boolean? = null
    ) : this() {
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

    override val classRef = PollsAddVoteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
