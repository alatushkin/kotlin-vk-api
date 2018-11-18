package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.ads.GetUploadURLAdFormat

/**
 *  Returns URL to upload an ad photo to.
 *
 *  [https://vk.com/dev/ads.getUploadURL]
 *  @property [ad_format] Ad format: *1 — image and text,, *2 — big image,, *3 — exclusive format,, *4 — community, square image,, *7 — special app format.
 */
class AdsGetUploadURLMethod() : VkMethod<String>(
    "ads.getUploadURL",
    HashMap()
) {

    var adFormat: GetUploadURLAdFormat? by props

    constructor(
        adFormat: GetUploadURLAdFormat? = null
    ) : this() {
        this.adFormat = adFormat
    }

    fun setAdFormat(adFormat: GetUploadURLAdFormat): AdsGetUploadURLMethod {
        this.adFormat = adFormat
        return this
    }

    override val classRef = AdsGetUploadURLMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<String>>() {}
    }
}
