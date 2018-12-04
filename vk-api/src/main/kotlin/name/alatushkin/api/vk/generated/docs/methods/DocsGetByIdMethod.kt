@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.docs.Doc
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/docs.getById]
 *
 * Returns information about documents by their IDs.
 *
 * @property docs Document IDs. Example: , "66748_91488,66748_91455",
 */
class DocsGetByIdMethod(
        docs: Array<String>
) : VkMethod<Array<Doc>>(
    "docs.getById",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Array<Doc>>>() {}
), UserMethod {

    var docs: Array<String> by props

    init {
        this.docs = docs
    }

    fun setDocs(docs: Array<String>): DocsGetByIdMethod {
        this.docs = docs
        return this
    }
}
