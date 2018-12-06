@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference

/**
 * [https://vk.com/dev/newsfeed.deleteList]
 *
 * null
 *
 * @property listId 
 */
class NewsfeedDeleteListMethod(
    listId: Long
) : VkMethod<Boolean>(
    "newsfeed.deleteList",
    mutableMapOf(),
    successReference()
) {

    var listId: Long by props

    init {
        this.listId = listId
    }
}
