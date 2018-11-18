package name.alatushkin.api.vk.generatorng.json

import name.alatushkin.api.vk.generatorng.source.JsonTypeRef
import name.alatushkin.api.vk.under2Camel

/**
Распределение типов возвращаемых значений по типам
просто реализуем расширение мписка методов
(MethodResponses, 384)
(MethodExtendedResponses, 36)
(FieldsResponses, 3)
(OnlineMobileResponse, 1)
(TargetUidsResponse, 1)
(NeedMutualResponse, 1)
(UserIdsResponse, 1)
(MethodFieldWithFilterResponses, 1)
(SuggestMethodResponses, 1)
 */

open class MethodResponses(val response: SchemaFileRef) {
    protected fun methodUrl(jsonTypeRef: JsonTypeRef) =
        jsonTypeRef

    open fun normalizeMethodDefinition(methodSchema: MethodSchema): List<MethodSchema> {
        return listOf(methodSchema)
    }
}

open class MethodExtendedResponses(
    response: SchemaFileRef,
    val extendedResponse: SchemaFileRef
) : MethodResponses(response) {

    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<MethodSchema> {
        return listOf(
            methodSchema.narrowCopy("", mapOf("extended" to null), response),
            methodSchema.narrowCopy("Extended", mapOf("extended" to "1"), extendedResponse)
        )
    }
}

open class FieldsResponses(
    response: SchemaFileRef,
    val fieldsResponse: SchemaFileRef
) : MethodResponses(response) {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<MethodSchema> {
        return listOf(
            methodSchema.narrowCopy("", mapOf("fields" to null), response),
            methodSchema.narrowCopy("WithFields", emptyMap(), fieldsResponse)
        )
    }
}

class MethodFieldWithFilterResponses(
    response: SchemaFileRef,
    fieldsResponse: SchemaFileRef,
    val filterResponse: SchemaFileRef
) : FieldsResponses(response, fieldsResponse) {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<MethodSchema> {
        return listOf(
            methodSchema.narrowCopy("", mapOf("fields" to null), response),
            methodSchema.narrowCopy("WithFields", emptyMap(), fieldsResponse),
            methodSchema.narrowCopy("Managers", mapOf("fields" to null, "filter" to "managers"), filterResponse)
        )
    }
}

class OnlineMobileResponse(
    response: SchemaFileRef,
    val onlineMobileResponse: SchemaFileRef
) : MethodResponses(response) {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<MethodSchema> {
        return listOf(
            methodSchema.narrowCopy("", mapOf("online_mobile" to null), response),
            methodSchema.narrowCopy("OnlineMobile", mapOf("online_mobile" to "1"), onlineMobileResponse)
        )
    }
}

class TargetUidsResponse(
    response: SchemaFileRef,
    val targetUidsResponse: SchemaFileRef
) : MethodResponses(response) {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<MethodSchema> {
        return listOf(
            methodSchema.narrowCopy("", mapOf("target_uids" to null), response),
            methodSchema.narrowCopy("ManyUIds", emptyMap(), targetUidsResponse)
        )
    }
}

class NeedMutualResponse(
    response: SchemaFileRef,
    extendedResponse: SchemaFileRef,
    val needMutualResponse: SchemaFileRef
) : MethodExtendedResponses(response, extendedResponse) {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<MethodSchema> {
        return listOf(
            methodSchema.narrowCopy("", mapOf("extended" to null, "need_mutual" to null), response),
            methodSchema.narrowCopy("NeedMutual", mapOf("extended" to null, "need_mutual" to "1"), needMutualResponse),
            methodSchema.narrowCopy("Extended", mapOf("extended" to "1", "need_mutual" to "1"), extendedResponse)

        )
    }
}

class UserIdsResponse(
    response: SchemaFileRef,
    extendedResponse: SchemaFileRef,
    val userIdsResponse: SchemaFileRef? = null,
    val userIdsExtendedResponse: SchemaFileRef? = null
) : MethodExtendedResponses(response, extendedResponse) {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<MethodSchema> {
        return listOf(
            methodSchema.narrowCopy("", mapOf("extended" to null, "user_ids" to null), response),
            methodSchema.narrowCopy("Extended", mapOf("extended" to "1", "user_ids" to null), extendedResponse),
            methodSchema.narrowCopy("UserIds", mapOf("extended" to null, "user_id" to null), response),
            methodSchema.narrowCopy("UserIdsExtended", mapOf("extended" to "1", "user_id" to null), extendedResponse)
        )
    }
}


open class SuggestMethodResponses(
    response: SchemaFileRef,
    val regionsResponse: SchemaFileRef,
    val citiesResponse: SchemaFileRef,
    val schoolsResponse: SchemaFileRef
) : MethodResponses(response) {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<MethodSchema> {
        return listOf(
            "countries", "positions", "interest_categories", "religions",
            "user_devices", "user_os", "user_browsers"
        )
            .flatMap {
                listOf(
                    methodSchema.narrowCopy(
                        under2Camel(it).capitalize(),
                        mapOf("section" to it, "ids" to null, "country" to null, "cities" to null),
                        response
                    ),
                    methodSchema.narrowCopy(
                        "Decode" + under2Camel(it).capitalize(),
                        mapOf("section" to it, "q" to null, "country" to null, "cities" to null),
                        response
                    )
                )
            } +
                listOf("regions")
                    .flatMap {
                        listOf(
                            methodSchema.narrowCopy(
                                under2Camel(it).capitalize(),
                                mapOf("section" to it, "ids" to null, "cities" to null),
                                regionsResponse
                            ),
                            methodSchema.narrowCopy(
                                "Decode" + under2Camel(it).capitalize(),
                                mapOf("section" to it, "q" to null, "country" to null, "cities" to null),
                                regionsResponse
                            )
                        )
                    } +
                listOf("cities", "districts", "streets")
                    .map {
                        methodSchema.narrowCopy(
                            "Decode" + under2Camel(it).capitalize(),
                            mapOf("section" to it, "q" to null, "country" to null, "cities" to null),
                            citiesResponse
                        )
                    } +
                listOf(
                    methodSchema.narrowCopy(
                        "Cities",
                        mapOf("section" to "cities", "ids" to null, "cities" to null),
                        citiesResponse
                    ),
                    methodSchema.narrowCopy(
                        "Districts",
                        mapOf("section" to "districts", "ids" to null, "country" to null),
                        citiesResponse
                    ),
                    methodSchema.narrowCopy(
                        "Streets",
                        mapOf("section" to "streets", "ids" to null, "country" to null),
                        citiesResponse
                    )
                ) +
                listOf(
                    methodSchema.narrowCopy(
                        "Schools",
                        mapOf("section" to "schools", "ids" to null, "country" to null),
                        schoolsResponse
                    ),
                    methodSchema.narrowCopy(
                        "DecodeSchools",
                        mapOf("section" to "schools", "q" to null, "country" to null, "cities" to null),
                        schoolsResponse
                    )
                )
    }
}
