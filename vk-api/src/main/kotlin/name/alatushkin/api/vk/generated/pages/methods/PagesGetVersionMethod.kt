package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.pages.WikipageFull

/**
 *  Returns the text of one of the previous versions of a wiki page.
 *
 *  [https://vk.com/dev/pages.getVersion]
 *  @property [version_id]
 *  @property [group_id] ID of the community that owns the wiki page.
 *  @property [user_id]
 *  @property [need_html] '1' — to return the page as HTML
 */
class PagesGetVersionMethod() : VkMethod<WikipageFull>(
    "pages.getVersion",
    HashMap()
) {

    var versionId: Long? by props
    var groupId: Long? by props
    var userId: Long? by props
    var needHtml: Boolean? by props

    constructor(
        versionId: Long? = null,
        groupId: Long? = null,
        userId: Long? = null,
        needHtml: Boolean? = null
    ) : this() {
        this.versionId = versionId
        this.groupId = groupId
        this.userId = userId
        this.needHtml = needHtml
    }

    fun setVersionId(versionId: Long): PagesGetVersionMethod {
        this.versionId = versionId
        return this
    }

    fun setGroupId(groupId: Long): PagesGetVersionMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): PagesGetVersionMethod {
        this.userId = userId
        return this
    }

    fun setNeedHtml(needHtml: Boolean): PagesGetVersionMethod {
        this.needHtml = needHtml
        return this
    }

    override val classRef = PagesGetVersionMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<WikipageFull>>() {}
    }
}
