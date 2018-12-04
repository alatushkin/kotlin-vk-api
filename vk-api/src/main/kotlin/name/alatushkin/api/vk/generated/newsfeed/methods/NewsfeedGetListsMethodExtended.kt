@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.newsfeed.ListFull
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.getLists]
 *
 * Returns a list of newsfeeds followed by the current user.
 *
 * @property listIds numeric list identifiers.
 */
class NewsfeedGetListsMethodExtended(
        listIds: Array<Long>? = null
) : VkMethod<VkList<ListFull>>(
    "newsfeed.getLists",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkSuccess<VkList<ListFull>>>() {}
), UserMethod {

    var listIds: Array<Long>? by props

    init {
        this.listIds = listIds
    }

    fun setListIds(listIds: Array<Long>): NewsfeedGetListsMethodExtended {
        this.listIds = listIds
        return this
    }
}
