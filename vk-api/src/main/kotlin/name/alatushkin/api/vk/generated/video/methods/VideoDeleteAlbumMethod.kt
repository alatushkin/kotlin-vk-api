@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.deleteAlbum]
 *
 * Deletes a video album.
 *
 * @property groupId Community ID (if the album is owned by a community).
 * @property albumId Album ID.
 */
class VideoDeleteAlbumMethod(
        groupId: Long? = null,
        albumId: Long
) : VkMethod<Boolean>(
    "video.deleteAlbum",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var groupId: Long? by props
    var albumId: Long by props

    init {
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
}
