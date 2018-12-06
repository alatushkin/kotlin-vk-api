@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.save]
 *
 * Saves the text of a wiki page.
 *
 * @property text Text of the wiki page in wiki-format.
 * @property pageId Wiki page ID. The 'title' parameter can be passed instead of 'pid'.
 * @property groupId ID of the community that owns the wiki page.
 * @property userId User ID
 * @property title Wiki page title.
 */
class PagesSaveMethod(
    text: String? = null,
    pageId: Long? = null,
    groupId: Long? = null,
    userId: Long? = null,
    title: String? = null
) : VkMethod<Long>(
    "pages.save",
    mutableMapOf(),
    successReference()
), UserMethod {

    var text: String? by props
    var pageId: Long? by props
    var groupId: Long? by props
    var userId: Long? by props
    var title: String? by props

    init {
        this.text = text
        this.pageId = pageId
        this.groupId = groupId
        this.userId = userId
        this.title = title
    }
}
