@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var groupId: Long? by props
    var albumId: Long by props

    init {
        this.groupId = groupId
        this.albumId = albumId
    }
}
