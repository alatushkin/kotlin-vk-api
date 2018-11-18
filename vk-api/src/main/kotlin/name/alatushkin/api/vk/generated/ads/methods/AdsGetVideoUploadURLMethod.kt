package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Returns URL to upload an ad video to.
 *
 *  [https://vk.com/dev/ads.getVideoUploadURL]

 */
class AdsGetVideoUploadURLMethod : VkMethod<String>(
    "ads.getVideoUploadURL",
    HashMap()
) {
    override val classRef = AdsGetVideoUploadURLMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<String>>() {}
    }
}
