package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Edits a comment on a note.
 *
 *  [https://vk.com/dev/notes.editComment]
 *  @property [comment_id] Comment ID.
 *  @property [owner_id] Note owner ID.
 *  @property [message] New comment text.
 */
class NotesEditCommentMethod() : VkMethod<Boolean>(
    "notes.editComment",
    HashMap()
) {

    var commentId: Long? by props
    var ownerId: Long? by props
    var message: String? by props

    constructor(
        commentId: Long? = null,
        ownerId: Long? = null,
        message: String? = null
    ) : this() {
        this.commentId = commentId
        this.ownerId = ownerId
        this.message = message
    }

    fun setCommentId(commentId: Long): NotesEditCommentMethod {
        this.commentId = commentId
        return this
    }

    fun setOwnerId(ownerId: Long): NotesEditCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setMessage(message: String): NotesEditCommentMethod {
        this.message = message
        return this
    }

    override val classRef = NotesEditCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
