@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.board.GetTopicsExtendedResponse
import name.alatushkin.api.vk.generated.board.Order
import name.alatushkin.api.vk.generated.board.Preview
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/board.getTopics]
 *
 * Returns a list of topics on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicIds IDs of topics to be returned (100 maximum). By default, all topics are returned. If this parameter is set, the 'order', 'offset', and 'count' parameters are ignored.
 * @property order Sort order: '1' — by date updated in reverse chronological order. '2' — by date created in reverse chronological order. '-1' — by date updated in chronological order. '-2' — by date created in chronological order. If no sort order is specified, topics are returned in the order specified by the group administrator. Pinned topics are returned first, regardless of the sorting.
 * @property offset Offset needed to return a specific subset of topics.
 * @property count Number of topics to return.
 * @property preview '1' — to return the first comment in each topic,, '2' — to return the last comment in each topic,, '0' — to return no comments. By default: '0'.
 * @property previewLength Number of characters after which to truncate the previewed comment. To preview the full comment, specify '0'.
 */
class BoardGetTopicsMethodExtended(
    groupId: Long,
    topicIds: Array<Long>? = null,
    order: Order? = null,
    offset: Long? = null,
    count: Long? = null,
    preview: Preview? = null,
    previewLength: Long? = null
) : VkMethod<GetTopicsExtendedResponse>(
    "board.getTopics",
    mutableMapOf("extended" to "1"),
    successReference()
), UserServiceMethod {

    var groupId: Long by props
    var topicIds: Array<Long>? by props
    var order: Order? by props
    var offset: Long? by props
    var count: Long? by props
    var preview: Preview? by props
    var previewLength: Long? by props

    init {
        this.groupId = groupId
        this.topicIds = topicIds
        this.order = order
        this.offset = offset
        this.count = count
        this.preview = preview
        this.previewLength = previewLength
    }
}
