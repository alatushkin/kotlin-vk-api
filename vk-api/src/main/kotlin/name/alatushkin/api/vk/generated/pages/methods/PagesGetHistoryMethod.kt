@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.pages.WikipageVersion
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.getHistory]
 *
 * Returns a list of all previous versions of a wiki page.
 *
 * @property pageId Wiki page ID.
 * @property groupId ID of the community that owns the wiki page.
 * @property userId 
 */
class PagesGetHistoryMethod(
    pageId: Long,
    groupId: Long? = null,
    userId: Long? = null
) : VkMethod<Array<WikipageVersion>>(
    "pages.getHistory",
    mutableMapOf(),
    successReference()
), UserMethod {

    var pageId: Long by props
    var groupId: Long? by props
    var userId: Long? by props

    init {
        this.pageId = pageId
        this.groupId = groupId
        this.userId = userId
    }
}
