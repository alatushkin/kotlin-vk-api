package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.Lang
import name.alatushkin.api.vk.generated.ads.TargSuggestions

/**
 *  Returns a set of auto-suggestions for various targeting parameters.
 *
 *  [https://vk.com/dev/ads.getSuggestions]
 *  @property [ids] Objects IDs separated by commas. If the parameter is passed, 'q, country, cities' should not be passed.
 *  @property [lang] Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
class AdsGetSuggestionsMethodDecodeUserDevices() : VkMethod<Array<TargSuggestions>>(
    "ads.getSuggestions",
    mutableMapOf("section" to "user_devices")
) {

    var ids: String? by props
    var lang: Lang? by props

    constructor(
        ids: String? = null,
        lang: Lang? = null
    ) : this() {
        this.ids = ids
        this.lang = lang
    }

    fun setIds(ids: String): AdsGetSuggestionsMethodDecodeUserDevices {
        this.ids = ids
        return this
    }

    fun setLang(lang: Lang): AdsGetSuggestionsMethodDecodeUserDevices {
        this.lang = lang
        return this
    }

    override val classRef = AdsGetSuggestionsMethodDecodeUserDevices.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<TargSuggestions>>>() {}
    }
}
