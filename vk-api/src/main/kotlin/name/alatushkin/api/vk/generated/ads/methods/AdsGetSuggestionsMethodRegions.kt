package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.Lang
import name.alatushkin.api.vk.generated.ads.TargSuggestionsRegions

/**
 *  Returns a set of auto-suggestions for various targeting parameters.
 *
 *  [https://vk.com/dev/ads.getSuggestions]
 *  @property [q] Filter-line of the request (for countries, regions, cities, streets, schools, interests, positions).
 *  @property [country] ID of the country objects are searched in.
 *  @property [lang] Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
class AdsGetSuggestionsMethodRegions() : VkMethod<Array<TargSuggestionsRegions>>(
    "ads.getSuggestions",
    mutableMapOf("section" to "regions")
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

    override val classRef = AdsGetSuggestionsMethodRegions.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<TargSuggestionsRegions>>>() {}
    }
}
