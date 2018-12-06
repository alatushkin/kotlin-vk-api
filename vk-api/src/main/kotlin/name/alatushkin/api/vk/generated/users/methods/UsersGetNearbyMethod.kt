@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.users.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.users.GetNearbyRadius
import name.alatushkin.api.vk.generated.users.UserFull
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/users.getNearby]
 *
 * Indexes current user location and returns nearby users.
 *
 * @property latitude geographic latitude of the place a user is located, in degrees (from -90 to 90)
 * @property longitude geographic longitude of the place a user is located, in degrees (from -180 to 180)
 * @property accuracy current location accuracy in meters
 * @property timeout time when a user disappears from location search results, in seconds
 * @property radius search zone radius type (1 to 4), :* 1 – 300 m,, :* 2 – 2400 m,, :* 3 – 18 km,, :* 4 – 150 km.
 * @property fields list of additional fields to return. Available values: sex, bdate, city, country, photo_50, photo_100, photo_200_orig, photo_200, photo_400_orig, photo_max, photo_max_orig, online, online_mobile, domain, has_mobile, contacts, connections, site, education, universities, schools, can_post, can_see_all_posts, can_see_audio, can_write_private_message, status, last_seen, common_count, relation, relatives, counters, screen_name, maiden_name, timezone, occupation
 * @property nameCase Case for declension of user name and surname: , nom –nominative (default) , gen – genitive , dat – dative , acc – accusative , ins – instrumental , abl – prepositional
 */
class UsersGetNearbyMethod(
    latitude: Double,
    longitude: Double,
    accuracy: Long? = null,
    timeout: Long? = null,
    radius: GetNearbyRadius? = null,
    fields: Array<String>? = null,
    nameCase: NameCase? = null
) : VkMethod<VkList<UserFull>>(
    "users.getNearby",
    mutableMapOf(),
    successReference()
), UserMethod {

    var latitude: Double by props
    var longitude: Double by props
    var accuracy: Long? by props
    var timeout: Long? by props
    var radius: GetNearbyRadius? by props
    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    init {
        this.latitude = latitude
        this.longitude = longitude
        this.accuracy = accuracy
        this.timeout = timeout
        this.radius = radius
        this.fields = fields
        this.nameCase = nameCase
    }
}
