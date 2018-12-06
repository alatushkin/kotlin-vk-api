@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.newsfeed.GetCommentsResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.getComments]
 *
 * Returns a list of comments in the current user's newsfeed.
 *
 * @property count Number of comments to return. For auto feed, you can use the 'new_offset' parameter returned by this method.
 * @property filters Filters to apply: 'post' — new comments on wall posts, 'photo' — new comments on photos, 'video' — new comments on videos, 'topic' — new comments on discussions, 'note' — new comments on notes,
 * @property reposts Object ID, comments on repost of which shall be returned, e.g. 'wall1_45486'. (If the parameter is set, the 'filters' parameter is optional.),
 * @property startTime Earliest timestamp (in Unix time) of a comment to return. By default, 24 hours ago.
 * @property endTime Latest timestamp (in Unix time) of a comment to return. By default, the current time.
 * @property startFrom Identificator needed to return the next page with results. Value for this parameter returns in 'next_from' field.
 * @property fields Additional fields of [vk.com/dev/fields|profiles] and [vk.com/dev/fields_groups|communities] to return.
 */
class NewsfeedGetCommentsMethod(
    count: Long? = null,
    filters: Array<String>? = null,
    reposts: String? = null,
    startTime: Long? = null,
    endTime: Long? = null,
    startFrom: String? = null,
    fields: Array<String>? = null
) : VkMethod<GetCommentsResponse>(
    "newsfeed.getComments",
    mutableMapOf(),
    successReference()
), UserMethod {

    var count: Long? by props
    var filters: Array<String>? by props
    var reposts: String? by props
    var startTime: Long? by props
    var endTime: Long? by props
    var startFrom: String? by props
    var fields: Array<String>? by props

    init {
        this.count = count
        this.filters = filters
        this.reposts = reposts
        this.startTime = startTime
        this.endTime = endTime
        this.startFrom = startFrom
        this.fields = fields
    }
}
