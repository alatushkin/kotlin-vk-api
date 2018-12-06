@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stats.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod
