@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.widgets.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.widgets.GetCommentsResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/widgets.getComments]
 *
 * Gets a list of comments for the page added through the [vk.com/dev/Comments|Comments widget].
 *
 * @property widgetApiId 
 * @property url 
 * @property pageId 
 * @property order 
 * @property fields 
 * @property count 
 */
class WidgetsGetCommentsMethod(
    widgetApiId: Long? = null,
    url: String? = null,
    pageId: String? = null,
    order: String? = null,
    fields: Array<String>? = null,
    count: Long? = null
) : VkMethod<GetCommentsResponse>(
    "widgets.getComments",
    mutableMapOf(),
    successReference()
), UserServiceMethod {

    var widgetApiId: Long? by props
    var url: String? by props
    var pageId: String? by props
    var order: String? by props
    var fields: Array<String>? by props
    var count: Long? by props

    init {
        this.widgetApiId = widgetApiId
        this.url = url
        this.pageId = pageId
        this.order = order
        this.fields = fields
        this.count = count
    }
}
