@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.getAppBalance]
 *
 * Returns payment balance of the application in hundredth of a vote.
 *

 */
class SecureGetAppBalanceMethod : VkMethod<Long>(
    "secure.getAppBalance",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Long>>() {}
), ServiceMethod
