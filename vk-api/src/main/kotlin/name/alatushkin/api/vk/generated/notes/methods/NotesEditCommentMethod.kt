@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.editComment]
 *
 * Edits a comment on a note.
 *
 * @property commentId Comment ID.
 * @property ownerId Note owner ID.
 * @property message New comment text.
 */
class NotesEditCommentMethod(
    commentId: Long,
    ownerId: Long? = null,
    message: String? = null
) : VkMethod<Boolean>(
    "notes.editComment",
    mutableMapOf(),
    successReference()
), UserMethod {

    var commentId: Long by props
    var ownerId: Long? by props
    var message: String? by props

    init {
        this.commentId = commentId
        this.ownerId = ownerId
        this.message = message
    }
}
