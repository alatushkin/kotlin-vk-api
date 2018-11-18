package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Deletes a video album.
 *
 *  [https://vk.com/dev/video.deleteAlbum]
 *  @property [group_id] Community ID (if the album is owned by a community).
 *  @property [album_id] Album ID.
 */
class VideoDeleteAlbumMethod() : VkMethod<Boolean>(
    "video.deleteAlbum",
    HashMap()
) {

    var groupId: Long? by props
    var albumId: Long? by props

    constructor(
        groupId: Long? = null,
        albumId: Long? = null
    ) : this() {
        this.groupId = groupId
        this.albumId = albumId
    }

    fun setGroupId(groupId: Long): VideoDeleteAlbumMethod {
        this.groupId = groupId
        return this
    }

    fun setAlbumId(albumId: Long): VideoDeleteAlbumMethod {
        this.albumId = albumId
        return this
    }

    override val classRef = VideoDeleteAlbumMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
