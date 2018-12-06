@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
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
}
