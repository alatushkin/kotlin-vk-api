package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Adds a new comment on a note.
 *
 *  [https://vk.com/dev/notes.createComment]
 *  @property [note_id] Note ID.
 *  @property [owner_id] Note owner ID.
 *  @property [reply_to] ID of the user to whom the reply is addressed (if the comment is a reply to another comment).
 *  @property [message] Comment text.
 *  @property [guid] null
 */
class NotesCreateCommentMethod() : VkMethod<Long>(
    "notes.createComment",
    HashMap()
) {

    var noteId: Long? by props
    var ownerId: Long? by props
    var replyTo: Long? by props
    var message: String? by props
    var guid: String? by props

    constructor(
        noteId: Long? = null,
        ownerId: Long? = null,
        replyTo: Long? = null,
        message: String? = null,
        guid: String? = null
    ) : this() {
        this.noteId = noteId
        this.ownerId = ownerId
        this.replyTo = replyTo
        this.message = message
        this.guid = guid
    }

    fun setNoteId(noteId: Long): NotesCreateCommentMethod {
        this.noteId = noteId
        return this
    }

    fun setOwnerId(ownerId: Long): NotesCreateCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setReplyTo(replyTo: Long): NotesCreateCommentMethod {
        this.replyTo = replyTo
        return this
    }

    fun setMessage(message: String): NotesCreateCommentMethod {
        this.message = message
        return this
    }

    fun setGuid(guid: String): NotesCreateCommentMethod {
        this.guid = guid
        return this
    }

    override val classRef = NotesCreateCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Long>>() {}
    }
}
