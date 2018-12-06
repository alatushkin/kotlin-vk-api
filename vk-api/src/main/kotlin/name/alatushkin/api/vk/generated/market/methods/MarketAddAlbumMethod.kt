@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.market.AddAlbumResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.addAlbum]
 *
 * Creates new collection of items
 *
 * @property ownerId ID of an item owner community.
 * @property title Collection title.
 * @property photoId Cover photo ID.
 * @property mainAlbum Set as main ('1' – set, '0' – no).
 */
class MarketAddAlbumMethod(
    ownerId: Long,
    title: String,
    photoId: Long? = null,
    mainAlbum: Boolean? = null
) : VkMethod<AddAlbumResponse>(
    "market.addAlbum",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var title: String by props
    var photoId: Long? by props
    var mainAlbum: Boolean? by props

    init {
        this.ownerId = ownerId
        this.title = title
        this.photoId = photoId
        this.mainAlbum = mainAlbum
    }
}
