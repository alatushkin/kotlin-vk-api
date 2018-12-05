package name.alatushkin.api.vk.api

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.alatushkin.api.vk.json.VkResponseDeserializer

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = VkResponseDeserializer::class)
sealed class VkResponse<T>

data class VkSuccess<T> @JsonCreator constructor(val response: T) : VkResponse<T>()

data class VkFail<T> @JsonCreator constructor(val error: VkError) : VkResponse<T>()
