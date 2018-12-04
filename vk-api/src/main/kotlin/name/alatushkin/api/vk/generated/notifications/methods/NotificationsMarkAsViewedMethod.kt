@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notifications.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/notifications.markAsViewed]
 *
 * Resets the counter of new notifications about other users' feedback to the current user's wall posts.
 *

 */
class NotificationsMarkAsViewedMethod : VkMethod<Boolean>(
    "notifications.markAsViewed",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod
