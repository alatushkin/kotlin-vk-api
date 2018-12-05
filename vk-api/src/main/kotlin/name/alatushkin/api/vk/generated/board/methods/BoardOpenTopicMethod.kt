@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/board.openTopic]
 *
 * Re-opens a previously closed topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 */
class BoardOpenTopicMethod(
        groupId: Long,
        topicId: Long
) : VkMethod<Boolean>(
    "board.openTopic",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var groupId: Long by props
    var topicId: Long by props

    init {
        this.groupId = groupId
        this.topicId = topicId
    }

    fun setGroupId(groupId: Long): BoardOpenTopicMethod {
        this.groupId = groupId
        return this
    }

    fun setTopicId(topicId: Long): BoardOpenTopicMethod {
        this.topicId = topicId
        return this
    }
}
