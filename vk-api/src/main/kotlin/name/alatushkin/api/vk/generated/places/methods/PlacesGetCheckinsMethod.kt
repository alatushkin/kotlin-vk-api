@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.places.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.places.Checkin
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/places.getCheckins]
 *
 * Returns a list of user check-ins at locations according to the set parameters.
 *
 * @property latitude Geographical latitude of the initial search point, in degrees (from '-90' to '90').
 * @property longitude Geographical longitude of the initial search point, in degrees (from '-180' to '180').
 * @property place Location ID of check-ins to return. (Ignored if 'latitude' and 'longitude' are specified.)
 * @property userId 
 * @property offset Offset needed to return a specific subset of check-ins. (Ignored if 'timestamp' is not null.)
 * @property count Number of check-ins to return. (Ignored if 'timestamp' is not null.)
 * @property timestamp Specifies that only those check-ins created after the specified timestamp will be returned.
 * @property friendsOnly '1' — to return only check-ins with set geographical coordinates. (Ignored if 'latitude' and 'longitude' are not set.)
 * @property needPlaces '1' — to return location information with the check-ins. (Ignored if 'place' is not set.),
 */
class PlacesGetCheckinsMethod(
    latitude: Double? = null,
    longitude: Double? = null,
    place: Long? = null,
    userId: Long? = null,
    offset: Long? = null,
    count: Long? = null,
    timestamp: Long? = null,
    friendsOnly: Boolean? = null,
    needPlaces: Boolean? = null
) : VkMethod<VkList<Checkin>>(
    "places.getCheckins",
    mutableMapOf(),
    successReference()
), UserMethod {

    var latitude: Double? by props
    var longitude: Double? by props
    var place: Long? by props
    var userId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var timestamp: Long? by props
    var friendsOnly: Boolean? by props
    var needPlaces: Boolean? by props

    init {
        this.latitude = latitude
        this.longitude = longitude
        this.place = place
        this.userId = userId
        this.offset = offset
        this.count = count
        this.timestamp = timestamp
        this.friendsOnly = friendsOnly
        this.needPlaces = needPlaces
    }
}
