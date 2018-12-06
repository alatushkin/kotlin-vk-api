@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.ads.TargetGroup
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var accountId: Long by props
    var clientId: Long? by props
    var extended: Boolean? by props

    init {
        this.accountId = accountId
        this.clientId = clientId
        this.extended = extended
    }
}
