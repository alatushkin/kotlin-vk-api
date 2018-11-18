package name.alatushkin.api.vk.generatorng.json

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer

class MethodResponsesSchemaDeserializer : StdDeserializer<MethodResponses>(
    MethodResponses::class.java
) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): MethodResponses {
        val oc = p.codec
        val node: JsonNode = oc.readTree(p)
        val subParser = node.traverse(oc)
        subParser.nextToken()
        try {
            return ctxt.readValue(
                subParser, when {
                    node.has("userIdsResponse") -> UserIdsResponse::class.java
                    node.has("needMutualResponse") -> NeedMutualResponse::class.java
                    node.has("targetUidsResponse") -> TargetUidsResponse::class.java
                    node.has("onlineMobileResponse") -> OnlineMobileResponse::class.java
                    node.has("filterResponse") -> MethodFieldWithFilterResponses::class.java
                    node.has("fieldsResponse") -> FieldsResponses::class.java
                    node.has("schoolsResponse") -> SuggestMethodResponses::class.java
                    node.has("extendedResponse") -> MethodExtendedResponses::class.java
                    else -> MethodResponses::class.java
                }
            )
        } catch (e: Exception) {
            throw e
        }
    }

}