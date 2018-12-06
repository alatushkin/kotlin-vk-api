@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.groups.EditPlaceResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.editPlace]
 *
 * Edits the place in community.
 *
 * @property groupId Community ID.
 * @property title Place title.
 * @property address Place address.
 * @property countryId Country ID.
 * @property cityId City ID.
 * @property latitude Geographical latitude.
 * @property longitude Geographical longitude.
 */
class GroupsEditPlaceMethod(
    groupId: Long,
    title: String? = null,
    address: String? = null,
    countryId: Long? = null,
    cityId: Long? = null,
    latitude: Double? = null,
    longitude: Double? = null
) : VkMethod<EditPlaceResponse>(
    "groups.editPlace",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props
    var title: String? by props
    var address: String? by props
    var countryId: Long? by props
    var cityId: Long? by props
    var latitude: Double? by props
    var longitude: Double? by props

    init {
        this.groupId = groupId
        this.title = title
        this.address = address
        this.countryId = countryId
        this.cityId = cityId
        this.latitude = latitude
        this.longitude = longitude
    }
}
