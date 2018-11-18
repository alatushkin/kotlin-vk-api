package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Adds a video to a user or community page.
 *
 *  [https://vk.com/dev/video.add]
 *  @property [target_id] identifier of a user or community to add a video to. Use a negative value to designate a community ID.
 *  @property [video_id] Video ID.
 *  @property [owner_id] ID of the user or community that owns the video. Use a negative value to designate a community ID.
 */
class VideoAddMethod() : VkMethod<Boolean>(
    "video.add",
    HashMap()
) {

    var targetId: Long? by props
    var videoId: Long? by props
    var ownerId: Long? by props

    constructor(
        targetId: Long? = null,
        videoId: Long? = null,
        ownerId: Long? = null
    ) : this() {
        this.targetId = targetId
        this.videoId = videoId
        this.ownerId = ownerId
    }

    fun setTargetId(targetId: Long): VideoAddMethod {
        this.targetId = targetId
        return this
    }

    fun setVideoId(videoId: Long): VideoAddMethod {
        this.videoId = videoId
        return this
    }

    fun setOwnerId(ownerId: Long): VideoAddMethod {
        this.ownerId = ownerId
        return this
    }

    override val classRef = VideoAddMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
