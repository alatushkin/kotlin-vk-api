package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.notes.Note

/**
 *  Returns a note by its ID.
 *
 *  [https://vk.com/dev/notes.getById]
 *  @property [note_id] Note ID.
 *  @property [owner_id] Note owner ID.
 */
class NotesGetByIdMethod() : VkMethod<Note>(
    "notes.getById",
    HashMap()
) {

    var noteId: Long? by props
    var ownerId: Long? by props

    constructor(
        noteId: Long? = null,
        ownerId: Long? = null
    ) : this() {
        this.noteId = noteId
        this.ownerId = ownerId
    }

    fun setNoteId(noteId: Long): NotesGetByIdMethod {
        this.noteId = noteId
        return this
    }

    fun setOwnerId(ownerId: Long): NotesGetByIdMethod {
        this.ownerId = ownerId
        return this
    }

    override val classRef = NotesGetByIdMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Note>>() {}
    }
}
