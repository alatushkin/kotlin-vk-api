@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.Lang
import name.alatushkin.api.vk.generated.ads.TargSuggestionsRegions
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getSuggestions]
 *
 * Returns a set of auto-suggestions for various targeting parameters.
 *
 * @property q Filter-line of the request (for countries, regions, cities, streets, schools, interests, positions).
 * @property country ID of the country objects are searched in.
 * @property lang Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
class AdsGetSuggestionsMethodRegions(
        q: String? = null,
        country: Long? = null,
        lang: Lang? = null
) : VkMethod<Array<TargSuggestionsRegions>>(
    "ads.getSuggestions",
    mutableMapOf("section" to "regions"),
    object : TypeReference<VkResponse<Array<TargSuggestionsRegions>>>() {}
), UserMethod {

    var q: String? by props
    var country: Long? by props
    var lang: Lang? by props

    init {
        this.q = q
        this.country = country
        this.lang = lang
    }

    fun setQ(q: String): AdsGetSuggestionsMethodRegions {
        this.q = q
        return this
    }

    fun setCountry(country: Long): AdsGetSuggestionsMethodRegions {
        this.country = country
        return this
    }

    fun setLang(lang: Lang): AdsGetSuggestionsMethodRegions {
        this.lang = lang
        return this
    }
}
