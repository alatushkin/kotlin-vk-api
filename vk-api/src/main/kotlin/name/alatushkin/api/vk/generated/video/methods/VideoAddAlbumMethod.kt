package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.video.AddAlbumResponse

/**
 *  Creates an empty album for videos.
 *
 *  [https://vk.com/dev/video.addAlbum]
 *  @property [group_id] Community ID (if the album will be created in a community).
 *  @property [title] Album title.
 *  @property [privacy] new access permissions for the album. Possible values: , *'0' – all users,, *'1' – friends only,, *'2' – friends and friends of friends,, *'3' – "only me".
 */
class VideoAddAlbumMethod() : VkMethod<AddAlbumResponse>(
    "video.addAlbum",
    HashMap()
) {

    var groupId: Long? by props
    var title: String? by props
    var privacy: Array<String>? by props

    constructor(
        groupId: Long? = null,
        title: String? = null,
        privacy: Array<String>? = null
    ) : this() {
        this.groupId = groupId
        this.title = title
        this.privacy = privacy
    }

    fun setGroupId(groupId: Long): VideoAddAlbumMethod {
        this.groupId = groupId
        return this
    }

    fun setTitle(title: String): VideoAddAlbumMethod {
        this.title = title
        return this
    }

    fun setPrivacy(privacy: Array<String>): VideoAddAlbumMethod {
        this.privacy = privacy
        return this
    }

    override val classRef = VideoAddAlbumMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<AddAlbumResponse>>() {}
    }
}
