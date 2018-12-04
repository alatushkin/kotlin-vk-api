@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.Lang
import name.alatushkin.api.vk.generated.ads.TargSuggestionsCities
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getSuggestions]
 *
 * Returns a set of auto-suggestions for various targeting parameters.
 *
 * @property ids Objects IDs separated by commas. If the parameter is passed, 'q, country, cities' should not be passed.
 * @property lang Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
class AdsGetSuggestionsMethodDecodeDistricts(
        ids: String? = null,
        lang: Lang? = null
) : VkMethod<Array<TargSuggestionsCities>>(
    "ads.getSuggestions",
    mutableMapOf("section" to "districts"),
    object : TypeReference<VkSuccess<Array<TargSuggestionsCities>>>() {}
), UserMethod {

    var ids: String? by props
    var lang: Lang? by props

    init {
        this.ids = ids
        this.lang = lang
    }

    fun setIds(ids: String): AdsGetSuggestionsMethodDecodeDistricts {
        this.ids = ids
        return this
    }

    fun setLang(lang: Lang): AdsGetSuggestionsMethodDecodeDistricts {
        this.lang = lang
        return this
    }
}
