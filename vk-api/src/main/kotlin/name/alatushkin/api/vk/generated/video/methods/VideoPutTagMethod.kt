package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Adds a tag on a video.
 *
 *  [https://vk.com/dev/video.putTag]
 *  @property [user_id] ID of the user to be tagged.
 *  @property [owner_id] ID of the user or community that owns the video.
 *  @property [video_id] Video ID.
 *  @property [tagged_name] Tag text.
 */
class VideoPutTagMethod() : VkMethod<Long>(
    "video.putTag",
    HashMap()
) {

    var userId: Long? by props
    var ownerId: Long? by props
    var videoId: Long? by props
    var taggedName: String? by props

    constructor(
        userId: Long? = null,
        ownerId: Long? = null,
        videoId: Long? = null,
        taggedName: String? = null
    ) : this() {
        this.userId = userId
        this.ownerId = ownerId
        this.videoId = videoId
        this.taggedName = taggedName
    }

    fun setUserId(userId: Long): VideoPutTagMethod {
        this.userId = userId
        return this
    }

    fun setOwnerId(ownerId: Long): VideoPutTagMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoPutTagMethod {
        this.videoId = videoId
        return this
    }

    fun setTaggedName(taggedName: String): VideoPutTagMethod {
        this.taggedName = taggedName
        return this
    }

    override val classRef = VideoPutTagMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Long>>() {}
    }
}
