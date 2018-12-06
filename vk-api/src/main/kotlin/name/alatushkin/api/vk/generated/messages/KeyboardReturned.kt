package name.alatushkin.api.vk.generated.messages

open class KeyboardReturned(
    val authorId: Long,
    override val oneTime: Boolean,
    override val buttons: Array<Array<KeyboardButton>>
) : Keyboard
