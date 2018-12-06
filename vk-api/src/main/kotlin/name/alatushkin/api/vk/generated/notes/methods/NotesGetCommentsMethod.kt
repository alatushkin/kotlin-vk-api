@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.notes.NoteComment
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.getComments]
 *
 * Returns a list of comments on a note.
 *
 * @property noteId Note ID.
 * @property ownerId Note owner ID.
 * @property count Number of comments to return.
 */
class NotesGetCommentsMethod(
    noteId: Long,
    ownerId: Long? = null,
    count: Long? = null
) : VkMethod<VkList<NoteComment>>(
    "notes.getComments",
    mutableMapOf(),
    successReference()
), UserMethod {

    var noteId: Long by props
    var ownerId: Long? by props
    var count: Long? by props

    init {
        this.noteId = noteId
        this.ownerId = ownerId
        this.count = count
    }
}
