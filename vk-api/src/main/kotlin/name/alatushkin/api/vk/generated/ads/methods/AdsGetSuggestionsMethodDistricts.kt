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
 *  @property [cities] IDs of cities where objects are searched in, separated with a comma.
 *  @property [lang] Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
class AdsGetSuggestionsMethodDistricts() : VkMethod<Array<TargSuggestionsCities>>(
    "ads.getSuggestions",
    mutableMapOf("section" to "districts")
) {

    var q: String? by props
    var cities: String? by props
    var lang: Lang? by props

    constructor(
        q: String? = null,
        cities: String? = null,
        lang: Lang? = null
    ) : this() {
        this.q = q
        this.cities = cities
        this.lang = lang
    }

    fun setQ(q: String): AdsGetSuggestionsMethodDistricts {
        this.q = q
        return this
    }

    fun setCities(cities: String): AdsGetSuggestionsMethodDistricts {
        this.cities = cities
        return this
    }

    fun setLang(lang: Lang): AdsGetSuggestionsMethodDistricts {
        this.lang = lang
        return this
    }

    override val classRef = AdsGetSuggestionsMethodDistricts.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<TargSuggestionsCities>>>() {}
    }
}
