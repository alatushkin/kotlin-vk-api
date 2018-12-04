package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.utils.ShortLink

/**
 *  Allows to receive a link shortened via vk.cc.
 *
 *  [https://vk.com/dev/utils.getShortLink]
 *  @property [url] URL to be shortened.
 *  @property [private] 1 — private stats, 0 — public stats.
 */
class UtilsGetShortLinkMethod() : VkMethod<ShortLink>(
    "utils.getShortLink",
    HashMap()
) {

    var url: String? by props
    var private: Boolean? by props

    constructor(
        url: String? = null,
        private: Boolean? = null
    ) : this() {
        this.url = url
        this.private = private
    }

    fun setUrl(url: String): UtilsGetShortLinkMethod {
        this.url = url
        return this
    }

    fun setPrivate(private: Boolean): UtilsGetShortLinkMethod {
        this.private = private
        return this
    }

    override val classRef = UtilsGetShortLinkMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<ShortLink>>() {}
    }
}
