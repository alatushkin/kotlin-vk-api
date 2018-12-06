@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.createComment]
 *
 * Adds a new comment on a note.
 *
 * @property noteId Note ID.
 * @property ownerId Note owner ID.
 * @property replyTo ID of the user to whom the reply is addressed (if the comment is a reply to another comment).
 * @property message Comment text.
 * @property guid 
 */
class NotesCreateCommentMethod(
    noteId: Long,
    ownerId: Long? = null,
    replyTo: Long? = null,
    message: String,
    guid: String? = null
) : VkMethod<Long>(
    "notes.createComment",
    mutableMapOf(),
    successReference()
), UserMethod {

    var noteId: Long by props
    var ownerId: Long? by props
    var replyTo: Long? by props
    var message: String by props
    var guid: String? by props

    init {
        this.noteId = noteId
        this.ownerId = ownerId
        this.replyTo = replyTo
        this.message = message
        this.guid = guid
    }
}
