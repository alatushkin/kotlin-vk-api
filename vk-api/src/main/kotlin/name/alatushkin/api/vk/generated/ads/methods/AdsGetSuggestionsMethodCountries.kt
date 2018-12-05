@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.Lang
import name.alatushkin.api.vk.generated.ads.TargSuggestions
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getSuggestions]
 *
 * Returns a set of auto-suggestions for various targeting parameters.
 *
 * @property q Filter-line of the request (for countries, regions, cities, streets, schools, interests, positions).
 * @property lang Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
class AdsGetSuggestionsMethodCountries(
        q: String? = null,
        lang: Lang? = null
) : VkMethod<Array<TargSuggestions>>(
    "ads.getSuggestions",
    mutableMapOf("section" to "countries"),
    object : TypeReference<VkResponse<Array<TargSuggestions>>>() {}
), UserMethod {

    var q: String? by props
    var lang: Lang? by props

    init {
        this.q = q
        this.lang = lang
    }

    fun setQ(q: String): AdsGetSuggestionsMethodCountries {
        this.q = q
        return this
    }

    fun setLang(lang: Lang): AdsGetSuggestionsMethodCountries {
        this.lang = lang
        return this
    }
}
