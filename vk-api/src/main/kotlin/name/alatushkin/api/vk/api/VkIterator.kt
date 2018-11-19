package name.alatushkin.api.vk.api

data class VkIterator<T>(val next: String, val items: List<T>) : VkResult


