@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.editAlbum]
 *
 * Edits a collection of items
 *
 * @property ownerId ID of an collection owner community.
 * @property albumId Collection ID.
 * @property title Collection title.
 * @property photoId Cover photo id
 * @property mainAlbum Set as main ('1' – set, '0' – no).
 */
class MarketEditAlbumMethod(
    ownerId: Long,
    albumId: Long,
    title: String,
    photoId: Long? = null,
    mainAlbum: Boolean? = null
) : VkMethod<Boolean>(
    "market.editAlbum",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var albumId: Long by props
    var title: String by props
    var photoId: Long? by props
    var mainAlbum: Boolean? by props

    init {
        this.ownerId = ownerId
        this.albumId = albumId
        this.title = title
        this.photoId = photoId
        this.mainAlbum = mainAlbum
    }
}
