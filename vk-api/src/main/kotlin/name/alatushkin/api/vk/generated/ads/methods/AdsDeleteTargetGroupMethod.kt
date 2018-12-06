@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.deleteTargetGroup]
 *
 * Deletes a retarget group.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'Only for advertising agencies.' , ID of the client with the advertising account where the group will be created.
 * @property targetGroupId Group ID.
 */
class AdsDeleteTargetGroupMethod(
    accountId: Long,
    clientId: Long? = null,
    targetGroupId: Long
) : VkMethod<Boolean>(
    "ads.deleteTargetGroup",
    mutableMapOf(),
    successReference()
), UserMethod {

    var accountId: Long by props
    var clientId: Long? by props
    var targetGroupId: Long by props

    init {
        this.accountId = accountId
        this.clientId = clientId
        this.targetGroupId = targetGroupId
    }
}
