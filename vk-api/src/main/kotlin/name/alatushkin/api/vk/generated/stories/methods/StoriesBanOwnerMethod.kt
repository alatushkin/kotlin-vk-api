package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Allows to hide stories from chosen sources from current user's feed.
 *
 *  [https://vk.com/dev/stories.banOwner]
 *  @property [owners_ids] List of sources IDs
 */
class StoriesBanOwnerMethod() : VkMethod<Boolean>(
    "stories.banOwner",
    HashMap()
) {

    var ownersIds: Array<Long>? by props

    constructor(
        ownersIds: Array<Long>? = null
    ) : this() {
        this.ownersIds = ownersIds
    }

    fun setOwnersIds(ownersIds: Array<Long>): StoriesBanOwnerMethod {
        this.ownersIds = ownersIds
        return this
    }

    override val classRef = StoriesBanOwnerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
