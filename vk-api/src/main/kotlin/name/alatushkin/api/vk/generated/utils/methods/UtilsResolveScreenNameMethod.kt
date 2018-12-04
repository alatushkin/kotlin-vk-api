package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.utils.DomainResolved

/**
 *  Detects a type of object (e.g., user, community, application) and its ID by screen name.
 *
 *  [https://vk.com/dev/utils.resolveScreenName]
 *  @property [screen_name] Screen name of the user, community (e.g., 'apiclub,' 'andrew', or 'rules_of_war'), or application.
 */
class UtilsResolveScreenNameMethod() : VkMethod<DomainResolved>(
    "utils.resolveScreenName",
    HashMap()
) {

    var screenName: String? by props

    constructor(
        screenName: String? = null
    ) : this() {
        this.screenName = screenName
    }

    fun setScreenName(screenName: String): UtilsResolveScreenNameMethod {
        this.screenName = screenName
        return this
    }

    override val classRef = UtilsResolveScreenNameMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<DomainResolved>>() {}
    }
}
