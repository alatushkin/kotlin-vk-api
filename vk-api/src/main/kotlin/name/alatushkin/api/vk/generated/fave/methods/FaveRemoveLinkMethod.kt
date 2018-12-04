@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.removeLink]
 *
 * Removes link from the user's faves.
 *
 * @property linkId Link ID (can be obtained by [vk.com/dev/faves.getLinks|faves.getLinks] method).
 */
class FaveRemoveLinkMethod(
        linkId: String
) : VkMethod<Boolean>(
    "fave.removeLink",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var linkId: String by props

    init {
        this.linkId = linkId
    }

    fun setLinkId(linkId: String): FaveRemoveLinkMethod {
        this.linkId = linkId
        return this
    }
}
