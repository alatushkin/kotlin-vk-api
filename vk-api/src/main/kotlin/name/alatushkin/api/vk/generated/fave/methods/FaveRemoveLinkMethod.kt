@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var linkId: String by props

    init {
        this.linkId = linkId
    }
}
