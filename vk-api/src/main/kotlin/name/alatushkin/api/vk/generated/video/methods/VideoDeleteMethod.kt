@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.delete]
 *
 * Deletes a video from a user or community page.
 *
 * @property videoId Video ID.
 * @property ownerId ID of the user or community that owns the video.
 * @property targetId 
 */
class VideoDeleteMethod(
        videoId: Long,
        ownerId: Long? = null,
        targetId: Long? = null
) : VkMethod<Boolean>(
    "video.delete",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var videoId: Long by props
    var ownerId: Long? by props
    var targetId: Long? by props

    init {
        this.videoId = videoId
        this.ownerId = ownerId
        this.targetId = targetId
    }

    fun setVideoId(videoId: Long): VideoDeleteMethod {
        this.videoId = videoId
        return this
    }

    fun setOwnerId(ownerId: Long): VideoDeleteMethod {
        this.ownerId = ownerId
        return this
    }

    fun setTargetId(targetId: Long): VideoDeleteMethod {
        this.targetId = targetId
        return this
    }
}
