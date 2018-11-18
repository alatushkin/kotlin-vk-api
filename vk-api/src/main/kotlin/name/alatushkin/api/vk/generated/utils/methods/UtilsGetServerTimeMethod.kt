package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Returns the current time of the VK server.
 *
 *  [https://vk.com/dev/utils.getServerTime]

 */
class UtilsGetServerTimeMethod : VkMethod<Long>(
    "utils.getServerTime",
    HashMap()
) {
    override val classRef = UtilsGetServerTimeMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Long>>() {}
    }
}
