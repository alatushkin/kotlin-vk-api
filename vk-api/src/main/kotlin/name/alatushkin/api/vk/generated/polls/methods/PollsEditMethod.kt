@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.polls.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/polls.edit]
 *
 * Edits created polls
 *
 * @property ownerId poll owner id
 * @property pollId edited poll's id
 * @property question new question text
 * @property addAnswers answers list, for example: , "["yes","no","maybe"]"
 * @property editAnswers object containing answers that need to be edited,, key – answer id, value – new answer text. Example: {"382967099":"option1", "382967103":"option2"}"
 * @property deleteAnswers list of answer ids to be deleted. For example: "[382967099, 382967103]"
 */
class PollsEditMethod(
    ownerId: Long,
    pollId: Long,
    question: String? = null,
    addAnswers: String? = null,
    editAnswers: String? = null,
    deleteAnswers: String? = null
) : VkMethod<Boolean>(
    "polls.edit",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var pollId: Long by props
    var question: String? by props
    var addAnswers: String? by props
    var editAnswers: String? by props
    var deleteAnswers: String? by props

    init {
        this.ownerId = ownerId
        this.pollId = pollId
        this.question = question
        this.addAnswers = addAnswers
        this.editAnswers = editAnswers
        this.deleteAnswers = deleteAnswers
    }
}
