package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.EditPlaceResponse

/**
 *  Edits the place in community.
 *
 *  [https://vk.com/dev/groups.editPlace]
 *  @property [group_id] Community ID.
 *  @property [title] Place title.
 *  @property [address] Place address.
 *  @property [country_id] Country ID.
 *  @property [city_id] City ID.
 *  @property [latitude] Geographical latitude.
 *  @property [longitude] Geographical longitude.
 */
class GroupsEditPlaceMethod() : VkMethod<EditPlaceResponse>(
    "groups.editPlace",
    HashMap()
) {

    var groupId: Long? by props
    var title: String? by props
    var address: String? by props
    var countryId: Long? by props
    var cityId: Long? by props
    var latitude: Double? by props
    var longitude: Double? by props

    constructor(
        groupId: Long? = null,
        title: String? = null,
        address: String? = null,
        countryId: Long? = null,
        cityId: Long? = null,
        latitude: Double? = null,
        longitude: Double? = null
    ) : this() {
        this.groupId = groupId
        this.title = title
        this.address = address
        this.countryId = countryId
        this.cityId = cityId
        this.latitude = latitude
        this.longitude = longitude
    }

    fun setGroupId(groupId: Long): GroupsEditPlaceMethod {
        this.groupId = groupId
        return this
    }

    fun setTitle(title: String): GroupsEditPlaceMethod {
        this.title = title
        return this
    }

    fun setAddress(address: String): GroupsEditPlaceMethod {
        this.address = address
        return this
    }

    fun setCountryId(countryId: Long): GroupsEditPlaceMethod {
        this.countryId = countryId
        return this
    }

    fun setCityId(cityId: Long): GroupsEditPlaceMethod {
        this.cityId = cityId
        return this
    }

    fun setLatitude(latitude: Double): GroupsEditPlaceMethod {
        this.latitude = latitude
        return this
    }

    fun setLongitude(longitude: Double): GroupsEditPlaceMethod {
        this.longitude = longitude
        return this
    }

    override val classRef = GroupsEditPlaceMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<EditPlaceResponse>>() {}
    }
}
