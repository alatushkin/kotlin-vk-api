@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.photos.GetAllExtendedResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getAll]
 *
 * Returns a list of photos belonging to a user or community, in reverse chronological order.
 *
 * @property ownerId ID of a user or community that owns the photos. Use a negative value to designate a community ID.
 * @property offset Offset needed to return a specific subset of photos. By default, '0'.
 * @property count Number of photos to return.
 * @property photoSizes '1' – to return image sizes in [vk.com/dev/photo_sizes|special format].
 * @property noServiceAlbums '1' – to return photos only from standard albums, '0' – to return all photos including those in service albums, e.g., 'My wall photos' (default)
 * @property needHidden '1' – to show information about photos being hidden from the block above the wall.
 * @property skipHidden '1' – not to return photos being hidden from the block above the wall. Works only with owner_id>0, no_service_albums is ignored.
 */
class PhotosGetAllMethodExtended(
    ownerId: Long? = null,
    offset: Long? = null,
    count: Long? = null,
    photoSizes: Boolean? = null,
    noServiceAlbums: Boolean? = null,
    needHidden: Boolean? = null,
    skipHidden: Boolean? = null
) : VkMethod<GetAllExtendedResponse>(
    "photos.getAll",
    mutableMapOf("extended" to "1"),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var photoSizes: Boolean? by props
    var noServiceAlbums: Boolean? by props
    var needHidden: Boolean? by props
    var skipHidden: Boolean? by props

    init {
        this.ownerId = ownerId
        this.offset = offset
        this.count = count
        this.photoSizes = photoSizes
        this.noServiceAlbums = noServiceAlbums
        this.needHidden = needHidden
        this.skipHidden = skipHidden
    }
}
