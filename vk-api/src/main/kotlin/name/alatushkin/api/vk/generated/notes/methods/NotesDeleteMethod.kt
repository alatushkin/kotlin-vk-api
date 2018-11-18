package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Deletes a note of the current user.
 *
 *  [https://vk.com/dev/notes.delete]
 *  @property [note_id] Note ID.
 */
class NotesDeleteMethod() : VkMethod<Boolean>(
    "notes.delete",
    HashMap()
) {

    var noteId: Long? by props

    constructor(
        noteId: Long? = null
    ) : this() {
        this.noteId = noteId
    }

    fun setNoteId(noteId: Long): NotesDeleteMethod {
        this.noteId = noteId
        return this
    }

    override val classRef = NotesDeleteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
