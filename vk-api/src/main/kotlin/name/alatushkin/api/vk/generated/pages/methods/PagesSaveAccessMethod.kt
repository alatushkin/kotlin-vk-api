@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.AccessLevel
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.saveAccess]
 *
 * Saves modified read and edit access settings for a wiki page.
 *
 * @property pageId Wiki page ID.
 * @property groupId ID of the community that owns the wiki page.
 * @property userId 
 * @property view Who can view the wiki page: '1' — only community members, '2' — all users can view the page, '0' — only community managers
 * @property edit Who can edit the wiki page: '1' — only community members, '2' — all users can edit the page, '0' — only community managers
 */
class PagesSaveAccessMethod(
    pageId: Long,
    groupId: Long? = null,
    userId: Long? = null,
    view: AccessLevel? = null,
    edit: AccessLevel? = null
) : VkMethod<Long>(
    "pages.saveAccess",
    mutableMapOf(),
    successReference()
), UserMethod {

    var pageId: Long by props
    var groupId: Long? by props
    var userId: Long? by props
    var view: AccessLevel? by props
    var edit: AccessLevel? by props

    init {
        this.pageId = pageId
        this.groupId = groupId
        this.userId = userId
        this.view = view
        this.edit = edit
    }
}
