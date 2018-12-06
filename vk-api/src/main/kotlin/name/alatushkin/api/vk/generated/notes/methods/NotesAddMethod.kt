@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
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
}
