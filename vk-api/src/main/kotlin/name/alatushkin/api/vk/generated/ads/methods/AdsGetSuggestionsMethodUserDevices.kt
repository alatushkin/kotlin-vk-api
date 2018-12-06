@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.ads.Lang
import name.alatushkin.api.vk.generated.ads.TargSuggestions
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getSuggestions]
 *
 * Returns a set of auto-suggestions for various targeting parameters.
 *
 * @property q Filter-line of the request (for countries, regions, cities, streets, schools, interests, positions).
 * @property lang Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
class AdsGetSuggestionsMethodUserDevices(
    q: String? = null,
    lang: Lang? = null
) : VkMethod<Array<TargSuggestions>>(
    "ads.getSuggestions",
    mutableMapOf("section" to "user_devices"),
    successReference()
), UserMethod {

    var q: String? by props
    var lang: Lang? by props

    init {
        this.q = q
        this.lang = lang
    }
}
