package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.utils.LinkChecked

/**
 *  Checks whether a link is blocked in VK.
 *
 *  [https://vk.com/dev/utils.checkLink]
 *  @property [url] Link to check (e.g., 'http://google.com').
 */
class UtilsCheckLinkMethod() : VkMethod<LinkChecked>(
    "utils.checkLink",
    HashMap()
) {

    var url: String? by props

    constructor(
        url: String? = null
    ) : this() {
        this.url = url
    }

    fun setUrl(url: String): UtilsCheckLinkMethod {
        this.url = url
        return this
    }

    override val classRef = UtilsCheckLinkMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<LinkChecked>>() {}
    }
}
