package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.newsfeed.IgnoreItemType

/**
 *  Hides an item from the newsfeed.
 *
 *  [https://vk.com/dev/newsfeed.ignoreItem]
 *  @property [type] Item type. Possible values: *'wall' – post on the wall,, *'tag' – tag on a photo,, *'profilephoto' – profile photo,, *'video' – video,, *'audio' – audio.
 *  @property [owner_id] Item owner's identifier (user or community), "Note that community id must be negative. 'owner_id=1' – user , 'owner_id=-1' – community "
 *  @property [item_id] Item identifier
 */
class NewsfeedIgnoreItemMethod() : VkMethod<Boolean>(
    "newsfeed.ignoreItem",
    HashMap()
) {

    var type: IgnoreItemType? by props
    var ownerId: Long? by props
    var itemId: Long? by props

    constructor(
        type: IgnoreItemType? = null,
        ownerId: Long? = null,
        itemId: Long? = null
    ) : this() {
        this.type = type
        this.ownerId = ownerId
        this.itemId = itemId
    }

    fun setType(type: IgnoreItemType): NewsfeedIgnoreItemMethod {
        this.type = type
        return this
    }

    fun setOwnerId(ownerId: Long): NewsfeedIgnoreItemMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): NewsfeedIgnoreItemMethod {
        this.itemId = itemId
        return this
    }

    override val classRef = NewsfeedIgnoreItemMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
