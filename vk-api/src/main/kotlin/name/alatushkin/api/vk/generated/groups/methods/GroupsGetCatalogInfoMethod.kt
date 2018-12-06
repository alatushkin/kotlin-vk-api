@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.groups.GetCatalogInfoResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.getCatalogInfo]
 *
 * Returns categories list for communities catalog
 *
 * @property subcategories 1 – to return subcategories info. By default: 0.
 */
class GroupsGetCatalogInfoMethod(
    subcategories: Boolean? = null
) : VkMethod<GetCatalogInfoResponse>(
    "groups.getCatalogInfo",
    mutableMapOf(),
    successReference()
), UserMethod {

    var subcategories: Boolean? by props

    init {
        this.subcategories = subcategories
    }
}
