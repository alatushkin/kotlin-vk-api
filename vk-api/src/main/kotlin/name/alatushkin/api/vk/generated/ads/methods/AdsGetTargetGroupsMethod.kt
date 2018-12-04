@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.TargetGroup
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getTargetGroups]
 *
 * Returns a list of target groups.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'Only for advertising agencies.', ID of the client with the advertising account where the group will be created.
 * @property extended '1' — to return pixel code.
 */
class AdsGetTargetGroupsMethod(
        accountId: Long,
        clientId: Long? = null,
        extended: Boolean? = null
) : VkMethod<Array<TargetGroup>>(
    "ads.getTargetGroups",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Array<TargetGroup>>>() {}
), UserMethod {

    var accountId: Long by props
    var clientId: Long? by props
    var extended: Boolean? by props

    init {
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
}
