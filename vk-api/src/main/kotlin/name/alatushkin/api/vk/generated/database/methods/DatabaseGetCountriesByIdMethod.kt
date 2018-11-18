package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.Country

/**
 *  Returns information about countries by their IDs.
 *
 *  [https://vk.com/dev/database.getCountriesById]
 *  @property [country_ids] Country IDs.
 */
class DatabaseGetCountriesByIdMethod() : VkMethod<Array<Country>>(
    "database.getCountriesById",
    HashMap()
) {

    var countryIds: Array<Long>? by props

    constructor(
        countryIds: Array<Long>? = null
    ) : this() {
        this.countryIds = countryIds
    }

    fun setCountryIds(countryIds: Array<Long>): DatabaseGetCountriesByIdMethod {
        this.countryIds = countryIds
        return this
    }

    override val classRef = DatabaseGetCountriesByIdMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Country>>>() {}
    }
}
