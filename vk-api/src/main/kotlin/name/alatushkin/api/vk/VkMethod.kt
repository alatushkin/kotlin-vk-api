package name.alatushkin.api.vk

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.api.VkResponse

abstract class VkMethod<T>(
    val apiMethodName: String,
    val presetProps: MutableMap<String, String>
) {
    abstract val classRef: TypeReference<VkResponse<T>>
    internal val props: MutableMap<String, Any?> = HashMap()
}