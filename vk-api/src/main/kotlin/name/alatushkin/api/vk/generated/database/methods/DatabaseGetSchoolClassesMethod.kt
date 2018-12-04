@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getSchoolClasses]
 *
 * Returns a list of school classes specified for the country.
 *
 * @property countryId Country ID.
 */
class DatabaseGetSchoolClassesMethod(
        countryId: Long? = null
) : VkMethod<Array<Array<String>>>(
    "database.getSchoolClasses",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Array<Array<String>>>>() {}
), UserServiceMethod {

    var countryId: Long? by props

    init {
        this.countryId = countryId
    }

    fun setCountryId(countryId: Long): DatabaseGetSchoolClassesMethod {
        this.countryId = countryId
        return this
    }
}
