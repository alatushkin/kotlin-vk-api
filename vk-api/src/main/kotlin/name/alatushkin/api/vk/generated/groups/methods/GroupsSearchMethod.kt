package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.Group
import name.alatushkin.api.vk.generated.groups.SearchSort
import name.alatushkin.api.vk.generated.groups.SearchType

/**
 *  Returns a list of communities matching the search criteria.
 *
 *  [https://vk.com/dev/groups.search]
 *  @property [q] Search query string.
 *  @property [type] Community type. Possible values: 'group, page, event.'
 *  @property [country_id] Country ID.
 *  @property [city_id] City ID. If this parameter is transmitted, country_id is ignored.
 *  @property [future] '1' — to return only upcoming events. Works with the 'type' = 'event' only.
 *  @property [market] '1' — to return communities with enabled market only.
 *  @property [sort] Sort order. Possible values: *'0' — default sorting (similar the full version of the site),, *'1' — by growth speed,, *'2'— by the "day attendance/members number" ratio,, *'3' — by the "Likes number/members number" ratio,, *'4' — by the "comments number/members number" ratio,, *'5' — by the "boards entries number/members number" ratio.
 *  @property [offset] Offset needed to return a specific subset of results.
 *  @property [count] Number of communities to return. "Note that you can not receive more than first thousand of results, regardless of 'count' and 'offset' values."
 */
class GroupsSearchMethod() : VkMethod<VkList<Group>>(
    "groups.search",
    HashMap()
) {

    var q: String? by props
    var type: SearchType? by props
    var countryId: Long? by props
    var cityId: Long? by props
    var future: Boolean? by props
    var market: Boolean? by props
    var sort: SearchSort? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        q: String? = null,
        type: SearchType? = null,
        countryId: Long? = null,
        cityId: Long? = null,
        future: Boolean? = null,
        market: Boolean? = null,
        sort: SearchSort? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.q = q
        this.type = type
        this.countryId = countryId
        this.cityId = cityId
        this.future = future
        this.market = market
        this.sort = sort
        this.offset = offset
        this.count = count
    }

    fun setQ(q: String): GroupsSearchMethod {
        this.q = q
        return this
    }

    fun setType(type: SearchType): GroupsSearchMethod {
        this.type = type
        return this
    }

    fun setCountryId(countryId: Long): GroupsSearchMethod {
        this.countryId = countryId
        return this
    }

    fun setCityId(cityId: Long): GroupsSearchMethod {
        this.cityId = cityId
        return this
    }

    fun setFuture(future: Boolean): GroupsSearchMethod {
        this.future = future
        return this
    }

    fun setMarket(market: Boolean): GroupsSearchMethod {
        this.market = market
        return this
    }

    fun setSort(sort: SearchSort): GroupsSearchMethod {
        this.sort = sort
        return this
    }

    fun setOffset(offset: Long): GroupsSearchMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): GroupsSearchMethod {
        this.count = count
        return this
    }

    override val classRef = GroupsSearchMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Group>>>() {}
    }
}
