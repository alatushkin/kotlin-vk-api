@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.docs.AddResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/docs.add]
 *
 * Copies a document to a user's or community's document list.
 *
 * @property ownerId ID of the user or community that owns the document. Use a negative value to designate a community ID.
 * @property docId Document ID.
 * @property accessKey Access key. This parameter is required if 'access_key' was returned with the document's data.
 */
class DocsAddMethod(
        ownerId: Long,
        docId: Long,
        accessKey: String? = null
) : VkMethod<AddResponse>(
    "docs.add",
    mutableMapOf(),
    object : TypeReference<VkSuccess<AddResponse>>() {}
), UserMethod {

    var ownerId: Long by props
    var docId: Long by props
    var accessKey: String? by props

    init {
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
}
