package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.GetCatalogInfoExtendedResponse

/**
 *  Returns categories list for communities catalog
 *
 *  [https://vk.com/dev/groups.getCatalogInfo]
 *  @property [subcategories] 1 – to return subcategories info. By default: 0.
 */
class GroupsGetCatalogInfoMethodExtended() : VkMethod<GetCatalogInfoExtendedResponse>(
    "groups.getCatalogInfo",
    mutableMapOf("extended" to "1")
) {

    var subcategories: Boolean? by props

    constructor(
        subcategories: Boolean? = null
    ) : this() {
        this.subcategories = subcategories
    }

    fun setSubcategories(subcategories: Boolean): GroupsGetCatalogInfoMethodExtended {
        this.subcategories = subcategories
        return this
    }

    override val classRef = GroupsGetCatalogInfoMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<GetCatalogInfoExtendedResponse>>() {}
    }
}
