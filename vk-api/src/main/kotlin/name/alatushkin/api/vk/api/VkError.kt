package name.alatushkin.api.vk.api

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import java.io.IOException

//@JsonDeserialize(using = VkErrorDeserializer::class)
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

class VkErrorDeserializer : StdDeserializer<VkError>(VkError::class.java) {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): VkError {
        val oc = p.codec
        val node: JsonNode = oc.readTree(p)
        val subParser = node.traverse(oc)
        subParser.nextToken()
        return if (node.isArray)
            VkMultiError(ctxt.readValue(subParser, VkMultiError::class.java))
        else
            ctxt.readValue(subParser, VkSingleError::class.java)
    }
}