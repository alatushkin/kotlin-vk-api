@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.newsfeed.List
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
    object : TypeReference<VkResponse<VkList<List>>>() {}
), UserMethod {

    var listIds: Array<Long>? by props

    init {
        this.listIds = listIds
    }

    fun setListIds(listIds: Array<Long>): NewsfeedGetListsMethod {
        this.listIds = listIds
        return this
    }
}
