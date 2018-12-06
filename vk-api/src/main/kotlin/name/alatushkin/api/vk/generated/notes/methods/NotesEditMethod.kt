@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.edit]
 *
 * Edits a note of the current user.
 *
 * @property noteId Note ID.
 * @property title Note title.
 * @property text Note text.
 * @property privacyView 
 * @property privacyComment 
 */
class NotesEditMethod(
    noteId: Long,
    title: String,
    text: String,
    privacyView: Array<String>? = null,
    privacyComment: Array<String>? = null
) : VkMethod<Boolean>(
    "notes.edit",
    mutableMapOf(),
    successReference()
), UserMethod {

    var noteId: Long by props
    var title: String by props
    var text: String by props
    var privacyView: Array<String>? by props
    var privacyComment: Array<String>? by props

    init {
        this.noteId = noteId
        this.title = title
        this.text = text
        this.privacyView = privacyView
        this.privacyComment = privacyComment
    }
}
