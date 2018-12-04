package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.ads.Lang
import name.alatushkin.api.vk.generated.ads.TargSuggestions

/**
 *  Returns a set of auto-suggestions for various targeting parameters.
 *
 *  [https://vk.com/dev/ads.getSuggestions]
 *  @property [q] Filter-line of the request (for countries, regions, cities, streets, schools, interests, positions).
 *  @property [lang] Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
class AdsGetSuggestionsMethodPositions() : VkMethod<Array<TargSuggestions>>(
    "ads.getSuggestions",
    mutableMapOf("section" to "positions")
) {

    var q: String? by props
    var lang: Lang? by props

    constructor(
        q: String? = null,
        lang: Lang? = null
    ) : this() {
        this.q = q
        this.lang = lang
    }

    fun setQ(q: String): AdsGetSuggestionsMethodPositions {
        this.q = q
        return this
    }

    fun setLang(lang: Lang): AdsGetSuggestionsMethodPositions {
        this.lang = lang
        return this
    }

    override val classRef = AdsGetSuggestionsMethodPositions.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<TargSuggestions>>>() {}
    }
}
