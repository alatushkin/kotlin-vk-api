package name.alatushkin.api.vk.api

import com.fasterxml.jackson.annotation.JsonCreator

data class VkError(val errorCode: Int, val errorMsg: String, var requestParams: Map<String, Any?>) {
    @JsonCreator
    constructor(errorCode: Int, errorMsg: String, requestParams: Array<JsonKeyValueEntry>) : this(
        errorCode, errorMsg, requestParams.map(
            JsonKeyValueEntry::toPair
        ).toMap()
    )
}

class VkErrorException(val vkError: VkError) : RuntimeException(vkError.errorMsg)