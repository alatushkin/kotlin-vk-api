@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.utils.Interval
import name.alatushkin.api.vk.generated.utils.LinkStats
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/utils.getLinkStats]
 *
 * Returns stats data for shortened link.
 *
 * @property key Link key (characters after vk.cc/).
 * @property accessKey Access key for private link stats.
 * @property interval Interval.
 * @property intervalsCount Number of intervals to return.
 */
class UtilsGetLinkStatsMethod(
    key: String,
    accessKey: String? = null,
    interval: Interval? = null,
    intervalsCount: Long? = null
) : VkMethod<LinkStats>(
    "utils.getLinkStats",
    mutableMapOf(),
    successReference()
), UserGroupServiceMethod {

    var key: String by props
    var accessKey: String? by props
    var interval: Interval? by props
    var intervalsCount: Long? by props

    init {
        this.key = key
        this.accessKey = accessKey
        this.interval = interval
        this.intervalsCount = intervalsCount
    }
}
