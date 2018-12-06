@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.setOffline]
 *
 * Marks a current user as offline.
 *

 */
class AccountSetOfflineMethod : VkMethod<Boolean>(
    "account.setOffline",
    mutableMapOf(),
    successReference()
), UserMethod
