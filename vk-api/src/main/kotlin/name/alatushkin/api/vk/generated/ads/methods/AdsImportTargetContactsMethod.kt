@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.importTargetContacts]
 *
 * Imports a list of advertiser's contacts to count VK registered users against the target group.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'Only for advertising agencies.' , ID of the client with the advertising account where the group will be created.
 * @property targetGroupId Target group ID.
 * @property contacts List of phone numbers, emails or user IDs separated with a comma.
 */
class AdsImportTargetContactsMethod(
        accountId: Long,
        clientId: Long? = null,
        targetGroupId: Long,
        contacts: String
) : VkMethod<Long>(
    "ads.importTargetContacts",
    mutableMapOf(),
    object : TypeReference<VkResponse<Long>>() {}
), UserMethod {

    var accountId: Long by props
    var clientId: Long? by props
    var targetGroupId: Long by props
    var contacts: String by props

    init {
        this.accountId = accountId
        this.clientId = clientId
        this.targetGroupId = targetGroupId
        this.contacts = contacts
    }

    fun setAccountId(accountId: Long): AdsImportTargetContactsMethod {
        this.accountId = accountId
        return this
    }

    fun setClientId(clientId: Long): AdsImportTargetContactsMethod {
        this.clientId = clientId
        return this
    }

    fun setTargetGroupId(targetGroupId: Long): AdsImportTargetContactsMethod {
        this.targetGroupId = targetGroupId
        return this
    }

    fun setContacts(contacts: String): AdsImportTargetContactsMethod {
        this.contacts = contacts
        return this
    }
}
