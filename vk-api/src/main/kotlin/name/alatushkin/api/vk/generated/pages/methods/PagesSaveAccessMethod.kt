package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.AccessLevel

/**
 *  Saves modified read and edit access settings for a wiki page.
 *
 *  [https://vk.com/dev/pages.saveAccess]
 *  @property [page_id] Wiki page ID.
 *  @property [group_id] ID of the community that owns the wiki page.
 *  @property [user_id] 
 *  @property [view] Who can view the wiki page: '1' — only community members, '2' — all users can view the page, '0' — only community managers
 *  @property [edit] Who can edit the wiki page: '1' — only community members, '2' — all users can edit the page, '0' — only community managers
 */
class PagesSaveAccessMethod() : VkMethod<Long>(
    "pages.saveAccess",
    HashMap()
) {

    var pageId: Long? by props
    var groupId: Long? by props
    var userId: Long? by props
    var view: AccessLevel? by props
    var edit: AccessLevel? by props

    constructor(
        pageId: Long? = null,
        groupId: Long? = null,
        userId: Long? = null,
        view: AccessLevel? = null,
        edit: AccessLevel? = null
    ) : this() {
        this.pageId = pageId
        this.groupId = groupId
        this.userId = userId
        this.view = view
        this.edit = edit
    }

    fun setPageId(pageId: Long): PagesSaveAccessMethod {
        this.pageId = pageId
        return this
    }

    fun setGroupId(groupId: Long): PagesSaveAccessMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): PagesSaveAccessMethod {
        this.userId = userId
        return this
    }

    fun setView(view: AccessLevel): PagesSaveAccessMethod {
        this.view = view
        return this
    }

    fun setEdit(edit: AccessLevel): PagesSaveAccessMethod {
        this.edit = edit
        return this
    }

    override val classRef = PagesSaveAccessMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Long>>() {}
    }
}
