@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.notes.Note
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.getById]
 *
 * Returns a note by its ID.
 *
 * @property noteId Note ID.
 * @property ownerId Note owner ID.
 */
class NotesGetByIdMethod(
        noteId: Long,
        ownerId: Long? = null
) : VkMethod<Note>(
    "notes.getById",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Note>>() {}
), UserMethod {

    var noteId: Long by props
    var ownerId: Long? by props

    init {
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
}
