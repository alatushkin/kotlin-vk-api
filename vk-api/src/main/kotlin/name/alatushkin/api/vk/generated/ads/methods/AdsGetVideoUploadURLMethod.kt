@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 * [https://vk.com/dev/ads.getVideoUploadURL]
 *
 * Returns URL to upload an ad video to.
 *

 */
class AdsGetVideoUploadURLMethod : VkMethod<String>(
    "ads.getVideoUploadURL",
    mutableMapOf(),
    object : TypeReference<VkResponse<String>>() {}
)
