package name.alatushkin.api.vk.generated.polls.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.polls.Voters

/**
 *  Returns a list of IDs of users who selected specific answers in the poll.
 *
 *  [https://vk.com/dev/polls.getVoters]
 *  @property [owner_id] ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 *  @property [poll_id] Poll ID.
 *  @property [answer_ids] Answer IDs.
 *  @property [is_board] null
 *  @property [friends_only] '1' — to return only current user's friends, '0' — to return all users (default),
 *  @property [offset] Offset needed to return a specific subset of voters. '0' — (default)
 *  @property [count] Number of user IDs to return (if the 'friends_only' parameter is not set, maximum '1000', otherwise '10'). '100' — (default)
 *  @property [fields] Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate (birthdate)', 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online', 'counters'.
 *  @property [name_case] Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class PollsGetVotersMethod() : VkMethod<Array<Voters>>(
    "polls.getVoters",
    HashMap()
) {

    var ownerId: Long? by props
    var pollId: Long? by props
    var answerIds: Array<Long>? by props
    var isBoard: Boolean? by props
    var friendsOnly: Boolean? by props
    var offset: Long? by props
    var count: Long? by props
    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    constructor(
        ownerId: Long? = null,
        pollId: Long? = null,
        answerIds: Array<Long>? = null,
        isBoard: Boolean? = null,
        friendsOnly: Boolean? = null,
        offset: Long? = null,
        count: Long? = null,
        fields: Array<String>? = null,
        nameCase: NameCase? = null
    ) : this() {
        this.ownerId = ownerId
        this.pollId = pollId
        this.answerIds = answerIds
        this.isBoard = isBoard
        this.friendsOnly = friendsOnly
        this.offset = offset
        this.count = count
        this.fields = fields
        this.nameCase = nameCase
    }

    fun setOwnerId(ownerId: Long): PollsGetVotersMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPollId(pollId: Long): PollsGetVotersMethod {
        this.pollId = pollId
        return this
    }

    fun setAnswerIds(answerIds: Array<Long>): PollsGetVotersMethod {
        this.answerIds = answerIds
        return this
    }

    fun setIsBoard(isBoard: Boolean): PollsGetVotersMethod {
        this.isBoard = isBoard
        return this
    }

    fun setFriendsOnly(friendsOnly: Boolean): PollsGetVotersMethod {
        this.friendsOnly = friendsOnly
        return this
    }

    fun setOffset(offset: Long): PollsGetVotersMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): PollsGetVotersMethod {
        this.count = count
        return this
    }

    fun setFields(fields: Array<String>): PollsGetVotersMethod {
        this.fields = fields
        return this
    }

    fun setNameCase(nameCase: NameCase): PollsGetVotersMethod {
        this.nameCase = nameCase
        return this
    }

    override val classRef = PollsGetVotersMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Voters>>>() {}
    }
}
