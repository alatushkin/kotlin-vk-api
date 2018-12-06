@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.ads.CreateTargetGroupResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.createTargetGroup]
 *
 * Creates a group to re-target ads for users who visited advertiser's site (viewed information about the product, registered, etc.).
 *
 * @property accountId Advertising account ID.
 * @property clientId 'Only for advertising agencies.', ID of the client with the advertising account where the group will be created.
 * @property name Name of the target group — a string up to 64 characters long.
 * @property domain Domain of the site where user accounting code will be placed.
 * @property lifetime 'For groups with auditory created with pixel code only.', , Number of days after that users will be automatically removed from the group. '0' — not to remove users.
 */
class AdsCreateTargetGroupMethod(
    accountId: Long,
    clientId: Long? = null,
    name: String,
    domain: String? = null,
    lifetime: Long? = null
) : VkMethod<CreateTargetGroupResponse>(
    "ads.createTargetGroup",
    mutableMapOf(),
    successReference()
), UserMethod {

    var accountId: Long by props
    var clientId: Long? by props
    var name: String by props
    var domain: String? by props
    var lifetime: Long? by props

    init {
        this.accountId = accountId
        this.clientId = clientId
        this.name = name
        this.domain = domain
        this.lifetime = lifetime
    }
}
