@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.docs.DocTypes
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var ownerId: Long by props

    init {
        this.ownerId = ownerId
    }
}
