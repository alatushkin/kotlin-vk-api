package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.Object

/**
 *  Returns information about cities by their IDs.
 *
 *  [https://vk.com/dev/database.getCitiesById]
 *  @property [city_ids] City IDs.
 */
class DatabaseGetCitiesByIdMethod() : VkMethod<Array<Object>>(
    "database.getCitiesById",
    HashMap()
) {

    var cityIds: Array<Long>? by props

    constructor(
        cityIds: Array<Long>? = null
    ) : this() {
        this.cityIds = cityIds
    }

    fun setCityIds(cityIds: Array<Long>): DatabaseGetCitiesByIdMethod {
        this.cityIds = cityIds
        return this
    }

    override val classRef = DatabaseGetCitiesByIdMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Object>>>() {}
    }
}
