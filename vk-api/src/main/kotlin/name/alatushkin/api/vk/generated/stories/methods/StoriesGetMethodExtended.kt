package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.stories.Story

/**
 *  Returns stories available for current user.
 *
 *  [https://vk.com/dev/stories.get]
 *  @property [owner_id] Owner ID.
 */
class StoriesGetMethodExtended() : VkMethod<VkList<Array<Story>>>(
    "stories.get",
    mutableMapOf("extended" to "1")
) {

    var ownerId: Long? by props

    constructor(
        ownerId: Long? = null
    ) : this() {
        this.ownerId = ownerId
    }

    fun setOwnerId(ownerId: Long): StoriesGetMethodExtended {
        this.ownerId = ownerId
        return this
    }

    override val classRef = StoriesGetMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Array<Story>>>>() {}
    }
}
