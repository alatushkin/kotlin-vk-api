package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Edits a note of the current user.
 *
 *  [https://vk.com/dev/notes.edit]
 *  @property [note_id] Note ID.
 *  @property [title] Note title.
 *  @property [text] Note text.
 *  @property [privacy_view]
 *  @property [privacy_comment]
 */
class NotesEditMethod() : VkMethod<Boolean>(
    "notes.edit",
    HashMap()
) {

    var noteId: Long? by props
    var title: String? by props
    var text: String? by props
    var privacyView: Array<String>? by props
    var privacyComment: Array<String>? by props

    constructor(
        noteId: Long? = null,
        title: String? = null,
        text: String? = null,
        privacyView: Array<String>? = null,
        privacyComment: Array<String>? = null
    ) : this() {
        this.noteId = noteId
        this.title = title
        this.text = text
        this.privacyView = privacyView
        this.privacyComment = privacyComment
    }

    fun setNoteId(noteId: Long): NotesEditMethod {
        this.noteId = noteId
        return this
    }

    fun setTitle(title: String): NotesEditMethod {
        this.title = title
        return this
    }

    fun setText(text: String): NotesEditMethod {
        this.text = text
        return this
    }

    fun setPrivacyView(privacyView: Array<String>): NotesEditMethod {
        this.privacyView = privacyView
        return this
    }

    fun setPrivacyComment(privacyComment: Array<String>): NotesEditMethod {
        this.privacyComment = privacyComment
        return this
    }

    override val classRef = NotesEditMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
