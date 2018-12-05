@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.delete]
 *
 * Deletes a note of the current user.
 *
 * @property noteId Note ID.
 */
class NotesDeleteMethod(
        noteId: Long
) : VkMethod<Boolean>(
    "notes.delete",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var noteId: Long by props

    init {
        this.noteId = noteId
    }

    fun setNoteId(noteId: Long): NotesDeleteMethod {
        this.noteId = noteId
        return this
    }
}
