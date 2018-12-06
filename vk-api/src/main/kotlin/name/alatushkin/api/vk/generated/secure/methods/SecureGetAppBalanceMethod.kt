@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), ServiceMethod
