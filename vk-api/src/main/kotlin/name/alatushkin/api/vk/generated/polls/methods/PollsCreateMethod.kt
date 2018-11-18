package name.alatushkin.api.vk.generated.polls.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.polls.Poll

/**
 *  Creates polls that can be attached to the users' or communities' posts.
 *
 *  [https://vk.com/dev/polls.create]
 *  @property [question] question text
 *  @property [is_anonymous] '1' – anonymous poll, participants list is hidden,, '0' – public poll, participants list is available,, Default value is '0'.
 *  @property [owner_id] If a poll will be added to a communty it is required to send a negative group identifier. Current user by default.
 *  @property [add_answers] available answers list, for example: " ["yes","no","maybe"]", There can be from 1 to 10 answers.
 */
class PollsCreateMethod() : VkMethod<Poll>(
    "polls.create",
    HashMap()
) {

    var question: String? by props
    var isAnonymous: Boolean? by props
    var ownerId: Long? by props
    var addAnswers: String? by props

    constructor(
        question: String? = null,
        isAnonymous: Boolean? = null,
        ownerId: Long? = null,
        addAnswers: String? = null
    ) : this() {
        this.question = question
        this.isAnonymous = isAnonymous
        this.ownerId = ownerId
        this.addAnswers = addAnswers
    }

    fun setQuestion(question: String): PollsCreateMethod {
        this.question = question
        return this
    }

    fun setIsAnonymous(isAnonymous: Boolean): PollsCreateMethod {
        this.isAnonymous = isAnonymous
        return this
    }

    fun setOwnerId(ownerId: Long): PollsCreateMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAddAnswers(addAnswers: String): PollsCreateMethod {
        this.addAnswers = addAnswers
        return this
    }

    override val classRef = PollsCreateMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Poll>>() {}
    }
}
