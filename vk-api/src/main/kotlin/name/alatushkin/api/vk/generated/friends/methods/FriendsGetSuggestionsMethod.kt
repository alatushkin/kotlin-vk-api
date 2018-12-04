@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.users.UserFull
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getSuggestions]
 *
 * Returns a list of profiles of users whom the current user may know.
 *
 * @property filter Types of potential friends to return: 'mutual' — users with many mutual friends , 'contacts' — users found with the [vk.com/dev/account.importContacts|account.importContacts] method , 'mutual_contacts' — users who imported the same contacts as the current user with the [vk.com/dev/account.importContacts|account.importContacts] method
 * @property count Number of suggestions to return.
 * @property offset Offset needed to return a specific subset of suggestions.
 * @property fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online', 'counters'.
 * @property nameCase Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class FriendsGetSuggestionsMethod(
        filter: Array<String>? = null,
        count: Long? = null,
        offset: Long? = null,
        fields: Array<String>? = null,
        nameCase: NameCase? = null
) : VkMethod<VkList<UserFull>>(
    "friends.getSuggestions",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<UserFull>>>() {}
), UserMethod {

    var filter: Array<String>? by props
    var count: Long? by props
    var offset: Long? by props
    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    init {
        this.filter = filter
        this.count = count
        this.offset = offset
        this.fields = fields
        this.nameCase = nameCase
    }

    fun setFilter(filter: Array<String>): FriendsGetSuggestionsMethod {
        this.filter = filter
        return this
    }

    fun setCount(count: Long): FriendsGetSuggestionsMethod {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): FriendsGetSuggestionsMethod {
        this.offset = offset
        return this
    }

    fun setFields(fields: Array<String>): FriendsGetSuggestionsMethod {
        this.fields = fields
        return this
    }

    fun setNameCase(nameCase: NameCase): FriendsGetSuggestionsMethod {
        this.nameCase = nameCase
        return this
    }
}
