package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  null
 *
 *  [https://vk.com/dev/video.removeFromAlbum]
 *  @property [target_id]
 *  @property [album_id]
 *  @property [album_ids]
 *  @property [owner_id]
 *  @property [video_id]
 */
class VideoRemoveFromAlbumMethod() : VkMethod<Boolean>(
    "video.removeFromAlbum",
    HashMap()
) {

    var targetId: Long? by props
    var albumId: Long? by props
    var albumIds: Array<Long>? by props
    var ownerId: Long? by props
    var videoId: Long? by props

    constructor(
        targetId: Long? = null,
        albumId: Long? = null,
        albumIds: Array<Long>? = null,
        ownerId: Long? = null,
        videoId: Long? = null
    ) : this() {
        this.targetId = targetId
        this.albumId = albumId
        this.albumIds = albumIds
        this.ownerId = ownerId
        this.videoId = videoId
    }

    fun setTargetId(targetId: Long): VideoRemoveFromAlbumMethod {
        this.targetId = targetId
        return this
    }

    fun setAlbumId(albumId: Long): VideoRemoveFromAlbumMethod {
        this.albumId = albumId
        return this
    }

    fun setAlbumIds(albumIds: Array<Long>): VideoRemoveFromAlbumMethod {
        this.albumIds = albumIds
        return this
    }

    fun setOwnerId(ownerId: Long): VideoRemoveFromAlbumMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoRemoveFromAlbumMethod {
        this.videoId = videoId
        return this
    }

    override val classRef = VideoRemoveFromAlbumMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
