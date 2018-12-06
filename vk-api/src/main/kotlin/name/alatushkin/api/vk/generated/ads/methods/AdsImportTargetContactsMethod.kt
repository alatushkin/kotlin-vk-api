@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
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
}
