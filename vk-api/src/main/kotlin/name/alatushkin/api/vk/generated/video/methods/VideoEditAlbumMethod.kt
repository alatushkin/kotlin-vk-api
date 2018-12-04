package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Edits the title of a video album.
 *
 *  [https://vk.com/dev/video.editAlbum]
 *  @property [group_id] Community ID (if the album edited is owned by a community).
 *  @property [album_id] Album ID.
 *  @property [title] New album title.
 *  @property [privacy] new access permissions for the album. Possible values: , *'0' – all users,, *'1' – friends only,, *'2' – friends and friends of friends,, *'3' – "only me".
 */
class VideoEditAlbumMethod() : VkMethod<Boolean>(
    "video.editAlbum",
    HashMap()
) {

    var groupId: Long? by props
    var albumId: Long? by props
    var title: String? by props
    var privacy: Array<String>? by props

    constructor(
        groupId: Long? = null,
        albumId: Long? = null,
        title: String? = null,
        privacy: Array<String>? = null
    ) : this() {
        this.groupId = groupId
        this.albumId = albumId
        this.title = title
        this.privacy = privacy
    }

    fun setGroupId(groupId: Long): VideoEditAlbumMethod {
        this.groupId = groupId
        return this
    }

    fun setAlbumId(albumId: Long): VideoEditAlbumMethod {
        this.albumId = albumId
        return this
    }

    fun setTitle(title: String): VideoEditAlbumMethod {
        this.title = title
        return this
    }

    fun setPrivacy(privacy: Array<String>): VideoEditAlbumMethod {
        this.privacy = privacy
        return this
    }

    override val classRef = VideoEditAlbumMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
