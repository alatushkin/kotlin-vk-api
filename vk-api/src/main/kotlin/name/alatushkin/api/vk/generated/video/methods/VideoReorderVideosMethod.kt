package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Reorders the video in the video album.
 *
 *  [https://vk.com/dev/video.reorderVideos]
 *  @property [target_id] ID of the user or community that owns the album with videos.
 *  @property [album_id] ID of the video album.
 *  @property [owner_id] ID of the user or community that owns the video.
 *  @property [video_id] ID of the video.
 *  @property [before_owner_id] ID of the user or community that owns the video before which the video in question shall be placed.
 *  @property [before_video_id] ID of the video before which the video in question shall be placed.
 *  @property [after_owner_id] ID of the user or community that owns the video after which the photo in question shall be placed.
 *  @property [after_video_id] ID of the video after which the photo in question shall be placed.
 */
class VideoReorderVideosMethod() : VkMethod<Boolean>(
    "video.reorderVideos",
    HashMap()
) {

    var targetId: Long? by props
    var albumId: Long? by props
    var ownerId: Long? by props
    var videoId: Long? by props
    var beforeOwnerId: Long? by props
    var beforeVideoId: Long? by props
    var afterOwnerId: Long? by props
    var afterVideoId: Long? by props

    constructor(
        targetId: Long? = null,
        albumId: Long? = null,
        ownerId: Long? = null,
        videoId: Long? = null,
        beforeOwnerId: Long? = null,
        beforeVideoId: Long? = null,
        afterOwnerId: Long? = null,
        afterVideoId: Long? = null
    ) : this() {
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

    override val classRef = VideoReorderVideosMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
