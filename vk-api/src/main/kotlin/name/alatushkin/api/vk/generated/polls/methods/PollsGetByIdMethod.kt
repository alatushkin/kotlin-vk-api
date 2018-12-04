package name.alatushkin.api.vk.generated.polls.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.polls.Poll

/**
 *  Returns detailed information about a poll by its ID.
 *
 *  [https://vk.com/dev/polls.getById]
 *  @property [owner_id] ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 *  @property [is_board] '1' – poll is in a board, '0' – poll is on a wall. '0' by default.
 *  @property [poll_id] Poll ID.
 */
class PollsGetByIdMethod() : VkMethod<Poll>(
    "polls.getById",
    HashMap()
) {

    var ownerId: Long? by props
    var isBoard: Boolean? by props
    var pollId: Long? by props

    constructor(
        ownerId: Long? = null,
        isBoard: Boolean? = null,
        pollId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.isBoard = isBoard
        this.pollId = pollId
    }

    fun setOwnerId(ownerId: Long): PollsGetByIdMethod {
        this.ownerId = ownerId
        return this
    }

    fun setIsBoard(isBoard: Boolean): PollsGetByIdMethod {
        this.isBoard = isBoard
        return this
    }

    fun setPollId(pollId: Long): PollsGetByIdMethod {
        this.pollId = pollId
        return this
    }

    override val classRef = PollsGetByIdMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Poll>>() {}
    }
}
