@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.pages.WikipageVersion
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
    object : TypeReference<VkResponse<Array<WikipageVersion>>>() {}
), UserMethod {

    var pageId: Long by props
    var groupId: Long? by props
    var userId: Long? by props

    init {
        this.pageId = pageId
        this.groupId = groupId
        this.userId = userId
    }

    fun setPageId(pageId: Long): PagesGetHistoryMethod {
        this.pageId = pageId
        return this
    }

    fun setGroupId(groupId: Long): PagesGetHistoryMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): PagesGetHistoryMethod {
        this.userId = userId
        return this
    }
}
