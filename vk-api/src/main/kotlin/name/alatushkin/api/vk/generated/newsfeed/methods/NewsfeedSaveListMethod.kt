@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.saveList]
 *
 * Creates and edits user newsfeed lists
 *
 * @property listId numeric list identifier (if not sent, will be set automatically).
 * @property title list name.
 * @property sourceIds users and communities identifiers to be added to the list. Community identifiers must be negative numbers.
 * @property noReposts reposts display on and off ('1' is for off).
 */
class NewsfeedSaveListMethod(
        listId: Long? = null,
        title: String,
        sourceIds: Array<Long>? = null,
        noReposts: Boolean? = null
) : VkMethod<Long>(
    "newsfeed.saveList",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Long>>() {}
), UserMethod {

    var listId: Long? by props
    var title: String by props
    var sourceIds: Array<Long>? by props
    var noReposts: Boolean? by props

    init {
        this.listId = listId
        this.title = title
        this.sourceIds = sourceIds
        this.noReposts = noReposts
    }

    fun setListId(listId: Long): NewsfeedSaveListMethod {
        this.listId = listId
        return this
    }

    fun setTitle(title: String): NewsfeedSaveListMethod {
        this.title = title
        return this
    }

    fun setSourceIds(sourceIds: Array<Long>): NewsfeedSaveListMethod {
        this.sourceIds = sourceIds
        return this
    }

    fun setNoReposts(noReposts: Boolean): NewsfeedSaveListMethod {
        this.noReposts = noReposts
        return this
    }
}
