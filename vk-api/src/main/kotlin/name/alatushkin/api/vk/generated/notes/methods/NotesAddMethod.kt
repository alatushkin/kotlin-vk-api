@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.add]
 *
 * Creates a new note for the current user.
 *
 * @property title Note title.
 * @property text Note text.
 * @property privacyView 
 * @property privacyComment 
 */
class NotesAddMethod(
        title: String,
        text: String,
        privacyView: Array<String>? = null,
        privacyComment: Array<String>? = null
) : VkMethod<Long>(
    "notes.add",
    mutableMapOf(),
    object : TypeReference<VkResponse<Long>>() {}
), UserMethod {

    var title: String by props
    var text: String by props
    var privacyView: Array<String>? by props
    var privacyComment: Array<String>? by props

    init {
        this.title = title
        this.text = text
        this.privacyView = privacyView
        this.privacyComment = privacyComment
    }

    fun setTitle(title: String): NotesAddMethod {
        this.title = title
        return this
    }

    fun setText(text: String): NotesAddMethod {
        this.text = text
        return this
    }

    fun setPrivacyView(privacyView: Array<String>): NotesAddMethod {
        this.privacyView = privacyView
        return this
    }

    fun setPrivacyComment(privacyComment: Array<String>): NotesAddMethod {
        this.privacyComment = privacyComment
        return this
    }
}
