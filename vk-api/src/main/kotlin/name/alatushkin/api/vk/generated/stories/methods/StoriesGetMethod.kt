package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.stories.Story

/**
 *  Returns stories available for current user.
 *
 *  [https://vk.com/dev/stories.get]
 *  @property [owner_id] Owner ID.
 */
class StoriesGetMethod() : VkMethod<VkList<Array<Story>>>(
    "stories.get",
    mutableMapOf()
) {

    var ownerId: Long? by props

    constructor(
        ownerId: Long? = null
    ) : this() {
        this.ownerId = ownerId
    }

    fun setOwnerId(ownerId: Long): StoriesGetMethod {
        this.ownerId = ownerId
        return this
    }

    override val classRef = StoriesGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<Array<Story>>>>() {}
    }
}
