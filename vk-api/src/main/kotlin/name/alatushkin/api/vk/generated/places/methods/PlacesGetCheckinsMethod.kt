package name.alatushkin.api.vk.generated.places.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.places.Checkin

/**
 *  Returns a list of user check-ins at locations according to the set parameters.
 *
 *  [https://vk.com/dev/places.getCheckins]
 *  @property [latitude] Geographical latitude of the initial search point, in degrees (from '-90' to '90').
 *  @property [longitude] Geographical longitude of the initial search point, in degrees (from '-180' to '180').
 *  @property [place] Location ID of check-ins to return. (Ignored if 'latitude' and 'longitude' are specified.)
 *  @property [user_id] null
 *  @property [offset] Offset needed to return a specific subset of check-ins. (Ignored if 'timestamp' is not null.)
 *  @property [count] Number of check-ins to return. (Ignored if 'timestamp' is not null.)
 *  @property [timestamp] Specifies that only those check-ins created after the specified timestamp will be returned.
 *  @property [friends_only] '1' — to return only check-ins with set geographical coordinates. (Ignored if 'latitude' and 'longitude' are not set.)
 *  @property [need_places] '1' — to return location information with the check-ins. (Ignored if 'place' is not set.),
 */
class PlacesGetCheckinsMethod() : VkMethod<VkList<Checkin>>(
    "places.getCheckins",
    HashMap()
) {

    var latitude: Long? by props
    var longitude: Long? by props
    var place: Long? by props
    var userId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var timestamp: Long? by props
    var friendsOnly: Boolean? by props
    var needPlaces: Boolean? by props

    constructor(
        latitude: Long? = null,
        longitude: Long? = null,
        place: Long? = null,
        userId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        timestamp: Long? = null,
        friendsOnly: Boolean? = null,
        needPlaces: Boolean? = null
    ) : this() {
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

    fun setLatitude(latitude: Long): PlacesGetCheckinsMethod {
        this.latitude = latitude
        return this
    }

    fun setLongitude(longitude: Long): PlacesGetCheckinsMethod {
        this.longitude = longitude
        return this
    }

    fun setPlace(place: Long): PlacesGetCheckinsMethod {
        this.place = place
        return this
    }

    fun setUserId(userId: Long): PlacesGetCheckinsMethod {
        this.userId = userId
        return this
    }

    fun setOffset(offset: Long): PlacesGetCheckinsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): PlacesGetCheckinsMethod {
        this.count = count
        return this
    }

    fun setTimestamp(timestamp: Long): PlacesGetCheckinsMethod {
        this.timestamp = timestamp
        return this
    }

    fun setFriendsOnly(friendsOnly: Boolean): PlacesGetCheckinsMethod {
        this.friendsOnly = friendsOnly
        return this
    }

    fun setNeedPlaces(needPlaces: Boolean): PlacesGetCheckinsMethod {
        this.needPlaces = needPlaces
        return this
    }

    override val classRef = PlacesGetCheckinsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Checkin>>>() {}
    }
}
