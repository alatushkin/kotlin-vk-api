package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.Group

/**
 *  Returns communities list for a catalog category.
 *
 *  [https://vk.com/dev/groups.getCatalog]
 *  @property [category_id] Category id received from [vk.com/dev/groups.getCatalogInfo|groups.getCatalogInfo].
 *  @property [subcategory_id] Subcategory id received from [vk.com/dev/groups.getCatalogInfo|groups.getCatalogInfo].
 */
class GroupsGetCatalogMethod() : VkMethod<VkList<Group>>(
    "groups.getCatalog",
    HashMap()
) {

    var categoryId: Long? by props
    var subcategoryId: Long? by props

    constructor(
        categoryId: Long? = null,
        subcategoryId: Long? = null
    ) : this() {
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

    override val classRef = GroupsGetCatalogMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Group>>>() {}
    }
}
