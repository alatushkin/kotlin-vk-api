package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Edits a document.
 *
 *  [https://vk.com/dev/docs.edit]
 *  @property [owner_id] User ID or community ID. Use a negative value to designate a community ID.
 *  @property [doc_id] Document ID.
 *  @property [title] Document title.
 *  @property [tags] Document tags.
 */
class DocsEditMethod() : VkMethod<Boolean>(
    "docs.edit",
    HashMap()
) {

    var ownerId: Long? by props
    var docId: Long? by props
    var title: String? by props
    var tags: Array<String>? by props

    constructor(
        ownerId: Long? = null,
        docId: Long? = null,
        title: String? = null,
        tags: Array<String>? = null
    ) : this() {
        this.ownerId = ownerId
        this.docId = docId
        this.title = title
        this.tags = tags
    }

    fun setOwnerId(ownerId: Long): DocsEditMethod {
        this.ownerId = ownerId
        return this
    }

    fun setDocId(docId: Long): DocsEditMethod {
        this.docId = docId
        return this
    }

    fun setTitle(title: String): DocsEditMethod {
        this.title = title
        return this
    }

    fun setTags(tags: Array<String>): DocsEditMethod {
        this.tags = tags
        return this
    }

    override val classRef = DocsEditMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
