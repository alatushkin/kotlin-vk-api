@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.add]
 *
 * Adds a video to a user or community page.
 *
 * @property targetId identifier of a user or community to add a video to. Use a negative value to designate a community ID.
 * @property videoId Video ID.
 * @property ownerId ID of the user or community that owns the video. Use a negative value to designate a community ID.
 */
class VideoAddMethod(
        targetId: Long? = null,
        videoId: Long,
        ownerId: Long
) : VkMethod<Boolean>(
    "video.add",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var targetId: Long? by props
    var videoId: Long by props
    var ownerId: Long by props

    init {
        this.targetId = targetId
        this.videoId = videoId
        this.ownerId = ownerId
    }

    fun setTargetId(targetId: Long): VideoAddMethod {
        this.targetId = targetId
        return this
    }

    fun setVideoId(videoId: Long): VideoAddMethod {
        this.videoId = videoId
        return this
    }

    fun setOwnerId(ownerId: Long): VideoAddMethod {
        this.ownerId = ownerId
        return this
    }
}
