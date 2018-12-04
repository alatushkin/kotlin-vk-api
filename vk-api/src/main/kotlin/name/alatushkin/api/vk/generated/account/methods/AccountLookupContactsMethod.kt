@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.account.LookupContactsService
import name.alatushkin.api.vk.generated.account.LookupResult
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.lookupContacts]
 *
 * Allows to search the VK users using phone numbers, e-mail addresses and user IDs on other services.
 *
 * @property contacts List of contacts separated with commas
 * @property service String identifier of a service which contacts are used for searching. Possible values: , * email, * phone, * twitter, * facebook, * odnoklassniki, * instagram, * google
 * @property mycontact Contact of a current user on a specified service
 * @property returnAll '1' – also return contacts found using this service before, '0' – return only contacts found using 'contacts' field.
 * @property fields Profile fields to return. Possible values: 'nickname, domain, sex, bdate, city, country, timezone, photo_50, photo_100, photo_200_orig, has_mobile, contacts, education, online, relation, last_seen, status, can_write_private_message, can_see_all_posts, can_post, universities'.
 */
class AccountLookupContactsMethod(
        contacts: Array<String>? = null,
        service: LookupContactsService,
        mycontact: String? = null,
        returnAll: Boolean? = null,
        fields: Array<String>? = null
) : VkMethod<LookupResult>(
    "account.lookupContacts",
    mutableMapOf(),
    object : TypeReference<VkSuccess<LookupResult>>() {}
), UserMethod {

    var contacts: Array<String>? by props
    var service: LookupContactsService by props
    var mycontact: String? by props
    var returnAll: Boolean? by props
    var fields: Array<String>? by props

    init {
        this.contacts = contacts
        this.service = service
        this.mycontact = mycontact
        this.returnAll = returnAll
        this.fields = fields
    }

    fun setContacts(contacts: Array<String>): AccountLookupContactsMethod {
        this.contacts = contacts
        return this
    }

    fun setService(service: LookupContactsService): AccountLookupContactsMethod {
        this.service = service
        return this
    }

    fun setMycontact(mycontact: String): AccountLookupContactsMethod {
        this.mycontact = mycontact
        return this
    }

    fun setReturnAll(returnAll: Boolean): AccountLookupContactsMethod {
        this.returnAll = returnAll
        return this
    }

    fun setFields(fields: Array<String>): AccountLookupContactsMethod {
        this.fields = fields
        return this
    }
}
