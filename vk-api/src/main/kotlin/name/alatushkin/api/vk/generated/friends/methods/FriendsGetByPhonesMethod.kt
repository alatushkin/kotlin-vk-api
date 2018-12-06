@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.friends.UserXtrPhone
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getByPhones]
 *
 * Returns a list of the current user's friends whose phone numbers, validated or specified in a profile, are in a given list.
 *
 * @property phones List of phone numbers in MSISDN format (maximum 1000). Example: "+79219876543,+79111234567"
 * @property fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online, counters'.
 */
class FriendsGetByPhonesMethod(
    phones: Array<String>? = null,
    fields: Array<String>? = null
) : VkMethod<Array<UserXtrPhone>>(
    "friends.getByPhones",
    mutableMapOf(),
    successReference()
), UserMethod {

    var phones: Array<String>? by props
    var fields: Array<String>? by props

    init {
        this.phones = phones
        this.fields = fields
    }
}
