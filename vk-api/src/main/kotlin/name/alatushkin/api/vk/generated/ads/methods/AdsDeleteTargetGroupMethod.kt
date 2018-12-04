package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Deletes a retarget group.
 *
 *  [https://vk.com/dev/ads.deleteTargetGroup]
 *  @property [account_id] Advertising account ID.
 *  @property [client_id] 'Only for advertising agencies.' , ID of the client with the advertising account where the group will be created.
 *  @property [target_group_id] Group ID.
 */
class AdsDeleteTargetGroupMethod() : VkMethod<Boolean>(
    "ads.deleteTargetGroup",
    HashMap()
) {

    var accountId: Long? by props
    var clientId: Long? by props
    var targetGroupId: Long? by props

    constructor(
        accountId: Long? = null,
        clientId: Long? = null,
        targetGroupId: Long? = null
    ) : this() {
        this.accountId = accountId
        this.clientId = clientId
        this.targetGroupId = targetGroupId
    }

    fun setAccountId(accountId: Long): AdsDeleteTargetGroupMethod {
        this.accountId = accountId
        return this
    }

    fun setClientId(clientId: Long): AdsDeleteTargetGroupMethod {
        this.clientId = clientId
        return this
    }

    fun setTargetGroupId(targetGroupId: Long): AdsDeleteTargetGroupMethod {
        this.targetGroupId = targetGroupId
        return this
    }

    override val classRef = AdsDeleteTargetGroupMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
