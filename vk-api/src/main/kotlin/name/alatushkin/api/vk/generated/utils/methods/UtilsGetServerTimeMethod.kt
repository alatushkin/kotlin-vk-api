@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Long>>() {}
), UserGroupServiceMethod
