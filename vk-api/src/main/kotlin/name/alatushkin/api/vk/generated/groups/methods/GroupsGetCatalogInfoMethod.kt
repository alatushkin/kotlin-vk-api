@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.GetCatalogInfoResponse
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
    object : TypeReference<VkResponse<GetCatalogInfoResponse>>() {}
), UserMethod {

    var subcategories: Boolean? by props

    init {
        this.subcategories = subcategories
    }

    fun setSubcategories(subcategories: Boolean): GroupsGetCatalogInfoMethod {
        this.subcategories = subcategories
        return this
    }
}
