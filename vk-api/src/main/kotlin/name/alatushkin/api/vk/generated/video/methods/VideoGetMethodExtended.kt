package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.video.VideoFull

/**
 *  Returns detailed information about videos.
 *
 *  [https://vk.com/dev/video.get]
 *  @property [owner_id] ID of the user or community that owns the video(s).
 *  @property [videos] Video IDs, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", Use a negative value to designate a community ID. Example: "-4363_136089719,13245770_137352259"
 *  @property [album_id] ID of the album containing the video(s).
 *  @property [count] Number of videos to return.
 *  @property [offset] Offset needed to return a specific subset of videos.
 */
class VideoGetMethodExtended() : VkMethod<VkList<VideoFull>>(
    "video.get",
    mutableMapOf("extended" to "1")
) {

    var ownerId: Long? by props
    var videos: Array<String>? by props
    var albumId: Long? by props
    var count: Long? by props
    var offset: Long? by props

    constructor(
        ownerId: Long? = null,
        videos: Array<String>? = null,
        albumId: Long? = null,
        count: Long? = null,
        offset: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.videos = videos
        this.albumId = albumId
        this.count = count
        this.offset = offset
    }

    fun setOwnerId(ownerId: Long): VideoGetMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setVideos(videos: Array<String>): VideoGetMethodExtended {
        this.videos = videos
        return this
    }

    fun setAlbumId(albumId: Long): VideoGetMethodExtended {
        this.albumId = albumId
        return this
    }

    fun setCount(count: Long): VideoGetMethodExtended {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): VideoGetMethodExtended {
        this.offset = offset
        return this
    }

    override val classRef = VideoGetMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<VideoFull>>>() {}
    }
}
