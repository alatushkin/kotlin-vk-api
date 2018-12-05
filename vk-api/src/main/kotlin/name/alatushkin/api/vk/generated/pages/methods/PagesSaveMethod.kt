@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
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
    object : TypeReference<VkResponse<Long>>() {}
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

    fun setText(text: String): PagesSaveMethod {
        this.text = text
        return this
    }

    fun setPageId(pageId: Long): PagesSaveMethod {
        this.pageId = pageId
        return this
    }

    fun setGroupId(groupId: Long): PagesSaveMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): PagesSaveMethod {
        this.userId = userId
        return this
    }

    fun setTitle(title: String): PagesSaveMethod {
        this.title = title
        return this
    }
}
