package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Creates a new note for the current user.
 *
 *  [https://vk.com/dev/notes.add]
 *  @property [title] Note title.
 *  @property [text] Note text.
 *  @property [privacy_view] null
 *  @property [privacy_comment] null
 */
class NotesAddMethod() : VkMethod<Long>(
    "notes.add",
    HashMap()
) {

    var title: String? by props
    var text: String? by props
    var privacyView: Array<String>? by props
    var privacyComment: Array<String>? by props

    constructor(
        title: String? = null,
        text: String? = null,
        privacyView: Array<String>? = null,
        privacyComment: Array<String>? = null
    ) : this() {
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

    override val classRef = NotesAddMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Long>>() {}
    }
}
