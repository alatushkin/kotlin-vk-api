@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.newsfeed.List
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.getLists]
 *
 * Returns a list of newsfeeds followed by the current user.
 *
 * @property listIds numeric list identifiers.
 */
class NewsfeedGetListsMethod(
    listIds: Array<Long>? = null
) : VkMethod<VkList<List>>(
    "newsfeed.getLists",
    mutableMapOf(),
    successReference()
), UserMethod {

    var listIds: Array<Long>? by props

    init {
        this.listIds = listIds
    }
}
