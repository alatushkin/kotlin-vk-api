@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.reorderVideos]
 *
 * Reorders the video in the video album.
 *
 * @property targetId ID of the user or community that owns the album with videos.
 * @property albumId ID of the video album.
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId ID of the video.
 * @property beforeOwnerId ID of the user or community that owns the video before which the video in question shall be placed.
 * @property beforeVideoId ID of the video before which the video in question shall be placed.
 * @property afterOwnerId ID of the user or community that owns the video after which the photo in question shall be placed.
 * @property afterVideoId ID of the video after which the photo in question shall be placed.
 */
class VideoReorderVideosMethod(
    targetId: Long? = null,
    albumId: Long? = null,
    ownerId: Long,
    videoId: Long,
    beforeOwnerId: Long? = null,
    beforeVideoId: Long? = null,
    afterOwnerId: Long? = null,
    afterVideoId: Long? = null
) : VkMethod<Boolean>(
    "video.reorderVideos",
    mutableMapOf(),
    successReference()
), UserMethod {

    var targetId: Long? by props
    var albumId: Long? by props
    var ownerId: Long by props
    var videoId: Long by props
    var beforeOwnerId: Long? by props
    var beforeVideoId: Long? by props
    var afterOwnerId: Long? by props
    var afterVideoId: Long? by props

    init {
        this.targetId = targetId
        this.albumId = albumId
        this.ownerId = ownerId
        this.videoId = videoId
        this.beforeOwnerId = beforeOwnerId
        this.beforeVideoId = beforeVideoId
        this.afterOwnerId = afterOwnerId
        this.afterVideoId = afterVideoId
    }
}
