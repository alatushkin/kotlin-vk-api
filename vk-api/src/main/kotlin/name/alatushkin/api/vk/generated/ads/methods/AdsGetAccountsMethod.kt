@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.ads.Account
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getAccounts]
 *
 * Returns a list of advertising accounts.
 *

 */
class AdsGetAccountsMethod : VkMethod<Array<Account>>(
    "ads.getAccounts",
    mutableMapOf(),
    successReference()
), UserMethod
