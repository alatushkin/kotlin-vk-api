package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.video.VideoAlbumFull

/**
 *  Returns video album info
 *
 *  [https://vk.com/dev/video.getAlbumById]
 *  @property [owner_id] identifier of a user or community to add a video to. Use a negative value to designate a community ID.
 *  @property [album_id] Album ID.
 */
class VideoGetAlbumByIdMethod() : VkMethod<VideoAlbumFull>(
    "video.getAlbumById",
    HashMap()
) {

    var ownerId: Long? by props
    var albumId: Long? by props

    constructor(
        ownerId: Long? = null,
        albumId: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.albumId = albumId
    }

    fun setOwnerId(ownerId: Long): VideoGetAlbumByIdMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumId(albumId: Long): VideoGetAlbumByIdMethod {
        this.albumId = albumId
        return this
    }

    override val classRef = VideoGetAlbumByIdMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VideoAlbumFull>>() {}
    }
}
