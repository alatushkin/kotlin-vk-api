@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notifications.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.notifications.GetResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/notifications.get]
 *
 * Returns a list of notifications about other users' feedback to the current user's wall posts.
 *
 * @property count Number of notifications to return.
 * @property startFrom 
 * @property filters Type of notifications to return: 'wall' — wall posts, 'mentions' — mentions in wall posts, comments, or topics, 'comments' — comments to wall posts, photos, and videos, 'likes' — likes, 'reposted' — wall posts that are copied from the current user's wall, 'followers' — new followers, 'friends' — accepted friend requests
 * @property startTime Earliest timestamp (in Unix time) of a notification to return. By default, 24 hours ago.
 * @property endTime Latest timestamp (in Unix time) of a notification to return. By default, the current time.
 */
class NotificationsGetMethod(
    count: Long? = null,
    startFrom: String? = null,
    filters: Array<String>? = null,
    startTime: Long? = null,
    endTime: Long? = null
) : VkMethod<GetResponse>(
    "notifications.get",
    mutableMapOf(),
    successReference()
), UserMethod {

    var count: Long? by props
    var startFrom: String? by props
    var filters: Array<String>? by props
    var startTime: Long? by props
    var endTime: Long? by props

    init {
        this.count = count
        this.startFrom = startFrom
        this.filters = filters
        this.startTime = startTime
        this.endTime = endTime
    }
}
