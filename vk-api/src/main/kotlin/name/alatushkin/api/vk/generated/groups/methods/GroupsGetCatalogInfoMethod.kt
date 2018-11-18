package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.GetCatalogInfoResponse

/**
 *  Returns categories list for communities catalog
 *
 *  [https://vk.com/dev/groups.getCatalogInfo]
 *  @property [subcategories] 1 – to return subcategories info. By default: 0.
 */
class GroupsGetCatalogInfoMethod() : VkMethod<GetCatalogInfoResponse>(
    "groups.getCatalogInfo",
    mutableMapOf()
) {

    var subcategories: Boolean? by props

    constructor(
        subcategories: Boolean? = null
    ) : this() {
        this.subcategories = subcategories
    }

    fun setSubcategories(subcategories: Boolean): GroupsGetCatalogInfoMethod {
        this.subcategories = subcategories
        return this
    }

    override val classRef = GroupsGetCatalogInfoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GetCatalogInfoResponse>>() {}
    }
}
