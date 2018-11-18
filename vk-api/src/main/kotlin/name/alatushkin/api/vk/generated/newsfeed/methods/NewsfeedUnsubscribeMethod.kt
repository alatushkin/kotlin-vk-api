package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.newsfeed.UnsubscribeType

/**
 *  Unsubscribes the current user from specified newsfeeds.
 *
 *  [https://vk.com/dev/newsfeed.unsubscribe]
 *  @property [type] Type of object from which to unsubscribe: 'note' — note, 'photo' — photo, 'post' — post on user wall or community wall, 'topic' — topic, 'video' — video
 *  @property [owner_id] Object owner ID.
 *  @property [item_id] Object ID.
 */
class NewsfeedUnsubscribeMethod() : VkMethod<Boolean>(
    "newsfeed.unsubscribe",
    HashMap()
) {

    var type: UnsubscribeType? by props
    var ownerId: Long? by props
    var itemId: Long? by props

    constructor(
        type: UnsubscribeType? = null,
        ownerId: Long? = null,
        itemId: Long? = null
    ) : this() {
        this.type = type
        this.ownerId = ownerId
        this.itemId = itemId
    }

    fun setType(type: UnsubscribeType): NewsfeedUnsubscribeMethod {
        this.type = type
        return this
    }

    fun setOwnerId(ownerId: Long): NewsfeedUnsubscribeMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): NewsfeedUnsubscribeMethod {
        this.itemId = itemId
        return this
    }

    override val classRef = NewsfeedUnsubscribeMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
