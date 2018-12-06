@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.users.UserFull
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getAvailableForCall]
 *
 * Returns a list of friends who can be called by the current user.
 *
 * @property fields Profile fields to return. Sample values: 'uid', 'first_name', 'last_name', 'nickname', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'domain', 'has_mobile', 'rate', 'contacts', 'education'.
 * @property nameCase Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class FriendsGetAvailableForCallMethodWithFields(
    fields: Array<String>? = null,
    nameCase: NameCase? = null
) : VkMethod<VkList<UserFull>>(
    "friends.getAvailableForCall",
    mutableMapOf(),
    successReference()
), UserMethod {

    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    init {
        this.fields = fields
        this.nameCase = nameCase
    }
}
