package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Deletes a user or community document.
 *
 *  [https://vk.com/dev/docs.delete]
 *  @property [owner_id] ID of the user or community that owns the document. Use a negative value to designate a community ID.
 *  @property [doc_id] Document ID.
 */
class DocsDeleteMethod() : VkMethod<Boolean>(
    "docs.delete",
    HashMap()
) {

    var ownerId: Long? by props
    var docId: Long? by props

    constructor(
        ownerId: Long? = null,
        docId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.docId = docId
    }

    fun setOwnerId(ownerId: Long): DocsDeleteMethod {
        this.ownerId = ownerId
        return this
    }

    fun setDocId(docId: Long): DocsDeleteMethod {
        this.docId = docId
        return this
    }

    override val classRef = DocsDeleteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
