@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.pages.WikipageFull
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.getVersion]
 *
 * Returns the text of one of the previous versions of a wiki page.
 *
 * @property versionId 
 * @property groupId ID of the community that owns the wiki page.
 * @property userId 
 * @property needHtml '1' — to return the page as HTML
 */
class PagesGetVersionMethod(
    versionId: Long,
    groupId: Long? = null,
    userId: Long? = null,
    needHtml: Boolean? = null
) : VkMethod<WikipageFull>(
    "pages.getVersion",
    mutableMapOf(),
    successReference()
), UserMethod {

    var versionId: Long by props
    var groupId: Long? by props
    var userId: Long? by props
    var needHtml: Boolean? by props

    init {
        this.versionId = versionId
        this.groupId = groupId
        this.userId = userId
        this.needHtml = needHtml
    }
}
