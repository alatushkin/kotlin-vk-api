package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.Lang
import name.alatushkin.api.vk.generated.ads.TargSuggestionsCities

/**
 *  Returns a set of auto-suggestions for various targeting parameters.
 *
 *  [https://vk.com/dev/ads.getSuggestions]
 *  @property [q] Filter-line of the request (for countries, regions, cities, streets, schools, interests, positions).
 *  @property [country] ID of the country objects are searched in.
 *  @property [lang] Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
class AdsGetSuggestionsMethodCities() : VkMethod<Array<TargSuggestionsCities>>(
    "ads.getSuggestions",
    mutableMapOf("section" to "cities")
) {

    var q: String? by props
    var country: Long? by props
    var lang: Lang? by props

    constructor(
        q: String? = null,
        country: Long? = null,
        lang: Lang? = null
    ) : this() {
        this.q = q
        this.country = country
        this.lang = lang
    }

    fun setQ(q: String): AdsGetSuggestionsMethodCities {
        this.q = q
        return this
    }

    fun setCountry(country: Long): AdsGetSuggestionsMethodCities {
        this.country = country
        return this
    }

    fun setLang(lang: Lang): AdsGetSuggestionsMethodCities {
        this.lang = lang
        return this
    }

    override val classRef = AdsGetSuggestionsMethodCities.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<TargSuggestionsCities>>>() {}
    }
}
