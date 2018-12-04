@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.restore]
 *
 * Restores a previously deleted video.
 *
 * @property videoId Video ID.
 * @property ownerId ID of the user or community that owns the video.
 */
class VideoRestoreMethod(
        videoId: Long,
        ownerId: Long? = null
) : VkMethod<Boolean>(
    "video.restore",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var videoId: Long by props
    var ownerId: Long? by props

    init {
        this.videoId = videoId
        this.ownerId = ownerId
    }

    fun setVideoId(videoId: Long): VideoRestoreMethod {
        this.videoId = videoId
        return this
    }

    fun setOwnerId(ownerId: Long): VideoRestoreMethod {
        this.ownerId = ownerId
        return this
    }
}
