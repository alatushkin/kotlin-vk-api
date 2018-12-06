@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.ads.FloodStats
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getFloodStats]
 *
 * Returns information about current state of a counter — number of remaining runs of methods and time to the next counter nulling in seconds.
 *
 * @property accountId Advertising account ID.
 */
class AdsGetFloodStatsMethod(
    accountId: Long
) : VkMethod<FloodStats>(
    "ads.getFloodStats",
    mutableMapOf(),
    successReference()
), UserMethod {

    var accountId: Long by props

    init {
        this.accountId = accountId
    }
}
