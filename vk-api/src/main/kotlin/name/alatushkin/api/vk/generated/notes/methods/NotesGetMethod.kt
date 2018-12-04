@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.notes.Note
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
    object : TypeReference<VkSuccess<VkList<Note>>>() {}
), UserMethod {

    var noteIds: Array<Long>? by props
    var userId: Long? by props
    var count: Long? by props

    init {
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
}
