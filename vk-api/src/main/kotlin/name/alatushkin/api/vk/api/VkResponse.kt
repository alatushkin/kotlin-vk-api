package name.alatushkin.api.vk.api

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer


@JsonIgnoreProperties(ignoreUnknown = true)
sealed class VkResponse<T>

data class VkSuccess<T> @JsonCreator constructor(
    val response: T
) : VkResponse<T>()


data class VkFail<T> @JsonCreator constructor(
    val error: VkError
) : VkResponse<T>()

class VkResponseDeserializer : StdDeserializer<VkResponse<*>>(VkResponse::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): VkResponse<*> {
        val oc = p.codec
        val node: JsonNode = oc.readTree(p)
        val subParser = node.traverse(oc)
        subParser.nextToken()
        return if (node.has("error")) {
            VkFail<Any>(oc.readValue(node["error"].traverse(oc), VkSingleError::class.java))
        } else if (node.has("execute_errors")) {
            VkFail<Any>(oc.readValue(node["execute_errors"].traverse(oc), VkMultiError::class.java))
        } else {

            //ctxt.readValue(subParser, VkSuccess::class.java)
            oc.treeToValue(node, VkSuccess::class.java)
        }
    }

}
