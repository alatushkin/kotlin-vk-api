@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.polls.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.polls.Poll
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/polls.create]
 *
 * Creates polls that can be attached to the users' or communities' posts.
 *
 * @property question question text
 * @property isAnonymous '1' – anonymous poll, participants list is hidden,, '0' – public poll, participants list is available,, Default value is '0'.
 * @property ownerId If a poll will be added to a communty it is required to send a negative group identifier. Current user by default.
 * @property addAnswers available answers list, for example: " ["yes","no","maybe"]", There can be from 1 to 10 answers.
 */
class PollsCreateMethod(
        question: String? = null,
        isAnonymous: Boolean? = null,
        ownerId: Long? = null,
        addAnswers: String? = null
) : VkMethod<Poll>(
    "polls.create",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Poll>>() {}
), UserMethod {

    var question: String? by props
    var isAnonymous: Boolean? by props
    var ownerId: Long? by props
    var addAnswers: String? by props

    init {
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
}
