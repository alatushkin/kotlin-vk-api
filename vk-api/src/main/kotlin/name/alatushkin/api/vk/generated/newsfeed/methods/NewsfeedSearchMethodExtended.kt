package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.newsfeed.SearchExtendedResponse

/**
 *  Returns search results by statuses.
 *
 *  [https://vk.com/dev/newsfeed.search]
 *  @property [q] Search query string (e.g., 'New Year').
 *  @property [count] Number of posts to return.
 *  @property [latitude] Geographical latitude point (in degrees, -90 to 90) within which to search.
 *  @property [longitude] Geographical longitude point (in degrees, -180 to 180) within which to search.
 *  @property [start_time] Earliest timestamp (in Unix time) of a news item to return. By default, 24 hours ago.
 *  @property [end_time] Latest timestamp (in Unix time) of a news item to return. By default, the current time.
 *  @property [start_from]
 *  @property [fields] Additional fields of [vk.com/dev/fields|profiles] and [vk.com/dev/fields_groups|communities] to return.
 */
class NewsfeedSearchMethodExtended() : VkMethod<SearchExtendedResponse>(
    "newsfeed.search",
    mutableMapOf("extended" to "1")
) {

    var q: String? by props
    var count: Long? by props
    var latitude: Double? by props
    var longitude: Double? by props
    var startTime: Long? by props
    var endTime: Long? by props
    var startFrom: String? by props
    var fields: Array<String>? by props

    constructor(
        q: String? = null,
        count: Long? = null,
        latitude: Double? = null,
        longitude: Double? = null,
        startTime: Long? = null,
        endTime: Long? = null,
        startFrom: String? = null,
        fields: Array<String>? = null
    ) : this() {
        this.q = q
        this.count = count
        this.latitude = latitude
        this.longitude = longitude
        this.startTime = startTime
        this.endTime = endTime
        this.startFrom = startFrom
        this.fields = fields
    }

    fun setQ(q: String): NewsfeedSearchMethodExtended {
        this.q = q
        return this
    }

    fun setCount(count: Long): NewsfeedSearchMethodExtended {
        this.count = count
        return this
    }

    fun setLatitude(latitude: Double): NewsfeedSearchMethodExtended {
        this.latitude = latitude
        return this
    }

    fun setLongitude(longitude: Double): NewsfeedSearchMethodExtended {
        this.longitude = longitude
        return this
    }

    fun setStartTime(startTime: Long): NewsfeedSearchMethodExtended {
        this.startTime = startTime
        return this
    }

    fun setEndTime(endTime: Long): NewsfeedSearchMethodExtended {
        this.endTime = endTime
        return this
    }

    fun setStartFrom(startFrom: String): NewsfeedSearchMethodExtended {
        this.startFrom = startFrom
        return this
    }

    fun setFields(fields: Array<String>): NewsfeedSearchMethodExtended {
        this.fields = fields
        return this
    }

    override val classRef = NewsfeedSearchMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<SearchExtendedResponse>>() {}
    }
}
