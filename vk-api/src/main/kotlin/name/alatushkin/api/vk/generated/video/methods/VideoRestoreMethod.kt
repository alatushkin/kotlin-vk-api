package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Restores a previously deleted video.
 *
 *  [https://vk.com/dev/video.restore]
 *  @property [video_id] Video ID.
 *  @property [owner_id] ID of the user or community that owns the video.
 */
class VideoRestoreMethod() : VkMethod<Boolean>(
    "video.restore",
    HashMap()
) {

    var videoId: Long? by props
    var ownerId: Long? by props

    constructor(
        videoId: Long? = null,
        ownerId: Long? = null
    ) : this() {
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

    override val classRef = VideoRestoreMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
