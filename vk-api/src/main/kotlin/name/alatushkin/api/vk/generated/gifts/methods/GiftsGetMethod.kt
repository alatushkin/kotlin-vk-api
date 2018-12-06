@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.gifts.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.gifts.Gift
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/gifts.get]
 *
 * Returns a list of user gifts.
 *
 * @property userId User ID.
 * @property count Number of gifts to return.
 * @property offset Offset needed to return a specific subset of results.
 */
class GiftsGetMethod(
    userId: Long? = null,
    count: Long? = null,
    offset: Long? = null
) : VkMethod<VkList<Gift>>(
    "gifts.get",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long? by props
    var count: Long? by props
    var offset: Long? by props

    init {
        this.userId = userId
        this.count = count
        this.offset = offset
    }
}
