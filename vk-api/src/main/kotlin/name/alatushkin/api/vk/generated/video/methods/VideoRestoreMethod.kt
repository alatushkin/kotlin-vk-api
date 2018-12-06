@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var videoId: Long by props
    var ownerId: Long? by props

    init {
        this.videoId = videoId
        this.ownerId = ownerId
    }
}
