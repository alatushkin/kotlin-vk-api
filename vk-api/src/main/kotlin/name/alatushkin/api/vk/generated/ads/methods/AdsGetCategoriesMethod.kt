@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.GetCategoriesResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getCategories]
 *
 * Returns a list of possible ad categories.
 *
 * @property lang Language. The full list of supported languages is [vk.com/dev/api_requests|here].
 */
class AdsGetCategoriesMethod(
        lang: String? = null
) : VkMethod<GetCategoriesResponse>(
    "ads.getCategories",
    mutableMapOf(),
    object : TypeReference<VkSuccess<GetCategoriesResponse>>() {}
), UserMethod {

    var lang: String? by props

    init {
        this.lang = lang
    }

    fun setLang(lang: String): AdsGetCategoriesMethod {
        this.lang = lang
        return this
    }
}
