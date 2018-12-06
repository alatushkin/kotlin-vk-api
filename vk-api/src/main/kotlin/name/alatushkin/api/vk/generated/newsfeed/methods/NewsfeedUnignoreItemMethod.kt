@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.newsfeed.UnignoreItemType
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.unignoreItem]
 *
 * Returns a hidden item to the newsfeed.
 *
 * @property type Item type. Possible values: *'wall' – post on the wall,, *'tag' – tag on a photo,, *'profilephoto' – profile photo,, *'video' – video,, *'audio' – audio.
 * @property ownerId Item owner's identifier (user or community), "Note that community id must be negative. 'owner_id=1' – user , 'owner_id=-1' – community "
 * @property itemId Item identifier
 */
class NewsfeedUnignoreItemMethod(
    type: UnignoreItemType,
    ownerId: Long,
    itemId: Long
) : VkMethod<Boolean>(
    "newsfeed.unignoreItem",
    mutableMapOf(),
    successReference()
), UserMethod {

    var type: UnignoreItemType by props
    var ownerId: Long by props
    var itemId: Long by props

    init {
        this.type = type
        this.ownerId = ownerId
        this.itemId = itemId
    }
}
