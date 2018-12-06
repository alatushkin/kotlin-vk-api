@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.deleteAlbum]
 *
 * Deletes a photo album belonging to the current user.
 *
 * @property albumId Album ID.
 * @property groupId ID of the community that owns the album.
 */
class PhotosDeleteAlbumMethod(
    albumId: Long,
    groupId: Long? = null
) : VkMethod<Boolean>(
    "photos.deleteAlbum",
    mutableMapOf(),
    successReference()
), UserMethod {

    var albumId: Long by props
    var groupId: Long? by props

    init {
        this.albumId = albumId
        this.groupId = groupId
    }
}
