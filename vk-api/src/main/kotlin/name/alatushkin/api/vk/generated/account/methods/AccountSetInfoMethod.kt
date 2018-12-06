@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.setInfo]
 *
 * Allows to edit the current account info.
 *
 * @property name Setting name.
 * @property value Setting value.
 */
class AccountSetInfoMethod(
    name: String? = null,
    value: String? = null
) : VkMethod<Boolean>(
    "account.setInfo",
    mutableMapOf(),
    successReference()
), UserMethod {

    var name: String? by props
    var value: String? by props

    init {
        this.name = name
        this.value = value
    }
}
