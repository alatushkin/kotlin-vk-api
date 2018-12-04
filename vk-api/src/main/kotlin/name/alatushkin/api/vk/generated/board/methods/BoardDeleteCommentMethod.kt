package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Deletes a comment on a topic on a community's discussion board.
 *
 *  [https://vk.com/dev/board.deleteComment]
 *  @property [group_id] ID of the community that owns the discussion board.
 *  @property [topic_id] Topic ID.
 *  @property [comment_id] Comment ID.
 */
class BoardDeleteCommentMethod() : VkMethod<Boolean>(
    "board.deleteComment",
    HashMap()
) {

    var groupId: Long? by props
    var topicId: Long? by props
    var commentId: Long? by props

    constructor(
        groupId: Long? = null,
        topicId: Long? = null,
        commentId: Long? = null
    ) : this() {
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

    override val classRef = BoardDeleteCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
