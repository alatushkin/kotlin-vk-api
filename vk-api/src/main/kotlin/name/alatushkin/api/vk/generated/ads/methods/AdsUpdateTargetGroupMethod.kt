@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.updateTargetGroup]
 *
 * Edits a retarget group.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'Only for advertising agencies.' , ID of the client with the advertising account where the group will be created.
 * @property targetGroupId Group ID.
 * @property name New name of the target group — a string up to 64 characters long.
 * @property domain Domain of the site where user accounting code will be placed.
 * @property lifetime 'Only for the groups that get audience from sites with user accounting code.', Time in days when users added to a retarget group will be automatically excluded from it. '0' – automatic exclusion is off.
 */
class AdsUpdateTargetGroupMethod(
    accountId: Long,
    clientId: Long? = null,
    targetGroupId: Long,
    name: String,
    domain: String? = null,
    lifetime: Long? = null
) : VkMethod<Boolean>(
    "ads.updateTargetGroup",
    mutableMapOf(),
    successReference()
), UserMethod {

    var accountId: Long by props
    var clientId: Long? by props
    var targetGroupId: Long by props
    var name: String by props
    var domain: String? by props
    var lifetime: Long? by props

    init {
        this.accountId = accountId
        this.clientId = clientId
        this.targetGroupId = targetGroupId
        this.name = name
        this.domain = domain
        this.lifetime = lifetime
    }
}
