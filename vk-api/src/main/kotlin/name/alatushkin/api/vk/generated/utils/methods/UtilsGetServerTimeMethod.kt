@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/utils.getServerTime]
 *
 * Returns the current time of the VK server.
 *

 */
class UtilsGetServerTimeMethod : VkMethod<Long>(
    "utils.getServerTime",
    mutableMapOf(),
    successReference()
), UserGroupServiceMethod
