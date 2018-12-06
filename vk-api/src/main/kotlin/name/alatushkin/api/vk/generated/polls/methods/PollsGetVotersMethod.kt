@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.polls.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.polls.Voters
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/polls.getVoters]
 *
 * Returns a list of IDs of users who selected specific answers in the poll.
 *
 * @property ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 * @property pollId Poll ID.
 * @property answerIds Answer IDs.
 * @property isBoard 
 * @property friendsOnly '1' — to return only current user's friends, '0' — to return all users (default),
 * @property offset Offset needed to return a specific subset of voters. '0' — (default)
 * @property count Number of user IDs to return (if the 'friends_only' parameter is not set, maximum '1000', otherwise '10'). '100' — (default)
 * @property fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate (birthdate)', 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online', 'counters'.
 * @property nameCase Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class PollsGetVotersMethod(
    ownerId: Long? = null,
    pollId: Long,
    answerIds: Array<Long>,
    isBoard: Boolean? = null,
    friendsOnly: Boolean? = null,
    offset: Long? = null,
    count: Long? = null,
    fields: Array<String>? = null,
    nameCase: NameCase? = null
) : VkMethod<Array<Voters>>(
    "polls.getVoters",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var pollId: Long by props
    var answerIds: Array<Long> by props
    var isBoard: Boolean? by props
    var friendsOnly: Boolean? by props
    var offset: Long? by props
    var count: Long? by props
    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    init {
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
}
