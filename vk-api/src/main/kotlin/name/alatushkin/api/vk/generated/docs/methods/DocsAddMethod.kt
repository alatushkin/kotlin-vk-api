package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.docs.AddResponse

/**
 *  Copies a document to a user's or community's document list.
 *
 *  [https://vk.com/dev/docs.add]
 *  @property [owner_id] ID of the user or community that owns the document. Use a negative value to designate a community ID.
 *  @property [doc_id] Document ID.
 *  @property [access_key] Access key. This parameter is required if 'access_key' was returned with the document's data.
 */
class DocsAddMethod() : VkMethod<AddResponse>(
    "docs.add",
    HashMap()
) {

    var ownerId: Long? by props
    var docId: Long? by props
    var accessKey: String? by props

    constructor(
        ownerId: Long? = null,
        docId: Long? = null,
        accessKey: String? = null
    ) : this() {
        this.ownerId = ownerId
        this.docId = docId
        this.accessKey = accessKey
    }

    fun setOwnerId(ownerId: Long): DocsAddMethod {
        this.ownerId = ownerId
        return this
    }

    fun setDocId(docId: Long): DocsAddMethod {
        this.docId = docId
        return this
    }

    fun setAccessKey(accessKey: String): DocsAddMethod {
        this.accessKey = accessKey
        return this
    }

    override val classRef = DocsAddMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<AddResponse>>() {}
    }
}
