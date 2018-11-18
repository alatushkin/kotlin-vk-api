package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Deletes all request notifications from the current app.
 *
 *  [https://vk.com/dev/apps.deleteAppRequests]

 */
class AppsDeleteAppRequestsMethod : VkMethod<Boolean>(
    "apps.deleteAppRequests",
    HashMap()
) {
    override val classRef = AppsDeleteAppRequestsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
