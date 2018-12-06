@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.removeTag]
 *
 * Removes a tag from a video.
 *
 * @property tagId Tag ID.
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 */
class VideoRemoveTagMethod(
    tagId: Long,
    ownerId: Long? = null,
    videoId: Long
) : VkMethod<Boolean>(
    "video.removeTag",
    mutableMapOf(),
    successReference()
), UserMethod {

    var tagId: Long by props
    var ownerId: Long? by props
    var videoId: Long by props

    init {
        this.tagId = tagId
        this.ownerId = ownerId
        this.videoId = videoId
    }
}
