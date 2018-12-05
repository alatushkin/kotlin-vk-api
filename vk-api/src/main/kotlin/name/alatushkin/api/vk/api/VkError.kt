package name.alatushkin.api.vk.api

import com.fasterxml.jackson.annotation.JsonCreator
import java.io.IOException

data class VkError(val errorCode: Int, val errorMsg: String, var requestParams: Map<String, Any?>) {

    @JsonCreator
    constructor(errorCode: Int, errorMsg: String, requestParams: Array<JsonKeyValueEntry>) : this(
        errorCode, errorMsg, requestParams.map(JsonKeyValueEntry::toPair).toMap()
    )
}

class VkApiException(val vkError: VkError) : IOException(vkError.errorMsg) {

    val errorCode: Int
        get() = vkError.errorCode

    override val message: String
        get() = vkError.errorMsg
}