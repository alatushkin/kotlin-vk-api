@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.video.VideoTagInfo
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
    object : TypeReference<VkResponse<VkList<VideoTagInfo>>>() {}
), UserMethod {

    var offset: Long? by props
    var count: Long? by props

    init {
        this.offset = offset
        this.count = count
    }

    fun setOffset(offset: Long): VideoGetNewTagsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): VideoGetNewTagsMethod {
        this.count = count
        return this
    }
}
