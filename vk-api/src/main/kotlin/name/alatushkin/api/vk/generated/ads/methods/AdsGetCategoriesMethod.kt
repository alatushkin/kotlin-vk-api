package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.GetCategoriesResponse

/**
 *  Returns a list of possible ad categories.
 *
 *  [https://vk.com/dev/ads.getCategories]
 *  @property [lang] Language. The full list of supported languages is [vk.com/dev/api_requests|here].
 */
class AdsGetCategoriesMethod() : VkMethod<GetCategoriesResponse>(
    "ads.getCategories",
    HashMap()
) {

    var lang: String? by props

    constructor(
        lang: String? = null
    ) : this() {
        this.lang = lang
    }

    fun setLang(lang: String): AdsGetCategoriesMethod {
        this.lang = lang
        return this
    }

    override val classRef = AdsGetCategoriesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<GetCategoriesResponse>>() {}
    }
}
