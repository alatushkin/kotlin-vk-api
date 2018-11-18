package name.alatushkin.api.vk.generatorng.json

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

data class Patch(
    val methods: List<MethodSchema> = emptyList(),
    val responses: Map<String, ResponceDefinitionSchema> = emptyMap(),
    @JsonDeserialize(contentUsing = ObjectSchemaDeserializer::class)
    val objects: Map<String, Object> = emptyMap()
)