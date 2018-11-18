package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.docs.Doc

/**
 *  Returns information about documents by their IDs.
 *
 *  [https://vk.com/dev/docs.getById]
 *  @property [docs] Document IDs. Example: , "66748_91488,66748_91455",
 */
class DocsGetByIdMethod() : VkMethod<Array<Doc>>(
    "docs.getById",
    HashMap()
) {

    var docs: Array<String>? by props

    constructor(
        docs: Array<String>? = null
    ) : this() {
        this.docs = docs
    }

    fun setDocs(docs: Array<String>): DocsGetByIdMethod {
        this.docs = docs
        return this
    }

    override val classRef = DocsGetByIdMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Doc>>>() {}
    }
}
