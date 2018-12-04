@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/board.deleteComment]
 *
 * Deletes a comment on a topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 * @property commentId Comment ID.
 */
class BoardDeleteCommentMethod(
        groupId: Long,
        topicId: Long,
        commentId: Long
) : VkMethod<Boolean>(
    "board.deleteComment",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserGroupMethod {

    var groupId: Long by props
    var topicId: Long by props
    var commentId: Long by props

    init {
        this.groupId = groupId
        this.topicId = topicId
        this.commentId = commentId
    }

    fun setGroupId(groupId: Long): BoardDeleteCommentMethod {
        this.groupId = groupId
        return this
    }

    fun setTopicId(topicId: Long): BoardDeleteCommentMethod {
        this.topicId = topicId
        return this
    }

    fun setCommentId(commentId: Long): BoardDeleteCommentMethod {
        this.commentId = commentId
        return this
    }
}
