@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.newsfeed.UnsubscribeType
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.unsubscribe]
 *
 * Unsubscribes the current user from specified newsfeeds.
 *
 * @property type Type of object from which to unsubscribe: 'note' — note, 'photo' — photo, 'post' — post on user wall or community wall, 'topic' — topic, 'video' — video
 * @property ownerId Object owner ID.
 * @property itemId Object ID.
 */
class NewsfeedUnsubscribeMethod(
    type: UnsubscribeType,
    ownerId: Long? = null,
    itemId: Long
) : VkMethod<Boolean>(
    "newsfeed.unsubscribe",
    mutableMapOf(),
    successReference()
), UserMethod {

    var type: UnsubscribeType by props
    var ownerId: Long? by props
    var itemId: Long by props

    init {
        this.type = type
        this.ownerId = ownerId
        this.itemId = itemId
    }
}
