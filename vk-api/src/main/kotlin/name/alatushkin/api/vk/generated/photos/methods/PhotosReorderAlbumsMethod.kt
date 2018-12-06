@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.reorderAlbums]
 *
 * Reorders the album in the list of user albums.
 *
 * @property ownerId ID of the user or community that owns the album.
 * @property albumId Album ID.
 * @property before ID of the album before which the album in question shall be placed.
 * @property after ID of the album after which the album in question shall be placed.
 */
class PhotosReorderAlbumsMethod(
    ownerId: Long? = null,
    albumId: Long,
    before: Long? = null,
    after: Long? = null
) : VkMethod<Boolean>(
    "photos.reorderAlbums",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var albumId: Long by props
    var before: Long? by props
    var after: Long? by props

    init {
        this.ownerId = ownerId
        this.albumId = albumId
        this.before = before
        this.after = after
    }
}
