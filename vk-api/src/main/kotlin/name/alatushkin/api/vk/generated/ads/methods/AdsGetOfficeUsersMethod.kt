@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.ads.Users
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getOfficeUsers]
 *
 * Returns a list of managers and supervisors of advertising account.
 *
 * @property accountId Advertising account ID.
 */
class AdsGetOfficeUsersMethod(
    accountId: Long
) : VkMethod<Array<Users>>(
    "ads.getOfficeUsers",
    mutableMapOf(),
    successReference()
), UserMethod {

    var accountId: Long by props

    init {
        this.accountId = accountId
    }
}
