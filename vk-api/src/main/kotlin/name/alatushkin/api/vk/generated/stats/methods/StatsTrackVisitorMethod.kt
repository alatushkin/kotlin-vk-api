@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stats.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/stats.trackVisitor]
 *
 * null
 *

 */
class StatsTrackVisitorMethod : VkMethod<Boolean>(
    "stats.trackVisitor",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod
