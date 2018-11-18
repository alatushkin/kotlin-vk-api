package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.users.UserFull

/**
 *  Returns a list of friends who can be called by the current user.
 *
 *  [https://vk.com/dev/friends.getAvailableForCall]
 *  @property [fields] Profile fields to return. Sample values: 'uid', 'first_name', 'last_name', 'nickname', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'domain', 'has_mobile', 'rate', 'contacts', 'education'.
 *  @property [name_case] Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class FriendsGetAvailableForCallMethodWithFields() : VkMethod<VkList<UserFull>>(
    "friends.getAvailableForCall",
    HashMap()
) {

    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    constructor(
        fields: Array<String>? = null,
        nameCase: NameCase? = null
    ) : this() {
        this.fields = fields
        this.nameCase = nameCase
    }

    fun setFields(fields: Array<String>): FriendsGetAvailableForCallMethodWithFields {
        this.fields = fields
        return this
    }

    fun setNameCase(nameCase: NameCase): FriendsGetAvailableForCallMethodWithFields {
        this.nameCase = nameCase
        return this
    }

    override val classRef = FriendsGetAvailableForCallMethodWithFields.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<UserFull>>>() {}
    }
}
