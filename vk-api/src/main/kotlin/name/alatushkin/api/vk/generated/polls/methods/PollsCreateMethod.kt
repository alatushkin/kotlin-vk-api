@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.polls.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.polls.Poll
import name.alatushkin.api.vk.successReference
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
    successReference()
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
}
