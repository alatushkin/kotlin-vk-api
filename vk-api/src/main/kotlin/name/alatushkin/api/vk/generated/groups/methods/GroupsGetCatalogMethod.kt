@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.Group
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.getCatalog]
 *
 * Returns communities list for a catalog category.
 *
 * @property categoryId Category id received from [vk.com/dev/groups.getCatalogInfo|groups.getCatalogInfo].
 * @property subcategoryId Subcategory id received from [vk.com/dev/groups.getCatalogInfo|groups.getCatalogInfo].
 */
class GroupsGetCatalogMethod(
        categoryId: Long? = null,
        subcategoryId: Long? = null
) : VkMethod<VkList<Group>>(
    "groups.getCatalog",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<Group>>>() {}
), UserMethod {

    var categoryId: Long? by props
    var subcategoryId: Long? by props

    init {
        this.categoryId = categoryId
        this.subcategoryId = subcategoryId
    }

    fun setCategoryId(categoryId: Long): GroupsGetCatalogMethod {
        this.categoryId = categoryId
        return this
    }

    fun setSubcategoryId(subcategoryId: Long): GroupsGetCatalogMethod {
        this.subcategoryId = subcategoryId
        return this
    }
}
