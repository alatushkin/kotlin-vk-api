package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.video.VideoAlbumFull

/**
 *  Returns a list of video albums owned by a user or community.
 *
 *  [https://vk.com/dev/video.getAlbums]
 *  @property [owner_id] ID of the user or community that owns the video album(s).
 *  @property [offset] Offset needed to return a specific subset of video albums.
 *  @property [count] Number of video albums to return.
 */
class VideoGetAlbumsMethod() : VkMethod<VkList<VideoAlbumFull>>(
    "video.getAlbums",
    mutableMapOf()
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

    fun setOwnerId(ownerId: Long): VideoGetAlbumsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setOffset(offset: Long): VideoGetAlbumsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): VideoGetAlbumsMethod {
        this.count = count
        return this
    }

    override val classRef = VideoGetAlbumsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<VideoAlbumFull>>>() {}
    }
}
