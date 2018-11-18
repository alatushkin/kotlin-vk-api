package name.alatushkin.api.vk.generated.polls.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Edits created polls
 *
 *  [https://vk.com/dev/polls.edit]
 *  @property [owner_id] poll owner id
 *  @property [poll_id] edited poll's id
 *  @property [question] new question text
 *  @property [add_answers] answers list, for example: , "["yes","no","maybe"]"
 *  @property [edit_answers] object containing answers that need to be edited,, key – answer id, value – new answer text. Example: {"382967099":"option1", "382967103":"option2"}"
 *  @property [delete_answers] list of answer ids to be deleted. For example: "[382967099, 382967103]"
 */
class PollsEditMethod() : VkMethod<Boolean>(
    "polls.edit",
    HashMap()
) {

    var ownerId: Long? by props
    var pollId: Long? by props
    var question: String? by props
    var addAnswers: String? by props
    var editAnswers: String? by props
    var deleteAnswers: String? by props

    constructor(
        ownerId: Long? = null,
        pollId: Long? = null,
        question: String? = null,
        addAnswers: String? = null,
        editAnswers: String? = null,
        deleteAnswers: String? = null
    ) : this() {
        this.ownerId = ownerId
        this.pollId = pollId
        this.question = question
        this.addAnswers = addAnswers
        this.editAnswers = editAnswers
        this.deleteAnswers = deleteAnswers
    }

    fun setOwnerId(ownerId: Long): PollsEditMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPollId(pollId: Long): PollsEditMethod {
        this.pollId = pollId
        return this
    }

    fun setQuestion(question: String): PollsEditMethod {
        this.question = question
        return this
    }

    fun setAddAnswers(addAnswers: String): PollsEditMethod {
        this.addAnswers = addAnswers
        return this
    }

    fun setEditAnswers(editAnswers: String): PollsEditMethod {
        this.editAnswers = editAnswers
        return this
    }

    fun setDeleteAnswers(deleteAnswers: String): PollsEditMethod {
        this.deleteAnswers = deleteAnswers
        return this
    }

    override val classRef = PollsEditMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
