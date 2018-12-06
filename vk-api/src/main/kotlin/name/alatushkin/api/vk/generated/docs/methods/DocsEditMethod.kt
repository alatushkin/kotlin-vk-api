@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/docs.edit]
 *
 * Edits a document.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property docId Document ID.
 * @property title Document title.
 * @property tags Document tags.
 */
class DocsEditMethod(
    ownerId: Long,
    docId: Long,
    title: String? = null,
    tags: Array<String>? = null
) : VkMethod<Boolean>(
    "docs.edit",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var docId: Long by props
    var title: String? by props
    var tags: Array<String>? by props

    init {
        this.ownerId = ownerId
        this.docId = docId
        this.title = title
        this.tags = tags
    }
}
