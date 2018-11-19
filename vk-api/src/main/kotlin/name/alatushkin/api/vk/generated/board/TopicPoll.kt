package name.alatushkin.api.vk.generated.board

import name.alatushkin.api.vk.generated.polls.Answer

open class TopicPoll(
    val pollId: Long,
    val ownerId: Long,
    val created: Long,
    val isClosed: Boolean? = null,
    val question: String,
    val votes: String,
    val answerId: Long,
    val answers: Array<Answer>
)