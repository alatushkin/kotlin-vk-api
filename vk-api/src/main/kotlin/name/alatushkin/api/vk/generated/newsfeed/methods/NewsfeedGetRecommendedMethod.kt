@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.newsfeed.GetRecommendedResponse
import name.alatushkin.api.vk.successReference
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
    successReference()
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
}
