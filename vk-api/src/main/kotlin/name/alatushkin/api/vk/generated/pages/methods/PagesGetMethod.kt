package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.pages.WikipageFull

/**
 *  Returns information about a wiki page.
 *
 *  [https://vk.com/dev/pages.get]
 *  @property [owner_id] Page owner ID.
 *  @property [page_id] Wiki page ID.
 *  @property [global] '1' — to return information about a global wiki page
 *  @property [site_preview] '1' — resulting wiki page is a preview for the attached link
 *  @property [title] Wiki page title.
 *  @property [need_source]
 *  @property [need_html] '1' — to return the page as HTML,
 */
class PagesGetMethod() : VkMethod<WikipageFull>(
    "pages.get",
    HashMap()
) {

    var ownerId: Long? by props
    var pageId: Long? by props
    var global: Boolean? by props
    var sitePreview: Boolean? by props
    var title: String? by props
    var needSource: Boolean? by props
    var needHtml: Boolean? by props

    constructor(
        ownerId: Long? = null,
        pageId: Long? = null,
        global: Boolean? = null,
        sitePreview: Boolean? = null,
        title: String? = null,
        needSource: Boolean? = null,
        needHtml: Boolean? = null
    ) : this() {
        this.ownerId = ownerId
        this.pageId = pageId
        this.global = global
        this.sitePreview = sitePreview
        this.title = title
        this.needSource = needSource
        this.needHtml = needHtml
    }

    fun setOwnerId(ownerId: Long): PagesGetMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPageId(pageId: Long): PagesGetMethod {
        this.pageId = pageId
        return this
    }

    fun setGlobal(global: Boolean): PagesGetMethod {
        this.global = global
        return this
    }

    fun setSitePreview(sitePreview: Boolean): PagesGetMethod {
        this.sitePreview = sitePreview
        return this
    }

    fun setTitle(title: String): PagesGetMethod {
        this.title = title
        return this
    }

    fun setNeedSource(needSource: Boolean): PagesGetMethod {
        this.needSource = needSource
        return this
    }

    fun setNeedHtml(needHtml: Boolean): PagesGetMethod {
        this.needHtml = needHtml
        return this
    }

    override val classRef = PagesGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<WikipageFull>>() {}
    }
}
