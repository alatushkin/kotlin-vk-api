@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.places.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.places.CheckinResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/places.checkin]
 *
 * Checks a user in at the specified location.
 *
 * @property placeId Location ID.
 * @property text Text of the comment on the check-in (255 characters maximum, line breaks not supported).
 * @property latitude Geographical latitude of the check-in, in degrees (from '-90' to '90').
 * @property longitude Geographical longitude of the check-in, in degrees (from '-180' to '180').
 * @property friendsOnly '1' — Check-in will be available only for friends. '0' — Check-in will be available for all users (default).
 * @property services List of services or websites (e.g., 'twitter', 'facebook') to which the check-in will be exported, if the user has set up the respective option.
 */
class PlacesCheckinMethod(
    placeId: Long? = null,
    text: String? = null,
    latitude: Double? = null,
    longitude: Double? = null,
    friendsOnly: Boolean? = null,
    services: Array<String>? = null
) : VkMethod<CheckinResponse>(
    "places.checkin",
    mutableMapOf(),
    successReference()
), UserMethod {

    var placeId: Long? by props
    var text: String? by props
    var latitude: Double? by props
    var longitude: Double? by props
    var friendsOnly: Boolean? by props
    var services: Array<String>? by props

    init {
        this.placeId = placeId
        this.text = text
        this.latitude = latitude
        this.longitude = longitude
        this.friendsOnly = friendsOnly
        this.services = services
    }
}
