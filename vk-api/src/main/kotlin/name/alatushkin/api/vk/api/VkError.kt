package name.alatushkin.api.vk.api

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.alatushkin.api.vk.json.VkErrorDeserializer
import java.io.IOException

@JsonDeserialize(using = VkErrorDeserializer::class)
sealed class VkError

data class VkSingleError(
        val errorCode: Int,
        val errorMsg: String,
        var requestParams: Map<String, Any?> = emptyMap(),
        val method: String? = null
) : VkError() {

    @JsonCreator
    constructor(
            errorCode: Int,
            errorMsg: String,
            requestParams: Array<JsonKeyValueEntry> = emptyArray(),
            method: String? = null
    ) : this(
            errorCode,
            errorMsg,
            requestParams.map(JsonKeyValueEntry::toPair).toMap(),
            method
    )

    override fun toString(): String = "$errorCode: $errorMsg"
}

data class VkMultiError(
        private val executeErrors: List<VkSingleError>
) : VkError(), List<VkSingleError> by executeErrors {

    override fun toString(): String = executeErrors.joinToString()
}

class VkApiException(val vkError: VkError) : IOException(vkError.toString())
