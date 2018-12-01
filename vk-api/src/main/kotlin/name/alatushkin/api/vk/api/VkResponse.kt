package name.alatushkin.api.vk.api

data class VkResponse<T>(val response: T?, val error: VkError?) {

    @Throws(VkError::class)
    fun value(): T = response ?: throw error!!
}