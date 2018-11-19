package name.alatushkin.api.vk.generated.widgets.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.widgets.GetPagesResponse

/**
 *  Gets a list of application/site pages where the [vk.com/dev/Comments|Comments widget] or [vk.com/dev/Like|Like widget] is installed.
 *
 *  [https://vk.com/dev/widgets.getPages]
 *  @property [widget_api_id]
 *  @property [order]
 *  @property [period]
 *  @property [count]
 */
class WidgetsGetPagesMethod() : VkMethod<GetPagesResponse>(
    "widgets.getPages",
    HashMap()
) {

    var widgetApiId: Long? by props
    var order: String? by props
    var period: String? by props
    var count: Long? by props

    constructor(
        widgetApiId: Long? = null,
        order: String? = null,
        period: String? = null,
        count: Long? = null
    ) : this() {
        this.widgetApiId = widgetApiId
        this.order = order
        this.period = period
        this.count = count
    }

    fun setWidgetApiId(widgetApiId: Long): WidgetsGetPagesMethod {
        this.widgetApiId = widgetApiId
        return this
    }

    fun setOrder(order: String): WidgetsGetPagesMethod {
        this.order = order
        return this
    }

    fun setPeriod(period: String): WidgetsGetPagesMethod {
        this.period = period
        return this
    }

    fun setCount(count: Long): WidgetsGetPagesMethod {
        this.count = count
        return this
    }

    override val classRef = WidgetsGetPagesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GetPagesResponse>>() {}
    }
}
