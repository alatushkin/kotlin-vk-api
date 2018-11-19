package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  null
 *
 *  [https://vk.com/dev/video.getAlbumsByVideo]
 *  @property [target_id]
 *  @property [owner_id]
 *  @property [video_id]
 */
class VideoGetAlbumsByVideoMethod() : VkMethod<Array<Long>>(
    "video.getAlbumsByVideo",
    mutableMapOf()
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

    fun setTargetId(targetId: Long): VideoGetAlbumsByVideoMethod {
        this.targetId = targetId
        return this
    }

    fun setOwnerId(ownerId: Long): VideoGetAlbumsByVideoMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoGetAlbumsByVideoMethod {
        this.videoId = videoId
        return this
    }

    override val classRef = VideoGetAlbumsByVideoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Long>>>() {}
    }
}
