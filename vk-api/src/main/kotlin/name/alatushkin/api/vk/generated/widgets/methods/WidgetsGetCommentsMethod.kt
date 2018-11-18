package name.alatushkin.api.vk.generated.widgets.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.widgets.GetCommentsResponse

/**
 *  Gets a list of comments for the page added through the [vk.com/dev/Comments|Comments widget].
 *
 *  [https://vk.com/dev/widgets.getComments]
 *  @property [widget_api_id] null
 *  @property [url] null
 *  @property [page_id] null
 *  @property [order] null
 *  @property [fields] null
 *  @property [count] null
 */
class WidgetsGetCommentsMethod() : VkMethod<GetCommentsResponse>(
    "widgets.getComments",
    HashMap()
) {

    var widgetApiId: Long? by props
    var url: String? by props
    var pageId: String? by props
    var order: String? by props
    var fields: Array<String>? by props
    var count: Long? by props

    constructor(
        widgetApiId: Long? = null,
        url: String? = null,
        pageId: String? = null,
        order: String? = null,
        fields: Array<String>? = null,
        count: Long? = null
    ) : this() {
        this.widgetApiId = widgetApiId
        this.url = url
        this.pageId = pageId
        this.order = order
        this.fields = fields
        this.count = count
    }

    fun setWidgetApiId(widgetApiId: Long): WidgetsGetCommentsMethod {
        this.widgetApiId = widgetApiId
        return this
    }

    fun setUrl(url: String): WidgetsGetCommentsMethod {
        this.url = url
        return this
    }

    fun setPageId(pageId: String): WidgetsGetCommentsMethod {
        this.pageId = pageId
        return this
    }

    fun setOrder(order: String): WidgetsGetCommentsMethod {
        this.order = order
        return this
    }

    fun setFields(fields: Array<String>): WidgetsGetCommentsMethod {
        this.fields = fields
        return this
    }

    fun setCount(count: Long): WidgetsGetCommentsMethod {
        this.count = count
        return this
    }

    override val classRef = WidgetsGetCommentsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GetCommentsResponse>>() {}
    }
}
