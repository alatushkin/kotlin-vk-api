package name.alatushkin.api.vk.generated.messages

open class Chat(
    val id: Long,
    val type: String,
    val title: String? = null,
    val adminId: Long,
    val users: Array<Long>,
    val pushSettings: ChatPushSettings? = null,
    val photo50: String? = null,
    val photo100: String? = null,
    val photo200: String? = null,
    val left: Boolean? = null,
    val kicked: Boolean? = null
)
