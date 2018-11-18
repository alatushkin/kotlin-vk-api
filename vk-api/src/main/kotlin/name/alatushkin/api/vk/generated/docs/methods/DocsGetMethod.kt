package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.docs.Doc

/**
 *  Returns detailed information about user or community documents.
 *
 *  [https://vk.com/dev/docs.get]
 *  @property [count] Number of documents to return. By default, all documents.
 *  @property [offset] Offset needed to return a specific subset of documents.
 *  @property [owner_id] ID of the user or community that owns the documents. Use a negative value to designate a community ID.
 */
class DocsGetMethod() : VkMethod<VkList<Doc>>(
    "docs.get",
    HashMap()
) {

    var count: Long? by props
    var offset: Long? by props
    var ownerId: Long? by props

    constructor(
        count: Long? = null,
        offset: Long? = null,
        ownerId: Long? = null
    ) : this() {
        this.count = count
        this.offset = offset
        this.ownerId = ownerId
    }

    fun setCount(count: Long): DocsGetMethod {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): DocsGetMethod {
        this.offset = offset
        return this
    }

    fun setOwnerId(ownerId: Long): DocsGetMethod {
        this.ownerId = ownerId
        return this
    }

    override val classRef = DocsGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Doc>>>() {}
    }
}
