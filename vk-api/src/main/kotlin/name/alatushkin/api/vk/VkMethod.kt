package name.alatushkin.api.vk

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.messages.Keyboard

abstract class VkMethod<T>(
    val apiMethodName: String,
    val presetProps: MutableMap<String, String>,
    val responseType: TypeReference<VkSuccess<T>>
) {
    protected val props: MutableMap<String, Any?> = HashMap()

    fun toJsonObject(): Map<String, String> = props
            .filterValues { it != null }
            .mapKeys { restorePropNames(it.key) }
            .entries
            .map { camelCaseToLowerUnderscore(it.key) to toStringRequestValue(it.value) }
            .toMap() + presetProps + mapOf("v" to VERSION)

    companion object {
        const val VERSION = "5.87"

        private fun restorePropNames(name: String): String = when (name) {
            "cls" -> "class"
            "obj" -> "object"
            else -> name
        }

        private fun toStringRequestValue(value: Any?): String = when (value) {
            is Array<*> -> value.joinToString(",")
            is Keyboard -> VK_OBJECT_MAPPER.writeValueAsString(value)
            else -> value.toString()
        }

        private fun camelCaseToLowerUnderscore(s: String): String =
                s.replace("(.)(\\p{Upper})".toRegex(), "$1_$2").toLowerCase()
    }
}
