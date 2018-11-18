package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Imports a list of advertiser's contacts to count VK registered users against the target group.
 *
 *  [https://vk.com/dev/ads.importTargetContacts]
 *  @property [account_id] Advertising account ID.
 *  @property [client_id] 'Only for advertising agencies.' , ID of the client with the advertising account where the group will be created.
 *  @property [target_group_id] Target group ID.
 *  @property [contacts] List of phone numbers, emails or user IDs separated with a comma.
 */
class AdsImportTargetContactsMethod() : VkMethod<Long>(
    "ads.importTargetContacts",
    HashMap()
) {

    var accountId: Long? by props
    var clientId: Long? by props
    var targetGroupId: Long? by props
    var contacts: String? by props

    constructor(
        accountId: Long? = null,
        clientId: Long? = null,
        targetGroupId: Long? = null,
        contacts: String? = null
    ) : this() {
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

    override val classRef = AdsImportTargetContactsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Long>>() {}
    }
}
