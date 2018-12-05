@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.friends.UserXtrPhone
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
    object : TypeReference<VkResponse<Array<UserXtrPhone>>>() {}
), UserMethod {

    var phones: Array<String>? by props
    var fields: Array<String>? by props

    init {
        this.phones = phones
        this.fields = fields
    }

    fun setPhones(phones: Array<String>): FriendsGetByPhonesMethod {
        this.phones = phones
        return this
    }

    fun setFields(fields: Array<String>): FriendsGetByPhonesMethod {
        this.fields = fields
        return this
    }
}
