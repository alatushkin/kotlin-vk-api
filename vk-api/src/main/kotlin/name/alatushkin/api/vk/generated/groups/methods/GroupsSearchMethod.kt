@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.groups.Group
import name.alatushkin.api.vk.generated.groups.SearchSort
import name.alatushkin.api.vk.generated.groups.SearchType
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.search]
 *
 * Returns a list of communities matching the search criteria.
 *
 * @property q Search query string.
 * @property type Community type. Possible values: 'group, page, event.'
 * @property countryId Country ID.
 * @property cityId City ID. If this parameter is transmitted, country_id is ignored.
 * @property future '1' — to return only upcoming events. Works with the 'type' = 'event' only.
 * @property market '1' — to return communities with enabled market only.
 * @property sort Sort order. Possible values: *'0' — default sorting (similar the full version of the site),, *'1' — by growth speed,, *'2'— by the "day attendance/members number" ratio,, *'3' — by the "Likes number/members number" ratio,, *'4' — by the "comments number/members number" ratio,, *'5' — by the "boards entries number/members number" ratio.
 * @property offset Offset needed to return a specific subset of results.
 * @property count Number of communities to return. "Note that you can not receive more than first thousand of results, regardless of 'count' and 'offset' values."
 */
class GroupsSearchMethod(
    q: String,
    type: SearchType? = null,
    countryId: Long? = null,
    cityId: Long? = null,
    future: Boolean? = null,
    market: Boolean? = null,
    sort: SearchSort? = null,
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<Group>>(
    "groups.search",
    mutableMapOf(),
    successReference()
), UserMethod {

    var q: String by props
    var type: SearchType? by props
    var countryId: Long? by props
    var cityId: Long? by props
    var future: Boolean? by props
    var market: Boolean? by props
    var sort: SearchSort? by props
    var offset: Long? by props
    var count: Long? by props

    init {
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
}
