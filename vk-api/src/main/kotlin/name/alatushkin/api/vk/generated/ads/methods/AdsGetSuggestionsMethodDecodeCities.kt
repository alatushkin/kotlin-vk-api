@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.ads.Lang
import name.alatushkin.api.vk.generated.ads.TargSuggestionsCities
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getSuggestions]
 *
 * Returns a set of auto-suggestions for various targeting parameters.
 *
 * @property ids Objects IDs separated by commas. If the parameter is passed, 'q, country, cities' should not be passed.
 * @property lang Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
class AdsGetSuggestionsMethodDecodeCities(
    ids: String? = null,
    lang: Lang? = null
) : VkMethod<Array<TargSuggestionsCities>>(
    "ads.getSuggestions",
    mutableMapOf("section" to "cities"),
    successReference()
), UserMethod {

    var ids: String? by props
    var lang: Lang? by props

    init {
        this.ids = ids
        this.lang = lang
    }
}
