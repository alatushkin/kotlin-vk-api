@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getAvailableForCall]
 *
 * Returns a list of friends who can be called by the current user.
 *
 * @property nameCase Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class FriendsGetAvailableForCallMethod(
        nameCase: NameCase? = null
) : VkMethod<VkList<Long>>(
    "friends.getAvailableForCall",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<Long>>>() {}
), UserMethod {

    var nameCase: NameCase? by props

    init {
        this.nameCase = nameCase
    }

    fun setNameCase(nameCase: NameCase): FriendsGetAvailableForCallMethod {
        this.nameCase = nameCase
        return this
    }
}
