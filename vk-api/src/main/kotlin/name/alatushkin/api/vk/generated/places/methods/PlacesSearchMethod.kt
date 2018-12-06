@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.places.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.places.PlaceFull
import name.alatushkin.api.vk.generated.places.SearchRadius
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/places.search]
 *
 * Returns a list of locations that match the search criteria.
 *
 * @property q Search query string.
 * @property city City ID.
 * @property latitude Geographical latitude of the initial search point, in degrees (from '-90' to '90').
 * @property longitude Geographical longitude of the initial search point, in degrees (from '-180' to '180').
 * @property radius Radius of the search zone: '1' — 100 m. (default), '2' — 800 m. '3' — 6 km. '4' — 50 km.
 * @property offset Offset needed to return a specific subset of locations.
 * @property count Number of locations to return.
 */
class PlacesSearchMethod(
    q: String? = null,
    city: Long? = null,
    latitude: Double,
    longitude: Double,
    radius: SearchRadius? = null,
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<PlaceFull>>(
    "places.search",
    mutableMapOf(),
    successReference()
), UserMethod {

    var q: String? by props
    var city: Long? by props
    var latitude: Double by props
    var longitude: Double by props
    var radius: SearchRadius? by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.q = q
        this.city = city
        this.latitude = latitude
        this.longitude = longitude
        this.radius = radius
        this.offset = offset
        this.count = count
    }
}
