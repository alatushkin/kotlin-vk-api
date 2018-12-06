@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.addLink]
 *
 * Adds a link to user faves.
 *
 * @property link Link URL.
 * @property text Description text.
 */
class FaveAddLinkMethod(
    link: String,
    text: String? = null
) : VkMethod<Boolean>(
    "fave.addLink",
    mutableMapOf(),
    successReference()
), UserMethod {

    var link: String by props
    var text: String? by props

    init {
        this.link = link
        this.text = text
    }
}
