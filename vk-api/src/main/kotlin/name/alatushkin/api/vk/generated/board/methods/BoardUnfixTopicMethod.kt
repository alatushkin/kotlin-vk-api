@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/board.unfixTopic]
 *
 * Unpins a pinned topic from the top of a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 */
class BoardUnfixTopicMethod(
    groupId: Long,
    topicId: Long
) : VkMethod<Boolean>(
    "board.unfixTopic",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props
    var topicId: Long by props

    init {
        this.groupId = groupId
        this.topicId = topicId
    }
}
