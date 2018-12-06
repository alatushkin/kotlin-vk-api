@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.newsfeed.SearchExtendedResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/newsfeed.search]
 *
 * Returns search results by statuses.
 *
 * @property q Search query string (e.g., 'New Year').
 * @property count Number of posts to return.
 * @property latitude Geographical latitude point (in degrees, -90 to 90) within which to search.
 * @property longitude Geographical longitude point (in degrees, -180 to 180) within which to search.
 * @property startTime Earliest timestamp (in Unix time) of a news item to return. By default, 24 hours ago.
 * @property endTime Latest timestamp (in Unix time) of a news item to return. By default, the current time.
 * @property startFrom 
 * @property fields Additional fields of [vk.com/dev/fields|profiles] and [vk.com/dev/fields_groups|communities] to return.
 */
class NewsfeedSearchMethodExtended(
    q: String? = null,
    count: Long? = null,
    latitude: Double? = null,
    longitude: Double? = null,
    startTime: Long? = null,
    endTime: Long? = null,
    startFrom: String? = null,
    fields: Array<String>? = null
) : VkMethod<SearchExtendedResponse>(
    "newsfeed.search",
    mutableMapOf("extended" to "1"),
    successReference()
), UserServiceMethod {

    var q: String? by props
    var count: Long? by props
    var latitude: Double? by props
    var longitude: Double? by props
    var startTime: Long? by props
    var endTime: Long? by props
    var startFrom: String? by props
    var fields: Array<String>? by props

    init {
        this.q = q
        this.count = count
        this.latitude = latitude
        this.longitude = longitude
        this.startTime = startTime
        this.endTime = endTime
        this.startFrom = startFrom
        this.fields = fields
    }
}
