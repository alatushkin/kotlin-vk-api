package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.video.VideoAlbumFull

/**
 *  null
 *
 *  [https://vk.com/dev/video.getAlbumsByVideo]
 *  @property [target_id]
 *  @property [owner_id]
 *  @property [video_id]
 */
class VideoGetAlbumsByVideoMethodExtended() : VkMethod<VkList<VideoAlbumFull>>(
    "video.getAlbumsByVideo",
    mutableMapOf("extended" to "1")
) {

    var targetId: Long? by props
    var ownerId: Long? by props
    var videoId: Long? by props

    constructor(
        targetId: Long? = null,
        ownerId: Long? = null,
        videoId: Long? = null
    ) : this() {
        this.targetId = targetId
        this.ownerId = ownerId
        this.videoId = videoId
    }

    fun setTargetId(targetId: Long): VideoGetAlbumsByVideoMethodExtended {
        this.targetId = targetId
        return this
    }

    fun setOwnerId(ownerId: Long): VideoGetAlbumsByVideoMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoGetAlbumsByVideoMethodExtended {
        this.videoId = videoId
        return this
    }

    override val classRef = VideoGetAlbumsByVideoMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<VideoAlbumFull>>>() {}
    }
}
