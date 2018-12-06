@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.restoreComment]
 *
 * Restores a deleted comment on a note.
 *
 * @property commentId Comment ID.
 * @property ownerId Note owner ID.
 */
class NotesRestoreCommentMethod(
    commentId: Long,
    ownerId: Long? = null
) : VkMethod<Boolean>(
    "notes.restoreComment",
    mutableMapOf(),
    successReference()
), UserMethod {

    var commentId: Long by props
    var ownerId: Long? by props

    init {
        this.commentId = commentId
        this.ownerId = ownerId
    }
}
