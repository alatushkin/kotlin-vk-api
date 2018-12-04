package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Saves the text of a wiki page.
 *
 *  [https://vk.com/dev/pages.save]
 *  @property [text] Text of the wiki page in wiki-format.
 *  @property [page_id] Wiki page ID. The 'title' parameter can be passed instead of 'pid'.
 *  @property [group_id] ID of the community that owns the wiki page.
 *  @property [user_id] User ID
 *  @property [title] Wiki page title.
 */
class PagesSaveMethod() : VkMethod<Long>(
    "pages.save",
    HashMap()
) {

    var text: String? by props
    var pageId: Long? by props
    var groupId: Long? by props
    var userId: Long? by props
    var title: String? by props

    constructor(
        text: String? = null,
        pageId: Long? = null,
        groupId: Long? = null,
        userId: Long? = null,
        title: String? = null
    ) : this() {
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

    override val classRef = PagesSaveMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Long>>() {}
    }
}
