package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Allows to show stories from hidden sources in current user's feed.
 *
 *  [https://vk.com/dev/stories.unbanOwner]
 *  @property [owners_ids] List of hidden sources to show stories from.
 */
class StoriesUnbanOwnerMethod() : VkMethod<Boolean>(
    "stories.unbanOwner",
    HashMap()
) {

    var ownersIds: Array<Long>? by props

    constructor(
        ownersIds: Array<Long>? = null
    ) : this() {
        this.ownersIds = ownersIds
    }

    fun setOwnersIds(ownersIds: Array<Long>): StoriesUnbanOwnerMethod {
        this.ownersIds = ownersIds
        return this
    }

    override val classRef = StoriesUnbanOwnerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
