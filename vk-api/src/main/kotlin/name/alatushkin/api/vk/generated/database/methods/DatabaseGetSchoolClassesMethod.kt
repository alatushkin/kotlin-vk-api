package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Returns a list of school classes specified for the country.
 *
 *  [https://vk.com/dev/database.getSchoolClasses]
 *  @property [country_id] Country ID.
 */
class DatabaseGetSchoolClassesMethod() : VkMethod<Array<Array<String>>>(
    "database.getSchoolClasses",
    HashMap()
) {

    var countryId: Long? by props

    constructor(
        countryId: Long? = null
    ) : this() {
        this.countryId = countryId
    }

    fun setCountryId(countryId: Long): DatabaseGetSchoolClassesMethod {
        this.countryId = countryId
        return this
    }

    override val classRef = DatabaseGetSchoolClassesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Array<String>>>>() {}
    }
}
