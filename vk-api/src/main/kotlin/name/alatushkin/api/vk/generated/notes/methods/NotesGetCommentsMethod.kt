package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.notes.NoteComment

/**
 *  Returns a list of comments on a note.
 *
 *  [https://vk.com/dev/notes.getComments]
 *  @property [note_id] Note ID.
 *  @property [owner_id] Note owner ID.
 *  @property [count] Number of comments to return.
 */
class NotesGetCommentsMethod() : VkMethod<VkList<NoteComment>>(
    "notes.getComments",
    HashMap()
) {

    var noteId: Long? by props
    var ownerId: Long? by props
    var count: Long? by props

    constructor(
        noteId: Long? = null,
        ownerId: Long? = null,
        count: Long? = null
    ) : this() {
        this.noteId = noteId
        this.ownerId = ownerId
        this.count = count
    }

    fun setNoteId(noteId: Long): NotesGetCommentsMethod {
        this.noteId = noteId
        return this
    }

    fun setOwnerId(ownerId: Long): NotesGetCommentsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCount(count: Long): NotesGetCommentsMethod {
        this.count = count
        return this
    }

    override val classRef = NotesGetCommentsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<NoteComment>>>() {}
    }
}
