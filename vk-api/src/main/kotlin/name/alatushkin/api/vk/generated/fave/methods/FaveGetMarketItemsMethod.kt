@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.market.MarketItem
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.getMarketItems]
 *
 * Returns market items bookmarked by current user.
 *
 * @property count Number of results to return.
 * @property extended '1' – to return additional fields 'likes, can_comment, can_repost, photos'. By default: '0'.
 */
class FaveGetMarketItemsMethod(
    count: Long? = null,
    extended: Boolean? = null
) : VkMethod<VkList<MarketItem>>(
    "fave.getMarketItems",
    mutableMapOf(),
    successReference()
), UserMethod {

    var count: Long? by props
    var extended: Boolean? by props

    init {
        this.count = count
        this.extended = extended
    }
}
