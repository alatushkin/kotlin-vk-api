package name.alatushkin.api.vk.api

data class VkResponse<T>(val response: T?, val error: VkError?)