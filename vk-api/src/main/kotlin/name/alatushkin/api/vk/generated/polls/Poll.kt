package name.alatushkin.api.vk.generated.polls

import name.alatushkin.api.vk.generated.wall.WallpostAttachment

open class Poll(
    val id: Long,
    val ownerId: Long,
    val created: Long,
    val question: String,
    val votes: String,
    val answerId: Long,
    val answers: Array<Answer>,
    val anonymous: Boolean
) : WallpostAttachment