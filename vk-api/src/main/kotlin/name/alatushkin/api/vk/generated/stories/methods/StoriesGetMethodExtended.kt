package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.stories.GetExtendedResponse

/**
 *  Returns stories available for current user.
 *
 *  [https://vk.com/dev/stories.get]
 *  @property [owner_id] Owner ID.
 */
class StoriesGetMethodExtended() : VkMethod<GetExtendedResponse>(
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
        val classRef = object : TypeReference<VkSuccess<GetExtendedResponse>>() {}
    }
}
