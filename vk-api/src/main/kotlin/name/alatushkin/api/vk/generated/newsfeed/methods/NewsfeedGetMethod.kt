@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.newsfeed.GetResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.get]
 *
 * Returns data required to show newsfeed for the current user.
 *
 * @property filters Filters to apply: 'post' — new wall posts, 'photo' — new photos, 'photo_tag' — new photo tags, 'wall_photo' — new wall photos, 'friend' — new friends, 'note' — new notes
 * @property returnBanned '1' — to return news items from banned sources
 * @property startTime Earliest timestamp (in Unix time) of a news item to return. By default, 24 hours ago.
 * @property endTime Latest timestamp (in Unix time) of a news item to return. By default, the current time.
 * @property maxPhotos Maximum number of photos to return. By default, '5'.
 * @property sourceIds Sources to obtain news from, separated by commas. User IDs can be specified in formats '' or 'u' , where '' is the user's friend ID. Community IDs can be specified in formats '-' or 'g' , where '' is the community ID. If the parameter is not set, all of the user's friends and communities are returned, except for banned sources, which can be obtained with the [vk.com/dev/newsfeed.getBanned|newsfeed.getBanned] method.
 * @property startFrom identifier required to get the next page of results. Value for this parameter is returned in 'next_from' field in a reply.
 * @property count Number of news items to return (default 50, maximum 100). For auto feed, you can use the 'new_offset' parameter returned by this method.
 * @property fields Additional fields of [vk.com/dev/fields|profiles] and [vk.com/dev/fields_groups|communities] to return.
 */
class NewsfeedGetMethod(
        filters: Array<String>? = null,
        returnBanned: Boolean? = null,
        startTime: Long? = null,
        endTime: Long? = null,
        maxPhotos: Long? = null,
        sourceIds: Array<String>? = null,
        startFrom: String? = null,
        count: Long? = null,
        fields: Array<String>? = null
) : VkMethod<GetResponse>(
    "newsfeed.get",
    mutableMapOf(),
    object : TypeReference<VkResponse<GetResponse>>() {}
), UserMethod {

    var filters: Array<String>? by props
    var returnBanned: Boolean? by props
    var startTime: Long? by props
    var endTime: Long? by props
    var maxPhotos: Long? by props
    var sourceIds: Array<String>? by props
    var startFrom: String? by props
    var count: Long? by props
    var fields: Array<String>? by props

    init {
        this.filters = filters
        this.returnBanned = returnBanned
        this.startTime = startTime
        this.endTime = endTime
        this.maxPhotos = maxPhotos
        this.sourceIds = sourceIds
        this.startFrom = startFrom
        this.count = count
        this.fields = fields
    }

    fun setFilters(filters: Array<String>): NewsfeedGetMethod {
        this.filters = filters
        return this
    }

    fun setReturnBanned(returnBanned: Boolean): NewsfeedGetMethod {
        this.returnBanned = returnBanned
        return this
    }

    fun setStartTime(startTime: Long): NewsfeedGetMethod {
        this.startTime = startTime
        return this
    }

    fun setEndTime(endTime: Long): NewsfeedGetMethod {
        this.endTime = endTime
        return this
    }

    fun setMaxPhotos(maxPhotos: Long): NewsfeedGetMethod {
        this.maxPhotos = maxPhotos
        return this
    }

    fun setSourceIds(sourceIds: Array<String>): NewsfeedGetMethod {
        this.sourceIds = sourceIds
        return this
    }

    fun setStartFrom(startFrom: String): NewsfeedGetMethod {
        this.startFrom = startFrom
        return this
    }

    fun setCount(count: Long): NewsfeedGetMethod {
        this.count = count
        return this
    }

    fun setFields(fields: Array<String>): NewsfeedGetMethod {
        this.fields = fields
        return this
    }
}
