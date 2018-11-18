package name.alatushkin.api.vk.generated.places.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.places.CheckinResponse

/**
 *  Checks a user in at the specified location.
 *
 *  [https://vk.com/dev/places.checkin]
 *  @property [place_id] Location ID.
 *  @property [text] Text of the comment on the check-in (255 characters maximum, line breaks not supported).
 *  @property [latitude] Geographical latitude of the check-in, in degrees (from '-90' to '90').
 *  @property [longitude] Geographical longitude of the check-in, in degrees (from '-180' to '180').
 *  @property [friends_only] '1' — Check-in will be available only for friends. '0' — Check-in will be available for all users (default).
 *  @property [services] List of services or websites (e.g., 'twitter', 'facebook') to which the check-in will be exported, if the user has set up the respective option.
 */
class PlacesCheckinMethod() : VkMethod<CheckinResponse>(
    "places.checkin",
    HashMap()
) {

    var placeId: Long? by props
    var text: String? by props
    var latitude: Long? by props
    var longitude: Long? by props
    var friendsOnly: Boolean? by props
    var services: Array<String>? by props

    constructor(
        placeId: Long? = null,
        text: String? = null,
        latitude: Long? = null,
        longitude: Long? = null,
        friendsOnly: Boolean? = null,
        services: Array<String>? = null
    ) : this() {
        this.placeId = placeId
        this.text = text
        this.latitude = latitude
        this.longitude = longitude
        this.friendsOnly = friendsOnly
        this.services = services
    }

    fun setPlaceId(placeId: Long): PlacesCheckinMethod {
        this.placeId = placeId
        return this
    }

    fun setText(text: String): PlacesCheckinMethod {
        this.text = text
        return this
    }

    fun setLatitude(latitude: Long): PlacesCheckinMethod {
        this.latitude = latitude
        return this
    }

    fun setLongitude(longitude: Long): PlacesCheckinMethod {
        this.longitude = longitude
        return this
    }

    fun setFriendsOnly(friendsOnly: Boolean): PlacesCheckinMethod {
        this.friendsOnly = friendsOnly
        return this
    }

    fun setServices(services: Array<String>): PlacesCheckinMethod {
        this.services = services
        return this
    }

    override val classRef = PlacesCheckinMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<CheckinResponse>>() {}
    }
}
