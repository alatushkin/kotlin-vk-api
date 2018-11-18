package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.friends.UserXtrPhone

/**
 *  Returns a list of the current user's friends whose phone numbers, validated or specified in a profile, are in a given list.
 *
 *  [https://vk.com/dev/friends.getByPhones]
 *  @property [phones] List of phone numbers in MSISDN format (maximum 1000). Example: "+79219876543,+79111234567"
 *  @property [fields] Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online, counters'.
 */
class FriendsGetByPhonesMethod() : VkMethod<Array<UserXtrPhone>>(
    "friends.getByPhones",
    HashMap()
) {

    var phones: Array<String>? by props
    var fields: Array<String>? by props

    constructor(
        phones: Array<String>? = null,
        fields: Array<String>? = null
    ) : this() {
        this.phones = phones
        this.fields = fields
    }

    fun setPhones(phones: Array<String>): FriendsGetByPhonesMethod {
        this.phones = phones
        return this
    }

    fun setFields(fields: Array<String>): FriendsGetByPhonesMethod {
        this.fields = fields
        return this
    }

    override val classRef = FriendsGetByPhonesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<UserXtrPhone>>>() {}
    }
}
