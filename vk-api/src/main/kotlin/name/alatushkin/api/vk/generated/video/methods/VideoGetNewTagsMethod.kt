@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.video.VideoTagInfo
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.getNewTags]
 *
 * Returns a list of videos with tags that have not been viewed.
 *
 * @property offset Offset needed to return a specific subset of videos.
 * @property count Number of videos to return.
 */
class VideoGetNewTagsMethod(
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<VideoTagInfo>>(
    "video.getNewTags",
    mutableMapOf(),
    successReference()
), UserMethod {

    var offset: Long? by props
    var count: Long? by props

    init {
        this.offset = offset
        this.count = count
    }
}
