package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Hides all replies in the last 24 hours from the user to current user's stories.
 *
 *  [https://vk.com/dev/stories.hideAllReplies]
 *  @property [owner_id] ID of the user whose replies should be hidden.
 */
class StoriesHideAllRepliesMethod() : VkMethod<Boolean>(
    "stories.hideAllReplies",
    HashMap()
) {

    var ownerId: Long? by props

    constructor(
        ownerId: Long? = null
    ) : this() {
        this.ownerId = ownerId
    }

    fun setOwnerId(ownerId: Long): StoriesHideAllRepliesMethod {
        this.ownerId = ownerId
        return this
    }

    override val classRef = StoriesHideAllRepliesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
