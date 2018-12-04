@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.newsfeed.IgnoreItemType
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.ignoreItem]
 *
 * Hides an item from the newsfeed.
 *
 * @property type Item type. Possible values: *'wall' – post on the wall,, *'tag' – tag on a photo,, *'profilephoto' – profile photo,, *'video' – video,, *'audio' – audio.
 * @property ownerId Item owner's identifier (user or community), "Note that community id must be negative. 'owner_id=1' – user , 'owner_id=-1' – community "
 * @property itemId Item identifier
 */
class NewsfeedIgnoreItemMethod(
        type: IgnoreItemType,
        ownerId: Long,
        itemId: Long
) : VkMethod<Boolean>(
    "newsfeed.ignoreItem",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var type: IgnoreItemType by props
    var ownerId: Long by props
    var itemId: Long by props

    init {
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
}
