@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.ads.GetUploadURLAdFormat
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getUploadURL]
 *
 * Returns URL to upload an ad photo to.
 *
 * @property adFormat Ad format: *1 — image and text,, *2 — big image,, *3 — exclusive format,, *4 — community, square image,, *7 — special app format.
 */
class AdsGetUploadURLMethod(
    adFormat: GetUploadURLAdFormat
) : VkMethod<String>(
    "ads.getUploadURL",
    mutableMapOf(),
    successReference()
), UserMethod {

    var adFormat: GetUploadURLAdFormat by props

    init {
        this.adFormat = adFormat
    }
}
