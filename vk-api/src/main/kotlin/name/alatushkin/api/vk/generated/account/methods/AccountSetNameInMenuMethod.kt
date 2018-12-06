@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.setNameInMenu]
 *
 * Sets an application screen name (up to 17 characters), that is shown to the user in the left menu.
 *
 * @property userId User ID.
 * @property name Application screen name.
 */
class AccountSetNameInMenuMethod(
    userId: Long,
    name: String? = null
) : VkMethod<Boolean>(
    "account.setNameInMenu",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long by props
    var name: String? by props

    init {
        this.userId = userId
        this.name = name
    }
}
