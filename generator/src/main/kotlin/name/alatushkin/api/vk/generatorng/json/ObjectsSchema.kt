package name.alatushkin.api.vk.generatorng.json

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

data class ObjectsSchema(
    val `$schema`: String,
    val title: String,
    @JsonDeserialize(contentUsing = ObjectSchemaDeserializer::class)
    val definitions: MutableMap<String, Object>
)