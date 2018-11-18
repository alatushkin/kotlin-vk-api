package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Allows to clear the cache of particular 'external' pages which may be attached to VK posts.
 *
 *  [https://vk.com/dev/pages.clearCache]
 *  @property [url] Address of the page where you need to refesh the cached version
 */
class PagesClearCacheMethod() : VkMethod<Boolean>(
    "pages.clearCache",
    HashMap()
) {

    var url: String? by props

    constructor(
        url: String? = null
    ) : this() {
        this.url = url
    }

    fun setUrl(url: String): PagesClearCacheMethod {
        this.url = url
        return this
    }

    override val classRef = PagesClearCacheMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
