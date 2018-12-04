package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Removes a tag from a video.
 *
 *  [https://vk.com/dev/video.removeTag]
 *  @property [tag_id] Tag ID.
 *  @property [owner_id] ID of the user or community that owns the video.
 *  @property [video_id] Video ID.
 */
class VideoRemoveTagMethod() : VkMethod<Boolean>(
    "video.removeTag",
    HashMap()
) {

    var tagId: Long? by props
    var ownerId: Long? by props
    var videoId: Long? by props

    constructor(
        tagId: Long? = null,
        ownerId: Long? = null,
        videoId: Long? = null
    ) : this() {
        this.tagId = tagId
        this.ownerId = ownerId
        this.videoId = videoId
    }

    fun setTagId(tagId: Long): VideoRemoveTagMethod {
        this.tagId = tagId
        return this
    }

    fun setOwnerId(ownerId: Long): VideoRemoveTagMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoRemoveTagMethod {
        this.videoId = videoId
        return this
    }

    override val classRef = VideoRemoveTagMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
