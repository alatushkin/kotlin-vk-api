@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.board.GetCommentsResponse
import name.alatushkin.api.vk.generated.common.Sort
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/board.getComments]
 *
 * Returns a list of comments on a topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 * @property needLikes '1' — to return the 'likes' field, '0' — not to return the 'likes' field (default)
 * @property startCommentId 
 * @property offset Offset needed to return a specific subset of comments.
 * @property count Number of comments to return.
 * @property sort Sort order: 'asc' — by creation date in chronological order, 'desc' — by creation date in reverse chronological order,
 */
class BoardGetCommentsMethod(
        groupId: Long,
        topicId: Long,
        needLikes: Boolean? = null,
        startCommentId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        sort: Sort? = null
) : VkMethod<GetCommentsResponse>(
    "board.getComments",
    mutableMapOf(),
    object : TypeReference<VkResponse<GetCommentsResponse>>() {}
), UserServiceMethod {

    var groupId: Long by props
    var topicId: Long by props
    var needLikes: Boolean? by props
    var startCommentId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var sort: Sort? by props

    init {
        this.groupId = groupId
        this.topicId = topicId
        this.needLikes = needLikes
        this.startCommentId = startCommentId
        this.offset = offset
        this.count = count
        this.sort = sort
    }

    fun setGroupId(groupId: Long): BoardGetCommentsMethod {
        this.groupId = groupId
        return this
    }

    fun setTopicId(topicId: Long): BoardGetCommentsMethod {
        this.topicId = topicId
        return this
    }

    fun setNeedLikes(needLikes: Boolean): BoardGetCommentsMethod {
        this.needLikes = needLikes
        return this
    }

    fun setStartCommentId(startCommentId: Long): BoardGetCommentsMethod {
        this.startCommentId = startCommentId
        return this
    }

    fun setOffset(offset: Long): BoardGetCommentsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): BoardGetCommentsMethod {
        this.count = count
        return this
    }

    fun setSort(sort: Sort): BoardGetCommentsMethod {
        this.sort = sort
        return this
    }
}
