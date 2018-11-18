package name.alatushkin.api.vk.generatorng.json

data class CollectionValueParamType(
    val type: String,
    //для массивов
    val minimum: Int? = 0,
    //для строк
    val enum: Array<String>? = null,
    val enumNames: Array<String>? = null
)