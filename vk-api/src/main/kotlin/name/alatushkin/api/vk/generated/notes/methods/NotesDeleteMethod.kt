@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var noteId: Long by props

    init {
        this.noteId = noteId
    }
}
