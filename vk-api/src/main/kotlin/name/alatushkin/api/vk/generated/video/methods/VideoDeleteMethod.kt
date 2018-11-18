package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Deletes a video from a user or community page.
 *
 *  [https://vk.com/dev/video.delete]
 *  @property [video_id] Video ID.
 *  @property [owner_id] ID of the user or community that owns the video.
 *  @property [target_id] null
 */
class VideoDeleteMethod() : VkMethod<Boolean>(
    "video.delete",
    HashMap()
) {

    var videoId: Long? by props
    var ownerId: Long? by props
    var targetId: Long? by props

    constructor(
        videoId: Long? = null,
        ownerId: Long? = null,
        targetId: Long? = null
    ) : this() {
        this.videoId = videoId
        this.ownerId = ownerId
        this.targetId = targetId
    }

    fun setVideoId(videoId: Long): VideoDeleteMethod {
        this.videoId = videoId
        return this
    }

    fun setOwnerId(ownerId: Long): VideoDeleteMethod {
        this.ownerId = ownerId
        return this
    }

    fun setTargetId(targetId: Long): VideoDeleteMethod {
        this.targetId = targetId
        return this
    }

    override val classRef = VideoDeleteMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
