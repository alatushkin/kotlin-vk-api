package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.utils.Interval
import name.alatushkin.api.vk.generated.utils.LinkStats

/**
 *  Returns stats data for shortened link.
 *
 *  [https://vk.com/dev/utils.getLinkStats]
 *  @property [key] Link key (characters after vk.cc/).
 *  @property [access_key] Access key for private link stats.
 *  @property [interval] Interval.
 *  @property [intervals_count] Number of intervals to return.
 */
class UtilsGetLinkStatsMethod() : VkMethod<LinkStats>(
    "utils.getLinkStats",
    mutableMapOf()
) {

    var key: String? by props
    var accessKey: String? by props
    var interval: Interval? by props
    var intervalsCount: Long? by props

    constructor(
        key: String? = null,
        accessKey: String? = null,
        interval: Interval? = null,
        intervalsCount: Long? = null
    ) : this() {
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

    override val classRef = UtilsGetLinkStatsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<LinkStats>>() {}
    }
}
