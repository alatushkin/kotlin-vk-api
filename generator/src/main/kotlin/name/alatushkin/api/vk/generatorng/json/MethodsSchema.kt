package name.alatushkin.api.vk.generatorng.json

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.alatushkin.api.vk.generatorng.nameMethod
import name.alatushkin.api.vk.generatorng.source.JsonTypeRef

data class MethodsSchema(
    val errors: MutableList<Error>,
    val methods: MutableList<MethodSchema>
)

data class Error(
    val name: String,
    val code: Int,
    val description: String
)

data class MethodSchema(
    //поле для наших патчей
    val name: String,
    val className: String = nameMethod(name).typeName,
    //есть методы без описания
    val description: String? = null,
    @JsonProperty("access_token_type")
    val accessTokenType: List<String> = emptyList(),
    val parameters: List<MethodParameter> = emptyList(),
    @JsonDeserialize(using = MethodResponsesSchemaDeserializer::class)
    val responses: MethodResponses,
    val errors: List<Error>? = null,

    @JsonIgnore
    val fixedParams: Map<String, String?> = HashMap()
) {
    fun narrowCopy(
        postfix: String,
        fixedVariables: Map<String, String?>,
        responseRef: SchemaFileRef,
        narrowEnumParams: Map<String, List<String>> = emptyMap()
    ): MethodSchema {
        parameters.map { param ->
            val valuesToExtract = narrowEnumParams[param.name]
            if (valuesToExtract != null) {

            } else
                param
        }
        return this.copy(
            className = className + postfix,
            parameters = parameters.filter { it.name !in fixedVariables },
            fixedParams = fixedParams + fixedVariables,
            responses = MethodResponses(responseRef)
        )
    }
}


data class SchemaFileRef(val `$ref`: String) {
    fun toJsonRef(): JsonTypeRef {
        return this.`$ref`.substringAfterLast('/')
    }
}