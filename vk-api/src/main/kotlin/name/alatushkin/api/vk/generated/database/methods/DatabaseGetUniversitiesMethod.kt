@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.database.University
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getUniversities]
 *
 * Returns a list of higher education institutions.
 *
 * @property q Search query.
 * @property countryId Country ID.
 * @property cityId City ID.
 * @property offset Offset needed to return a specific subset of universities.
 * @property count Number of universities to return.
 */
class DatabaseGetUniversitiesMethod(
    q: String? = null,
    countryId: Long? = null,
    cityId: Long? = null,
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<University>>(
    "database.getUniversities",
    mutableMapOf(),
    successReference()
), UserServiceMethod {

    var q: String? by props
    var countryId: Long? by props
    var cityId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.q = q
        this.countryId = countryId
        this.cityId = cityId
        this.offset = offset
        this.count = count
    }
}
