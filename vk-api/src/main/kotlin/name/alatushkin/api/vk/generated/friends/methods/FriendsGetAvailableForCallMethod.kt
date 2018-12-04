package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.NameCase

/**
 *  Returns a list of friends who can be called by the current user.
 *
 *  [https://vk.com/dev/friends.getAvailableForCall]
 *  @property [name_case] Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class FriendsGetAvailableForCallMethod() : VkMethod<VkList<Long>>(
    "friends.getAvailableForCall",
    mutableMapOf()
) {

    var nameCase: NameCase? by props

    constructor(
        nameCase: NameCase? = null
    ) : this() {
        this.nameCase = nameCase
    }

    fun setNameCase(nameCase: NameCase): FriendsGetAvailableForCallMethod {
        this.nameCase = nameCase
        return this
    }

    override val classRef = FriendsGetAvailableForCallMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<Long>>>() {}
    }
}
