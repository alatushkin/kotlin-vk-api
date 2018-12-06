@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.getViewers]
 *
 * Returns a list of story viewers.
 *
 * @property ownerId Story owner ID.
 * @property storyId Story ID.
 * @property count Maximum number of results.
 * @property offset Offset needed to return a specific subset of results.
 */
class StoriesGetViewersMethod(
    ownerId: Long,
    storyId: Long,
    count: Long? = null,
    offset: Long? = null
) : VkMethod<VkList<Long>>(
    "stories.getViewers",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var ownerId: Long by props
    var storyId: Long by props
    var count: Long? by props
    var offset: Long? by props

    init {
        this.ownerId = ownerId
        this.storyId = storyId
        this.count = count
        this.offset = offset
    }
}
