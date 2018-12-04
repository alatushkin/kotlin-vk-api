@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/board.closeTopic]
 *
 * Closes a topic on a community's discussion board so that comments cannot be posted.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 */
class BoardCloseTopicMethod(
        groupId: Long,
        topicId: Long
) : VkMethod<Boolean>(
    "board.closeTopic",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var groupId: Long by props
    var topicId: Long by props

    init {
        this.groupId = groupId
        this.topicId = topicId
    }

    fun setGroupId(groupId: Long): BoardCloseTopicMethod {
        this.groupId = groupId
        return this
    }

    fun setTopicId(topicId: Long): BoardCloseTopicMethod {
        this.topicId = topicId
        return this
    }
}
