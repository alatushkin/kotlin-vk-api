package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.board.GetTopicsResponse
import name.alatushkin.api.vk.generated.board.Order
import name.alatushkin.api.vk.generated.board.Preview

/**
 *  Returns a list of topics on a community's discussion board.
 *
 *  [https://vk.com/dev/board.getTopics]
 *  @property [group_id] ID of the community that owns the discussion board.
 *  @property [topic_ids] IDs of topics to be returned (100 maximum). By default, all topics are returned. If this parameter is set, the 'order', 'offset', and 'count' parameters are ignored.
 *  @property [order] Sort order: '1' — by date updated in reverse chronological order. '2' — by date created in reverse chronological order. '-1' — by date updated in chronological order. '-2' — by date created in chronological order. If no sort order is specified, topics are returned in the order specified by the group administrator. Pinned topics are returned first, regardless of the sorting.
 *  @property [offset] Offset needed to return a specific subset of topics.
 *  @property [count] Number of topics to return.
 *  @property [preview] '1' — to return the first comment in each topic,, '2' — to return the last comment in each topic,, '0' — to return no comments. By default: '0'.
 *  @property [preview_length] Number of characters after which to truncate the previewed comment. To preview the full comment, specify '0'.
 */
class BoardGetTopicsMethod() : VkMethod<GetTopicsResponse>(
    "board.getTopics",
    mutableMapOf()
) {

    var groupId: Long? by props
    var topicIds: Array<Long>? by props
    var order: Order? by props
    var offset: Long? by props
    var count: Long? by props
    var preview: Preview? by props
    var previewLength: Long? by props

    constructor(
        groupId: Long? = null,
        topicIds: Array<Long>? = null,
        order: Order? = null,
        offset: Long? = null,
        count: Long? = null,
        preview: Preview? = null,
        previewLength: Long? = null
    ) : this() {
        this.groupId = groupId
        this.topicIds = topicIds
        this.order = order
        this.offset = offset
        this.count = count
        this.preview = preview
        this.previewLength = previewLength
    }

    fun setGroupId(groupId: Long): BoardGetTopicsMethod {
        this.groupId = groupId
        return this
    }

    fun setTopicIds(topicIds: Array<Long>): BoardGetTopicsMethod {
        this.topicIds = topicIds
        return this
    }

    fun setOrder(order: Order): BoardGetTopicsMethod {
        this.order = order
        return this
    }

    fun setOffset(offset: Long): BoardGetTopicsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): BoardGetTopicsMethod {
        this.count = count
        return this
    }

    fun setPreview(preview: Preview): BoardGetTopicsMethod {
        this.preview = preview
        return this
    }

    fun setPreviewLength(previewLength: Long): BoardGetTopicsMethod {
        this.previewLength = previewLength
        return this
    }

    override val classRef = BoardGetTopicsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<GetTopicsResponse>>() {}
    }
}
