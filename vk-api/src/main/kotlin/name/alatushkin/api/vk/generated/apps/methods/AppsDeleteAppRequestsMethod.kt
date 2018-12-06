@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.apps.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/apps.deleteAppRequests]
 *
 * Deletes all request notifications from the current app.
 *

 */
class AppsDeleteAppRequestsMethod : VkMethod<Boolean>(
    "apps.deleteAppRequests",
    mutableMapOf(),
    successReference()
), UserMethod
