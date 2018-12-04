package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.video.VideoAlbumFull

/**
 *  Returns a list of video albums owned by a user or community.
 *
 *  [https://vk.com/dev/video.getAlbums]
 *  @property [owner_id] ID of the user or community that owns the video album(s).
 *  @property [offset] Offset needed to return a specific subset of video albums.
 *  @property [count] Number of video albums to return.
 */
class VideoGetAlbumsMethodExtended() : VkMethod<VkList<VideoAlbumFull>>(
    "video.getAlbums",
    mutableMapOf("extended" to "1")
) {

    var ownerId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        ownerId: Long? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.offset = offset
        this.count = count
    }

    fun setOwnerId(ownerId: Long): VideoGetAlbumsMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setOffset(offset: Long): VideoGetAlbumsMethodExtended {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): VideoGetAlbumsMethodExtended {
        this.count = count
        return this
    }

    override val classRef = VideoGetAlbumsMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<VideoAlbumFull>>>() {}
    }
}
