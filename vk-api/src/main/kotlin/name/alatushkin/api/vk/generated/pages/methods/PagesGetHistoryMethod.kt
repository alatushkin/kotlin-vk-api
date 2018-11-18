package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.pages.WikipageVersion

/**
 *  Returns a list of all previous versions of a wiki page.
 *
 *  [https://vk.com/dev/pages.getHistory]
 *  @property [page_id] Wiki page ID.
 *  @property [group_id] ID of the community that owns the wiki page.
 *  @property [user_id]
 */
class PagesGetHistoryMethod() : VkMethod<Array<WikipageVersion>>(
    "pages.getHistory",
    HashMap()
) {

    var pageId: Long? by props
    var groupId: Long? by props
    var userId: Long? by props

    constructor(
        pageId: Long? = null,
        groupId: Long? = null,
        userId: Long? = null
    ) : this() {
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

    override val classRef = PagesGetHistoryMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<WikipageVersion>>>() {}
    }
}
