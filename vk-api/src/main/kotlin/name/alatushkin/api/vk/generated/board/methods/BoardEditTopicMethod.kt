@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var groupId: Long by props
    var topicId: Long by props
    var title: String by props

    init {
        this.groupId = groupId
        this.topicId = topicId
        this.title = title
    }
}
