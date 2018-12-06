@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.account.UserSettings
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.getProfileInfo]
 *
 * Returns the current account info.
 *

 */
class AccountGetProfileInfoMethod : VkMethod<UserSettings>(
    "account.getProfileInfo",
    mutableMapOf(),
    successReference()
), UserMethod
