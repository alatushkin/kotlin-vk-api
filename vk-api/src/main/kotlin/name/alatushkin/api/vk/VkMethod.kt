package name.alatushkin.api.vk

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.api.VkResponse

abstract class VkMethod<T>(
    val apiMethodName: String,
    val presetProps: MutableMap<String, String>,
    val responseType: TypeReference<VkResponse<T>>
) {
    protected val props: MutableMap<String, Any?> = HashMap()

    val rawProps: Map<String, Any?> get() = props
}