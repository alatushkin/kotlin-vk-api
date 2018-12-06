@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.docs.Doc
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var docs: Array<String> by props

    init {
        this.docs = docs
    }
}
