@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.docs.DocTypes
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/docs.getTypes]
 *
 * Returns documents types available for current user.
 *
 * @property ownerId ID of the user or community that owns the documents. Use a negative value to designate a community ID.
 */
class DocsGetTypesMethod(
        ownerId: Long
) : VkMethod<VkList<DocTypes>>(
    "docs.getTypes",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<DocTypes>>>() {}
), UserMethod {

    var ownerId: Long by props

    init {
        this.ownerId = ownerId
    }

    fun setOwnerId(ownerId: Long): DocsGetTypesMethod {
        this.ownerId = ownerId
        return this
    }
}
