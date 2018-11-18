package name.alatushkin.api.vk.generated.streaming.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.streaming.GetServerUrlResponse

/**
 *  Allows to receive data for the connection to Streaming API.
 *
 *  [https://vk.com/dev/streaming.getServerUrl]

 */
class StreamingGetServerUrlMethod : VkMethod<GetServerUrlResponse>(
    "streaming.getServerUrl",
    HashMap()
) {
    override val classRef = StreamingGetServerUrlMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GetServerUrlResponse>>() {}
    }
}
