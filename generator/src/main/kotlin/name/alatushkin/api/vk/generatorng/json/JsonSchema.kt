package name.alatushkin.api.vk.generatorng.json

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import name.alatushkin.api.vk.generatorng.source.JsonTypeRef

class ObjectSchemaDeserializer : StdDeserializer<Object>(Object::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Object {
        val oc = p.codec
        val node: JsonNode = oc.readTree(p)
        val subParser = node.traverse(oc)
        subParser.nextToken()
        return if (node.has("\$ref"))
            ctxt.readValue(subParser, RefObject::class.java)
        else if (node.has("oneOf"))
            ctxt.readValue(subParser, OneOfObject::class.java)
        else if (node.has("allOf"))
            ctxt.readValue(subParser, AllOfObject::class.java)
        else if (node.has("type") && node["type"].textValue() == "array")
            ctxt.readValue(subParser, ArrayObject::class.java)
        else if (node.has("type") && node["type"].isArray)
            ctxt.readValue(subParser, SimpleObjectMultiType::class.java)
        else if (node.has("enum"))
            ctxt.readValue(subParser, EnumObject::class.java)
        else if (node.has("patternProperties"))
            ctxt.readValue(subParser, ObjectWithPatternProperties::class.java)
        else if (!node.has("properties"))
            ctxt.readValue(subParser, SimpleObject::class.java)
        else
            ctxt.readValue(subParser, GeneralObject::class.java)
    }

}


sealed class Object(val description: String? = null, val inherited: Boolean = false)
class OneOfObject(
    val type: String = "object",
    @JsonDeserialize(contentUsing = ObjectSchemaDeserializer::class)
    val oneOf: Array<Object>
) : Object()

class AllOfObject(
    val type: String = "object",
    @JsonDeserialize(contentUsing = ObjectSchemaDeserializer::class)
    val allOf: Array<Object>
) : Object()

class RefObject(
    val `$ref`: String,
    description: String? = null,
    //у некоторых есть вырожденные случаи
    type: String? = null
) : Object(description) {
    fun toJsonRef(): JsonTypeRef {
        return this.`$ref`.substringAfterLast('/')
    }
}


class SimpleObject(
    val type: String,
    description: String? = null,
    val minimum: Int? = null
) : Object(description)

class SimpleObjectMultiType(
    val type: Array<String>,
    description: String
) : Object(description)

class EnumObject(
    val type: String,
    description: String? = null,
    val enum: Array<String>,
    val enumNames: Array<String>? = null
) : Object(description)

class ArrayObject(
    val type: String,
    description: String? = null,
    //@JsonDeserialize(using = ItemTypeDeserializer::class)
    @JsonDeserialize(using = ObjectSchemaDeserializer::class)
    val items: Object
) : Object(description)

class GeneralObject(
    val type: String = "object",
    @JsonDeserialize(contentUsing = ObjectSchemaDeserializer::class)
    val properties: Map<String, Object>,
    val additionalProperties: Boolean? = false,
    val required: Array<String> = emptyArray(),
    val maxProperties: Int? = null,
    val minProperties: Int? = null
) : Object()

class ObjectWithPatternProperties(
    val type: String = "object",
    @JsonDeserialize(contentUsing = ObjectSchemaDeserializer::class)
    val patternProperties: Map<String, Object>
) : Object()
