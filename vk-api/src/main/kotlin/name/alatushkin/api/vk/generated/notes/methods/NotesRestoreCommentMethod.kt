package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Restores a deleted comment on a note.
 *
 *  [https://vk.com/dev/notes.restoreComment]
 *  @property [comment_id] Comment ID.
 *  @property [owner_id] Note owner ID.
 */
class NotesRestoreCommentMethod() : VkMethod<Boolean>(
    "notes.restoreComment",
    HashMap()
) {

    var commentId: Long? by props
    var ownerId: Long? by props

    constructor(
        commentId: Long? = null,
        ownerId: Long? = null
    ) : this() {
        this.commentId = commentId
        this.ownerId = ownerId
    }

    fun setCommentId(commentId: Long): NotesRestoreCommentMethod {
        this.commentId = commentId
        return this
    }

    fun setOwnerId(ownerId: Long): NotesRestoreCommentMethod {
        this.ownerId = ownerId
        return this
    }

    override val classRef = NotesRestoreCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
