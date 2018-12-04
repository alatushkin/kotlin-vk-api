@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/board.editTopic]
 *
 * Edits the title of a topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 * @property title New title of the topic.
 */
class BoardEditTopicMethod(
        groupId: Long,
        topicId: Long,
        title: String
) : VkMethod<Boolean>(
    "board.editTopic",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var groupId: Long by props
    var topicId: Long by props
    var title: String by props

    init {
        this.groupId = groupId
        this.topicId = topicId
        this.title = title
    }

    fun setGroupId(groupId: Long): BoardEditTopicMethod {
        this.groupId = groupId
        return this
    }

    fun setTopicId(topicId: Long): BoardEditTopicMethod {
        this.topicId = topicId
        return this
    }

    fun setTitle(title: String): BoardEditTopicMethod {
        this.title = title
        return this
    }
}
