@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.utils.Interval
import name.alatushkin.api.vk.generated.utils.LinkStats
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
    object : TypeReference<VkSuccess<LinkStats>>() {}
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

    fun setKey(key: String): UtilsGetLinkStatsMethod {
        this.key = key
        return this
    }

    fun setAccessKey(accessKey: String): UtilsGetLinkStatsMethod {
        this.accessKey = accessKey
        return this
    }

    fun setInterval(interval: Interval): UtilsGetLinkStatsMethod {
        this.interval = interval
        return this
    }

    fun setIntervalsCount(intervalsCount: Long): UtilsGetLinkStatsMethod {
        this.intervalsCount = intervalsCount
        return this
    }
}
