package name.alatushkin.api.vk.generated.polls.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Deletes the current user's vote from the selected answer in the poll.
 *
 *  [https://vk.com/dev/polls.deleteVote]
 *  @property [owner_id] ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 *  @property [poll_id] Poll ID.
 *  @property [answer_id] Answer ID.
 *  @property [is_board]
 */
class PollsDeleteVoteMethod() : VkMethod<Boolean>(
    "polls.deleteVote",
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

    fun setOwnerId(ownerId: Long): PollsDeleteVoteMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPollId(pollId: Long): PollsDeleteVoteMethod {
        this.pollId = pollId
        return this
    }

    fun setAnswerId(answerId: Long): PollsDeleteVoteMethod {
        this.answerId = answerId
        return this
    }

    fun setIsBoard(isBoard: Boolean): PollsDeleteVoteMethod {
        this.isBoard = isBoard
        return this
    }

    override val classRef = PollsDeleteVoteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
