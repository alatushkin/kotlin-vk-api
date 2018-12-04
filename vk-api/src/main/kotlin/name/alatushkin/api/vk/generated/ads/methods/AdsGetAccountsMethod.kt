@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.Account
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
    object : TypeReference<VkSuccess<Array<Account>>>() {}
), UserMethod
