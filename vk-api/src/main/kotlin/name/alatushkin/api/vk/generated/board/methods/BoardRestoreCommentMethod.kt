@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/board.restoreComment]
 *
 * Restores a comment deleted from a topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 * @property commentId Comment ID.
 */
class BoardRestoreCommentMethod(
    groupId: Long,
    topicId: Long,
    commentId: Long
) : VkMethod<Boolean>(
    "board.restoreComment",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var groupId: Long by props
    var topicId: Long by props
    var commentId: Long by props

    init {
        this.groupId = groupId
        this.topicId = topicId
        this.commentId = commentId
    }
}
