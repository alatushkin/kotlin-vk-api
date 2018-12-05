@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.newsfeed.UnsubscribeType
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
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var type: UnsubscribeType by props
    var ownerId: Long? by props
    var itemId: Long by props

    init {
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
}
