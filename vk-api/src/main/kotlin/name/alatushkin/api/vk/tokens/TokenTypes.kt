package name.alatushkin.api.vk.tokens

import name.alatushkin.api.vk.VkMethod

sealed class Token<in M: MethodRequirement> {
    abstract fun <T> attachTo(method: VkMethod<T>)

    abstract val accessToken: String
    abstract val id: Long
}

data class UserToken(
        override val accessToken: String,
        override val id: Long
) : Token<UserMethod>() {

    override fun <T> attachTo(method: VkMethod<T>) {
        method.presetProps["access_token"] = accessToken
    }
}

data class GroupToken(
        override val accessToken: String,
        override val id: Long
) : Token<GroupMethod>() {

    override fun <T> attachTo(method: VkMethod<T>) {
        method.presetProps["access_token"] = accessToken
    }
}

data class ServiceToken(
        override val accessToken: String,
        override val id: Long,
        val clientSecret: String
) : Token<ServiceMethod>() {

    override fun <T> attachTo(method: VkMethod<T>) {
        method.presetProps["access_token"] = accessToken
        if (method.apiMethodName.substringBefore('.') == "secure") {
            method.presetProps["client_secret"] = clientSecret
        }
    }
}
