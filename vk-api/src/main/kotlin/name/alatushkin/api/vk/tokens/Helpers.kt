package name.alatushkin.api.vk.tokens

import name.alatushkin.api.vk.VkMethod

fun <T> VkMethod<T>.attach(token: Token<*>): VkMethod<T> =
        apply { token.attachTo(this) }

val Token<*>.clientSecret: String?
    get() = when (this) {
        is ServiceToken -> clientSecret
        else -> null
    }

val Token<*>.peerId: Long?
    get() = when (this) {
        is UserToken -> id
        is GroupToken -> -id
        else -> null
    }
