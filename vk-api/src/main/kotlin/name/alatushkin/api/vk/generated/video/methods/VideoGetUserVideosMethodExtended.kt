package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.video.Video

/**
 *  Returns list of videos in which the user is tagged.
 *
 *  [https://vk.com/dev/video.getUserVideos]
 *  @property [user_id] User ID.
 *  @property [offset] Offset needed to return a specific subset of videos.
 *  @property [count] Number of videos to return.
 */
class VideoGetUserVideosMethodExtended() : VkMethod<VkList<Video>>(
    "video.getUserVideos",
    mutableMapOf("extended" to "1")
) {

    var userId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        userId: Long? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.userId = userId
        this.offset = offset
        this.count = count
    }

    fun setUserId(userId: Long): VideoGetUserVideosMethodExtended {
        this.userId = userId
        return this
    }

    fun setOffset(offset: Long): VideoGetUserVideosMethodExtended {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): VideoGetUserVideosMethodExtended {
        this.count = count
        return this
    }

    override val classRef = VideoGetUserVideosMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Video>>>() {}
    }
}
