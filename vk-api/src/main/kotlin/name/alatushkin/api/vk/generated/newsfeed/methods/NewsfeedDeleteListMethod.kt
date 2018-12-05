@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

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
    object : TypeReference<VkResponse<Boolean>>() {}
) {

    var listId: Long by props

    init {
        this.listId = listId
    }

    fun setListId(listId: Long): NewsfeedDeleteListMethod {
        this.listId = listId
        return this
    }
}
