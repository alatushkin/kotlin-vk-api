package name.alatushkin.api.vk.generated.notifications

import name.alatushkin.api.vk.api.VkDate

open class Notification(
    val type: String? = null,
    val date: VkDate? = null,
    val parent: NotificationParent? = null,
    val feedback: Feedback? = null,
    val reply: Reply? = null
)