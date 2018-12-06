@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getAppUsers]
 *
 * Returns a list of IDs of the current user's friends who installed the application.
 *

 */
class FriendsGetAppUsersMethod : VkMethod<Array<Long>>(
    "friends.getAppUsers",
    mutableMapOf(),
    successReference()
), UserMethod
