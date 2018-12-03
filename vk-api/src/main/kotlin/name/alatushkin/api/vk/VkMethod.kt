package name.alatushkin.api.vk

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.messages.Keyboard

abstract class VkMethod<T>(
    val apiMethodName: String,
    val presetProps: MutableMap<String, String>
) {
    abstract val classRef: TypeReference<VkResponse<T>>
    internal val props: MutableMap<String, Any?> = HashMap()

    fun toJsonObject(): Map<String, String> {
        return props
            .filterValues { it != null }
            .mapKeys { restorePropNames(it) }
            .entries.map {
            Pair(
                caseConvert(it.key),
                toStringRequestValue(it.value)
            )
        }.toMap() + presetProps + mapOf("v" to VERSION)
    }

    private fun restorePropNames(it: Map.Entry<String, Any?>): String {
        return when (it.key) {
            "cls" -> "class"
            "obj" -> "object"
            else -> it.key
        }
    }

    private fun toStringRequestValue(it: Any?): String {
        if (it is Array<*>)
            return it.joinToString(",")
        if (it is Keyboard)
            return VK_OBJECT_MAPPER.writeValueAsString(it)
        return it.toString()
    }

    companion object {
        const val VERSION = "5.87"
    }
}