package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.newsfeed.UnignoreItemType

/**
 *  Returns a hidden item to the newsfeed.
 *
 *  [https://vk.com/dev/newsfeed.unignoreItem]
 *  @property [type] Item type. Possible values: *'wall' – post on the wall,, *'tag' – tag on a photo,, *'profilephoto' – profile photo,, *'video' – video,, *'audio' – audio.
 *  @property [owner_id] Item owner's identifier (user or community), "Note that community id must be negative. 'owner_id=1' – user , 'owner_id=-1' – community "
 *  @property [item_id] Item identifier
 */
class NewsfeedUnignoreItemMethod() : VkMethod<Boolean>(
    "newsfeed.unignoreItem",
    HashMap()
) {

    var type: UnignoreItemType? by props
    var ownerId: Long? by props
    var itemId: Long? by props

    constructor(
        type: UnignoreItemType? = null,
        ownerId: Long? = null,
        itemId: Long? = null
    ) : this() {
        this.type = type
        this.ownerId = ownerId
        this.itemId = itemId
    }

    fun setType(type: UnignoreItemType): NewsfeedUnignoreItemMethod {
        this.type = type
        return this
    }

    fun setOwnerId(ownerId: Long): NewsfeedUnignoreItemMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): NewsfeedUnignoreItemMethod {
        this.itemId = itemId
        return this
    }

    override val classRef = NewsfeedUnignoreItemMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
