package name.alatushkin.api.vk.generatorng.json

import com.fasterxml.jackson.databind.annotation.JsonDeserialize


data class ResponcesSchema(
    val `$schema`: String,
    val title: String,
    val definitions: MutableMap<String, ResponceDefinitionSchema>
)

data class ResponceDefinitionSchema(
    val type: String? = null,
    val properties: ResponseObjectDefinition,
    val additionalProperties: Boolean? = false,
    val minProperties: Int? = null,
    val required: Array<String> = emptyArray()
)

data class ResponseObjectDefinition(
    @JsonDeserialize(using = ObjectSchemaDeserializer::class)
    val response: Object? = null
)