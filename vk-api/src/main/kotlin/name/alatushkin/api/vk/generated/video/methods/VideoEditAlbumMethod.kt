@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.editAlbum]
 *
 * Edits the title of a video album.
 *
 * @property groupId Community ID (if the album edited is owned by a community).
 * @property albumId Album ID.
 * @property title New album title.
 * @property privacy new access permissions for the album. Possible values: , *'0' – all users,, *'1' – friends only,, *'2' – friends and friends of friends,, *'3' – "only me".
 */
class VideoEditAlbumMethod(
        groupId: Long? = null,
        albumId: Long,
        title: String,
        privacy: Array<String>? = null
) : VkMethod<Boolean>(
    "video.editAlbum",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var groupId: Long? by props
    var albumId: Long by props
    var title: String by props
    var privacy: Array<String>? by props

    init {
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
}
