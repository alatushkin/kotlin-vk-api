@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.widgets.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.widgets.GetPagesResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/widgets.getPages]
 *
 * Gets a list of application/site pages where the [vk.com/dev/Comments|Comments widget] or [vk.com/dev/Like|Like widget] is installed.
 *
 * @property widgetApiId 
 * @property order 
 * @property period 
 * @property count 
 */
class WidgetsGetPagesMethod(
    widgetApiId: Long? = null,
    order: String? = null,
    period: String? = null,
    count: Long? = null
) : VkMethod<GetPagesResponse>(
    "widgets.getPages",
    mutableMapOf(),
    successReference()
), UserServiceMethod {

    var widgetApiId: Long? by props
    var order: String? by props
    var period: String? by props
    var count: Long? by props

    init {
        this.widgetApiId = widgetApiId
        this.order = order
        this.period = period
        this.count = count
    }
}
