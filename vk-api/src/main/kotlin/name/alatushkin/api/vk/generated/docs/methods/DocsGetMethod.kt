@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.docs.Doc
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/docs.get]
 *
 * Returns detailed information about user or community documents.
 *
 * @property count Number of documents to return. By default, all documents.
 * @property offset Offset needed to return a specific subset of documents.
 * @property ownerId ID of the user or community that owns the documents. Use a negative value to designate a community ID.
 */
class DocsGetMethod(
        count: Long? = null,
        offset: Long? = null,
        ownerId: Long? = null
) : VkMethod<VkList<Doc>>(
    "docs.get",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<Doc>>>() {}
), UserMethod {

    var count: Long? by props
    var offset: Long? by props
    var ownerId: Long? by props

    init {
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
}
