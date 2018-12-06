@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/photos.search]
 *
 * Returns a list of photos.
 *
 * @property q Search query string.
 * @property lat Geographical latitude, in degrees (from '-90' to '90').
 * @property long Geographical longitude, in degrees (from '-180' to '180').
 * @property startTime 
 * @property endTime 
 * @property sort Sort order:
 * @property offset Offset needed to return a specific subset of photos.
 * @property count Number of photos to return.
 * @property radius Radius of search in meters (works very approximately). Available values: '10', '100', '800', '6000', '50000'.
 */
class PhotosSearchMethod(
    q: String? = null,
    lat: Double? = null,
    long: Double? = null,
    startTime: Long? = null,
    endTime: Long? = null,
    sort: Long? = null,
    offset: Long? = null,
    count: Long? = null,
    radius: Long? = null
) : VkMethod<VkList<Photo>>(
    "photos.search",
    mutableMapOf(),
    successReference()
), UserServiceMethod {

    var q: String? by props
    var lat: Double? by props
    var long: Double? by props
    var startTime: Long? by props
    var endTime: Long? by props
    var sort: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var radius: Long? by props

    init {
        this.q = q
        this.lat = lat
        this.long = long
        this.startTime = startTime
        this.endTime = endTime
        this.sort = sort
        this.offset = offset
        this.count = count
        this.radius = radius
    }
}
