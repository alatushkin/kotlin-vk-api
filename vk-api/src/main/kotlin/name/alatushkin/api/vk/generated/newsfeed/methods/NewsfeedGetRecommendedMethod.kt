@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.newsfeed.GetRecommendedResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.getRecommended]
 *
 * , Returns a list of newsfeeds recommended to the current user.
 *
 * @property startTime Earliest timestamp (in Unix time) of a news item to return. By default, 24 hours ago.
 * @property endTime Latest timestamp (in Unix time) of a news item to return. By default, the current time.
 * @property maxPhotos Maximum number of photos to return. By default, '5'.
 * @property startFrom 'new_from' value obtained in previous call.
 * @property count Number of news items to return.
 * @property fields Additional fields of [vk.com/dev/fields|profiles] and [vk.com/dev/fields_groups|communities] to return.
 */
class NewsfeedGetRecommendedMethod(
        startTime: Long? = null,
        endTime: Long? = null,
        maxPhotos: Long? = null,
        startFrom: String? = null,
        count: Long? = null,
        fields: Array<String>? = null
) : VkMethod<GetRecommendedResponse>(
    "newsfeed.getRecommended",
    mutableMapOf(),
    object : TypeReference<VkSuccess<GetRecommendedResponse>>() {}
), UserMethod {

    var startTime: Long? by props
    var endTime: Long? by props
    var maxPhotos: Long? by props
    var startFrom: String? by props
    var count: Long? by props
    var fields: Array<String>? by props

    init {
        this.startTime = startTime
        this.endTime = endTime
        this.maxPhotos = maxPhotos
        this.startFrom = startFrom
        this.count = count
        this.fields = fields
    }

    fun setStartTime(startTime: Long): NewsfeedGetRecommendedMethod {
        this.startTime = startTime
        return this
    }

    fun setEndTime(endTime: Long): NewsfeedGetRecommendedMethod {
        this.endTime = endTime
        return this
    }

    fun setMaxPhotos(maxPhotos: Long): NewsfeedGetRecommendedMethod {
        this.maxPhotos = maxPhotos
        return this
    }

    fun setStartFrom(startFrom: String): NewsfeedGetRecommendedMethod {
        this.startFrom = startFrom
        return this
    }

    fun setCount(count: Long): NewsfeedGetRecommendedMethod {
        this.count = count
        return this
    }

    fun setFields(fields: Array<String>): NewsfeedGetRecommendedMethod {
        this.fields = fields
        return this
    }
}
