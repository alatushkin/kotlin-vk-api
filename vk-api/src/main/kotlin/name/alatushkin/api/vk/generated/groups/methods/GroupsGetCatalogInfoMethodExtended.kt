@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.GetCatalogInfoExtendedResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.getCatalogInfo]
 *
 * Returns categories list for communities catalog
 *
 * @property subcategories 1 – to return subcategories info. By default: 0.
 */
class GroupsGetCatalogInfoMethodExtended(
        subcategories: Boolean? = null
) : VkMethod<GetCatalogInfoExtendedResponse>(
    "groups.getCatalogInfo",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkSuccess<GetCatalogInfoExtendedResponse>>() {}
), UserMethod {

    var subcategories: Boolean? by props

    init {
        this.subcategories = subcategories
    }

    fun setSubcategories(subcategories: Boolean): GroupsGetCatalogInfoMethodExtended {
        this.subcategories = subcategories
        return this
    }
}
