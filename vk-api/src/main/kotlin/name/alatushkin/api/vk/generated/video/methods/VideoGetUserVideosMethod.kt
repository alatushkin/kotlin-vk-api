package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.video.Video

/**
 *  Returns list of videos in which the user is tagged.
 *
 *  [https://vk.com/dev/video.getUserVideos]
 *  @property [user_id] User ID.
 *  @property [offset] Offset needed to return a specific subset of videos.
 *  @property [count] Number of videos to return.
 */
class VideoGetUserVideosMethod() : VkMethod<VkList<Video>>(
    "video.getUserVideos",
    mutableMapOf()
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

    fun setUserId(userId: Long): VideoGetUserVideosMethod {
        this.userId = userId
        return this
    }

    fun setOffset(offset: Long): VideoGetUserVideosMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): VideoGetUserVideosMethod {
        this.count = count
        return this
    }

    override val classRef = VideoGetUserVideosMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<Video>>>() {}
    }
}
