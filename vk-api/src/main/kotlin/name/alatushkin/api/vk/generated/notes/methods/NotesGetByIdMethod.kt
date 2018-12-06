@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.notes.Note
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var noteId: Long by props
    var ownerId: Long? by props

    init {
        this.noteId = noteId
        this.ownerId = ownerId
    }
}
