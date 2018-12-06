@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.friends.Order
import name.alatushkin.api.vk.generated.friends.UserXtrLists
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/friends.get]
 *
 * Returns a list of user IDs or detailed information about a user's friends.
 *
 * @property userId User ID. By default, the current user ID.
 * @property order Sort order: , 'name' — by name (enabled only if the 'fields' parameter is used), 'hints' — by rating, similar to how friends are sorted in My friends section, , This parameter is available only for [vk.com/dev/standalone|desktop applications].
 * @property listId ID of the friend list returned by the [vk.com/dev/friends.getLists|friends.getLists] method to be used as the source. This parameter is taken into account only when the uid parameter is set to the current user ID. This parameter is available only for [vk.com/dev/standalone|desktop applications].
 * @property count Number of friends to return.
 * @property offset Offset needed to return a specific subset of friends.
 * @property fields Profile fields to return. Sample values: 'uid', 'first_name', 'last_name', 'nickname', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'domain', 'has_mobile', 'rate', 'contacts', 'education'.
 * @property nameCase Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class FriendsGetMethodWithFields(
    userId: Long? = null,
    order: Order? = null,
    listId: Long? = null,
    count: Long? = null,
    offset: Long? = null,
    fields: Array<String>? = null,
    nameCase: NameCase? = null
) : VkMethod<VkList<UserXtrLists>>(
    "friends.get",
    mutableMapOf(),
    successReference()
), UserServiceMethod {

    var userId: Long? by props
    var order: Order? by props
    var listId: Long? by props
    var count: Long? by props
    var offset: Long? by props
    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    init {
        this.userId = userId
        this.order = order
        this.listId = listId
        this.count = count
        this.offset = offset
        this.fields = fields
        this.nameCase = nameCase
    }
}
