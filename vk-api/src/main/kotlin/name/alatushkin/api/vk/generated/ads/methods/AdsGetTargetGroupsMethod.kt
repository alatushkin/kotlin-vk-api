package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.TargetGroup

/**
 *  Returns a list of target groups.
 *
 *  [https://vk.com/dev/ads.getTargetGroups]
 *  @property [account_id] Advertising account ID.
 *  @property [client_id] 'Only for advertising agencies.', ID of the client with the advertising account where the group will be created.
 *  @property [extended] '1' — to return pixel code.
 */
class AdsGetTargetGroupsMethod() : VkMethod<Array<TargetGroup>>(
    "ads.getTargetGroups",
    HashMap()
) {

    var accountId: Long? by props
    var clientId: Long? by props
    var extended: Boolean? by props

    constructor(
        accountId: Long? = null,
        clientId: Long? = null,
        extended: Boolean? = null
    ) : this() {
        this.accountId = accountId
        this.clientId = clientId
        this.extended = extended
    }

    fun setAccountId(accountId: Long): AdsGetTargetGroupsMethod {
        this.accountId = accountId
        return this
    }

    fun setClientId(clientId: Long): AdsGetTargetGroupsMethod {
        this.clientId = clientId
        return this
    }

    fun setExtended(extended: Boolean): AdsGetTargetGroupsMethod {
        this.extended = extended
        return this
    }

    override val classRef = AdsGetTargetGroupsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<TargetGroup>>>() {}
    }
}
