package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.wall.WallpostToId

/**
 *  Returns a list of posts on user walls in which the current user is mentioned.
 *
 *  [https://vk.com/dev/newsfeed.getMentions]
 *  @property [owner_id] Owner ID.
 *  @property [start_time] Earliest timestamp (in Unix time) of a post to return. By default, 24 hours ago.
 *  @property [end_time] Latest timestamp (in Unix time) of a post to return. By default, the current time.
 *  @property [offset] Offset needed to return a specific subset of posts.
 *  @property [count] Number of posts to return.
 */
class NewsfeedGetMentionsMethod() : VkMethod<VkList<WallpostToId>>(
    "newsfeed.getMentions",
    HashMap()
) {

    var ownerId: Long? by props
    var startTime: Long? by props
    var endTime: Long? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        ownerId: Long? = null,
        startTime: Long? = null,
        endTime: Long? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.startTime = startTime
        this.endTime = endTime
        this.offset = offset
        this.count = count
    }

    fun setOwnerId(ownerId: Long): NewsfeedGetMentionsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setStartTime(startTime: Long): NewsfeedGetMentionsMethod {
        this.startTime = startTime
        return this
    }

    fun setEndTime(endTime: Long): NewsfeedGetMentionsMethod {
        this.endTime = endTime
        return this
    }

    fun setOffset(offset: Long): NewsfeedGetMentionsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): NewsfeedGetMentionsMethod {
        this.count = count
        return this
    }

    override val classRef = NewsfeedGetMentionsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<WallpostToId>>>() {}
    }
}
