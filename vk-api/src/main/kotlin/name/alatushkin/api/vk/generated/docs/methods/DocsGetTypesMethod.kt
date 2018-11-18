package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.docs.DocTypes

/**
 *  Returns documents types available for current user.
 *
 *  [https://vk.com/dev/docs.getTypes]
 *  @property [owner_id] ID of the user or community that owns the documents. Use a negative value to designate a community ID.
 */
class DocsGetTypesMethod() : VkMethod<VkList<DocTypes>>(
    "docs.getTypes",
    HashMap()
) {

    var ownerId: Long? by props

    constructor(
        ownerId: Long? = null
    ) : this() {
        this.ownerId = ownerId
    }

    fun setOwnerId(ownerId: Long): DocsGetTypesMethod {
        this.ownerId = ownerId
        return this
    }

    override val classRef = DocsGetTypesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<DocTypes>>>() {}
    }
}
