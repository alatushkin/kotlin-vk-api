@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
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
    object : TypeReference<VkSuccess<Boolean>>() {}
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

    fun setTargetId(targetId: Long): VideoReorderVideosMethod {
        this.targetId = targetId
        return this
    }

    fun setAlbumId(albumId: Long): VideoReorderVideosMethod {
        this.albumId = albumId
        return this
    }

    fun setOwnerId(ownerId: Long): VideoReorderVideosMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoReorderVideosMethod {
        this.videoId = videoId
        return this
    }

    fun setBeforeOwnerId(beforeOwnerId: Long): VideoReorderVideosMethod {
        this.beforeOwnerId = beforeOwnerId
        return this
    }

    fun setBeforeVideoId(beforeVideoId: Long): VideoReorderVideosMethod {
        this.beforeVideoId = beforeVideoId
        return this
    }

    fun setAfterOwnerId(afterOwnerId: Long): VideoReorderVideosMethod {
        this.afterOwnerId = afterOwnerId
        return this
    }

    fun setAfterVideoId(afterVideoId: Long): VideoReorderVideosMethod {
        this.afterVideoId = afterVideoId
        return this
    }
}
