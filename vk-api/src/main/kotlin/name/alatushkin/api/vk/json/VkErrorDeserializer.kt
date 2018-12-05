package name.alatushkin.api.vk.json

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import name.alatushkin.api.vk.api.VkError
import name.alatushkin.api.vk.api.VkMultiError
import name.alatushkin.api.vk.api.VkSingleError

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
