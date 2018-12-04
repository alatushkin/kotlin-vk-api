package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.video.VideoTag

/**
 *  Returns a list of tags on a video.
 *
 *  [https://vk.com/dev/video.getTags]
 *  @property [owner_id] ID of the user or community that owns the video.
 *  @property [video_id] Video ID.
 */
class VideoGetTagsMethod() : VkMethod<Array<VideoTag>>(
    "video.getTags",
    HashMap()
) {

    var ownerId: Long? by props
    var videoId: Long? by props

    constructor(
        ownerId: Long? = null,
        videoId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.videoId = videoId
    }

    fun setOwnerId(ownerId: Long): VideoGetTagsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoGetTagsMethod {
        this.videoId = videoId
        return this
    }

    override val classRef = VideoGetTagsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<VideoTag>>>() {}
    }
}
