@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var targetId: Long? by props
    var videoId: Long by props
    var ownerId: Long by props

    init {
        this.targetId = targetId
        this.videoId = videoId
        this.ownerId = ownerId
    }
}
