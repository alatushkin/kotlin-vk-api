package name.alatushkin.api.vk.generated.notifications.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.notifications.Notification

/**
 *  Returns a list of notifications about other users' feedback to the current user's wall posts.
 *
 *  [https://vk.com/dev/notifications.get]
 *  @property [count] Number of notifications to return.
 *  @property [start_from] null
 *  @property [filters] Type of notifications to return: 'wall' — wall posts, 'mentions' — mentions in wall posts, comments, or topics, 'comments' — comments to wall posts, photos, and videos, 'likes' — likes, 'reposted' — wall posts that are copied from the current user's wall, 'followers' — new followers, 'friends' — accepted friend requests
 *  @property [start_time] Earliest timestamp (in Unix time) of a notification to return. By default, 24 hours ago.
 *  @property [end_time] Latest timestamp (in Unix time) of a notification to return. By default, the current time.
 */
class NotificationsGetMethod() : VkMethod<VkList<Notification>>(
    "notifications.get",
    HashMap()
) {

    var count: Long? by props
    var startFrom: String? by props
    var filters: Array<String>? by props
    var startTime: Long? by props
    var endTime: Long? by props

    constructor(
        count: Long? = null,
        startFrom: String? = null,
        filters: Array<String>? = null,
        startTime: Long? = null,
        endTime: Long? = null
    ) : this() {
        this.count = count
        this.startFrom = startFrom
        this.filters = filters
        this.startTime = startTime
        this.endTime = endTime
    }

    fun setCount(count: Long): NotificationsGetMethod {
        this.count = count
        return this
    }

    fun setStartFrom(startFrom: String): NotificationsGetMethod {
        this.startFrom = startFrom
        return this
    }

    fun setFilters(filters: Array<String>): NotificationsGetMethod {
        this.filters = filters
        return this
    }

    fun setStartTime(startTime: Long): NotificationsGetMethod {
        this.startTime = startTime
        return this
    }

    fun setEndTime(endTime: Long): NotificationsGetMethod {
        this.endTime = endTime
        return this
    }

    override val classRef = NotificationsGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Notification>>>() {}
    }
}
