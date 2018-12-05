@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var link: String by props
    var text: String? by props

    init {
        this.link = link
        this.text = text
    }

    fun setLink(link: String): FaveAddLinkMethod {
        this.link = link
        return this
    }

    fun setText(text: String): FaveAddLinkMethod {
        this.text = text
        return this
    }
}
