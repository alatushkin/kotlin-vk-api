package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.newsfeed.SearchResponse

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
class NewsfeedSearchMethod() : VkMethod<SearchResponse>(
    "newsfeed.search",
    mutableMapOf()
) {

    var q: String? by props
    var count: Long? by props
    var latitude: Long? by props
    var longitude: Long? by props
    var startTime: Long? by props
    var endTime: Long? by props
    var startFrom: String? by props
    var fields: Array<String>? by props

    constructor(
        q: String? = null,
        count: Long? = null,
        latitude: Long? = null,
        longitude: Long? = null,
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

    fun setQ(q: String): NewsfeedSearchMethod {
        this.q = q
        return this
    }

    fun setCount(count: Long): NewsfeedSearchMethod {
        this.count = count
        return this
    }

    fun setLatitude(latitude: Long): NewsfeedSearchMethod {
        this.latitude = latitude
        return this
    }

    fun setLongitude(longitude: Long): NewsfeedSearchMethod {
        this.longitude = longitude
        return this
    }

    fun setStartTime(startTime: Long): NewsfeedSearchMethod {
        this.startTime = startTime
        return this
    }

    fun setEndTime(endTime: Long): NewsfeedSearchMethod {
        this.endTime = endTime
        return this
    }

    fun setStartFrom(startFrom: String): NewsfeedSearchMethod {
        this.startFrom = startFrom
        return this
    }

    fun setFields(fields: Array<String>): NewsfeedSearchMethod {
        this.fields = fields
        return this
    }

    override val classRef = NewsfeedSearchMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<SearchResponse>>() {}
    }
}
