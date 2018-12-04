@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.deleteComment]
 *
 * Deletes a comment on a note.
 *
 * @property commentId Comment ID.
 * @property ownerId Note owner ID.
 */
class NotesDeleteCommentMethod(
        commentId: Long,
        ownerId: Long? = null
) : VkMethod<Boolean>(
    "notes.deleteComment",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var commentId: Long by props
    var ownerId: Long? by props

    init {
        this.commentId = commentId
        this.ownerId = ownerId
    }

    fun setCommentId(commentId: Long): NotesDeleteCommentMethod {
        this.commentId = commentId
        return this
    }

    fun setOwnerId(ownerId: Long): NotesDeleteCommentMethod {
        this.ownerId = ownerId
        return this
    }
}
