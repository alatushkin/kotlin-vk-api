@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.groups.Group
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var categoryId: Long? by props
    var subcategoryId: Long? by props

    init {
        this.categoryId = categoryId
        this.subcategoryId = subcategoryId
    }
}
