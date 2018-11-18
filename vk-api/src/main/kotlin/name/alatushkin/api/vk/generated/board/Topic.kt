package name.alatushkin.api.vk.generated.board

import name.alatushkin.api.vk.generated.notifications.NotificationParent

open class Topic(
    val id: Long? = null,
    val title: String? = null,
    val created: Long? = null,
    val createdBy: Long? = null,
    val updated: Long? = null,
    val updatedBy: Long? = null,
    val isClosed: Boolean? = null,
    val isFixed: Boolean? = null,
    val comments: Long? = null
) : NotificationParent