@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.utils.DomainResolved
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/utils.resolveScreenName]
 *
 * Detects a type of object (e.g., user, community, application) and its ID by screen name.
 *
 * @property screenName Screen name of the user, community (e.g., 'apiclub,' 'andrew', or 'rules_of_war'), or application.
 */
class UtilsResolveScreenNameMethod(
        screenName: String
) : VkMethod<DomainResolved>(
    "utils.resolveScreenName",
    mutableMapOf(),
    object : TypeReference<VkSuccess<DomainResolved>>() {}
), UserGroupServiceMethod {

    var screenName: String by props

    init {
        this.screenName = screenName
    }

    fun setScreenName(screenName: String): UtilsResolveScreenNameMethod {
        this.screenName = screenName
        return this
    }
}
