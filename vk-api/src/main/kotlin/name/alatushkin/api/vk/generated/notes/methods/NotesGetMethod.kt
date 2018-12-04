package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.notes.Note

/**
 *  Returns a list of notes created by a user.
 *
 *  [https://vk.com/dev/notes.get]
 *  @property [note_ids] Note IDs.
 *  @property [user_id] Note owner ID.
 *  @property [count] Number of notes to return.
 */
class NotesGetMethod() : VkMethod<VkList<Note>>(
    "notes.get",
    HashMap()
) {

    var noteIds: Array<Long>? by props
    var userId: Long? by props
    var count: Long? by props

    constructor(
        noteIds: Array<Long>? = null,
        userId: Long? = null,
        count: Long? = null
    ) : this() {
        this.noteIds = noteIds
        this.userId = userId
        this.count = count
    }

    fun setNoteIds(noteIds: Array<Long>): NotesGetMethod {
        this.noteIds = noteIds
        return this
    }

    fun setUserId(userId: Long): NotesGetMethod {
        this.userId = userId
        return this
    }

    fun setCount(count: Long): NotesGetMethod {
        this.count = count
        return this
    }

    override val classRef = NotesGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<Note>>>() {}
    }
}
