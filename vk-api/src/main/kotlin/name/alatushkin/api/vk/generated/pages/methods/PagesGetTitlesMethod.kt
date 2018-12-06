@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.pages.Wikipage
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.getTitles]
 *
 * Returns a list of wiki pages in a group.
 *
 * @property groupId ID of the community that owns the wiki page.
 */
class PagesGetTitlesMethod(
    groupId: Long? = null
) : VkMethod<Array<Wikipage>>(
    "pages.getTitles",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long? by props

    init {
        this.groupId = groupId
    }
}
