package name.alatushkin.api.vk.generated.notifications.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Resets the counter of new notifications about other users' feedback to the current user's wall posts.
 *
 *  [https://vk.com/dev/notifications.markAsViewed]

 */
class NotificationsMarkAsViewedMethod : VkMethod<Boolean>(
    "notifications.markAsViewed",
    HashMap()
) {
    override val classRef = NotificationsMarkAsViewedMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
