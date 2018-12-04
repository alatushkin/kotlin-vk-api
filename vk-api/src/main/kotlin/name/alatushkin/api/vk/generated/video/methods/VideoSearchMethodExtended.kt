@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.video.SearchExtendedResponse
import name.alatushkin.api.vk.generated.video.Sort
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.search]
 *
 * Returns a list of videos under the set search criterion.
 *
 * @property q Search query string (e.g., 'The Beatles').
 * @property sort Sort order: '1' — by duration, '2' — by relevance, '0' — by date added
 * @property hd If not null, only searches for high-definition videos.
 * @property adult '1' — to disable the Safe Search filter, '0' — to enable the Safe Search filter
 * @property filters Filters to apply: 'youtube' — return YouTube videos only, 'vimeo' — return Vimeo videos only, 'short' — return short videos only, 'long' — return long videos only
 * @property searchOwn 
 * @property offset Offset needed to return a specific subset of videos.
 * @property longer 
 * @property shorter 
 * @property count Number of videos to return.
 */
class VideoSearchMethodExtended(
        q: String,
        sort: Sort? = null,
        hd: Long? = null,
        adult: Boolean? = null,
        filters: Array<String>? = null,
        searchOwn: Boolean? = null,
        offset: Long? = null,
        longer: Long? = null,
        shorter: Long? = null,
        count: Long? = null
) : VkMethod<SearchExtendedResponse>(
    "video.search",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkSuccess<SearchExtendedResponse>>() {}
), UserMethod {

    var q: String by props
    var sort: Sort? by props
    var hd: Long? by props
    var adult: Boolean? by props
    var filters: Array<String>? by props
    var searchOwn: Boolean? by props
    var offset: Long? by props
    var longer: Long? by props
    var shorter: Long? by props
    var count: Long? by props

    init {
        this.q = q
        this.sort = sort
        this.hd = hd
        this.adult = adult
        this.filters = filters
        this.searchOwn = searchOwn
        this.offset = offset
        this.longer = longer
        this.shorter = shorter
        this.count = count
    }

    fun setQ(q: String): VideoSearchMethodExtended {
        this.q = q
        return this
    }

    fun setSort(sort: Sort): VideoSearchMethodExtended {
        this.sort = sort
        return this
    }

    fun setHd(hd: Long): VideoSearchMethodExtended {
        this.hd = hd
        return this
    }

    fun setAdult(adult: Boolean): VideoSearchMethodExtended {
        this.adult = adult
        return this
    }

    fun setFilters(filters: Array<String>): VideoSearchMethodExtended {
        this.filters = filters
        return this
    }

    fun setSearchOwn(searchOwn: Boolean): VideoSearchMethodExtended {
        this.searchOwn = searchOwn
        return this
    }

    fun setOffset(offset: Long): VideoSearchMethodExtended {
        this.offset = offset
        return this
    }

    fun setLonger(longer: Long): VideoSearchMethodExtended {
        this.longer = longer
        return this
    }

    fun setShorter(shorter: Long): VideoSearchMethodExtended {
        this.shorter = shorter
        return this
    }

    fun setCount(count: Long): VideoSearchMethodExtended {
        this.count = count
        return this
    }
}
