@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.account.UserSettings
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
    object : TypeReference<VkResponse<UserSettings>>() {}
), UserMethod
