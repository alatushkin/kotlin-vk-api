@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.video.VideoTag
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.getTags]
 *
 * Returns a list of tags on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 */
class VideoGetTagsMethod(
        ownerId: Long? = null,
        videoId: Long
) : VkMethod<Array<VideoTag>>(
    "video.getTags",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<VideoTag>>>() {}
), UserMethod {

    var ownerId: Long? by props
    var videoId: Long by props

    init {
        this.ownerId = ownerId
        this.videoId = videoId
    }

    fun setOwnerId(ownerId: Long): VideoGetTagsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoGetTagsMethod {
        this.videoId = videoId
        return this
    }
}
