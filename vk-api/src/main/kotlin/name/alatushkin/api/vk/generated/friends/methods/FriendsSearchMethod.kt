@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.users.UserFull
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.search]
 *
 * Returns a list of friends matching the search criteria.
 *
 * @property userId User ID.
 * @property q Search query string (e.g., 'Vasya Babich').
 * @property fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online',
 * @property nameCase Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 * @property offset Offset needed to return a specific subset of friends.
 * @property count Number of friends to return.
 */
class FriendsSearchMethod(
    userId: Long,
    q: String? = null,
    fields: Array<String>? = null,
    nameCase: NameCase? = null,
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<UserFull>>(
    "friends.search",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long by props
    var q: String? by props
    var fields: Array<String>? by props
    var nameCase: NameCase? by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.userId = userId
        this.q = q
        this.fields = fields
        this.nameCase = nameCase
        this.offset = offset
        this.count = count
    }
}
