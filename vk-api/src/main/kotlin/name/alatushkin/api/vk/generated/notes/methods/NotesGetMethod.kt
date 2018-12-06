@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.notes.Note
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.get]
 *
 * Returns a list of notes created by a user.
 *
 * @property noteIds Note IDs.
 * @property userId Note owner ID.
 * @property count Number of notes to return.
 */
class NotesGetMethod(
    noteIds: Array<Long>? = null,
    userId: Long? = null,
    count: Long? = null
) : VkMethod<VkList<Note>>(
    "notes.get",
    mutableMapOf(),
    successReference()
), UserMethod {

    var noteIds: Array<Long>? by props
    var userId: Long? by props
    var count: Long? by props

    init {
        this.noteIds = noteIds
        this.userId = userId
        this.count = count
    }
}
