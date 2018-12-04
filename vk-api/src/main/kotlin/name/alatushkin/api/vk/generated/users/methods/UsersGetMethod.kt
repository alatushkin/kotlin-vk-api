package name.alatushkin.api.vk.generated.users.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.users.UserXtrCounters

/**
 *  Returns detailed information on users.
 *
 *  [https://vk.com/dev/users.get]
 *  @property [user_ids] User IDs or screen names ('screen_name'). By default, current user ID.
 *  @property [fields] Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'contacts', 'education', 'online', 'counters', 'relation', 'last_seen', 'activity', 'can_write_private_message', 'can_see_all_posts', 'can_post', 'universities',
 *  @property [name_case] Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class UsersGetMethod() : VkMethod<Array<UserXtrCounters>>(
    "users.get",
    HashMap()
) {

    var userIds: Array<String>? by props
    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    constructor(
        userIds: Array<String>? = null,
        fields: Array<String>? = null,
        nameCase: NameCase? = null
    ) : this() {
        this.userIds = userIds
        this.fields = fields
        this.nameCase = nameCase
    }

    fun setUserIds(userIds: Array<String>): UsersGetMethod {
        this.userIds = userIds
        return this
    }

    fun setFields(fields: Array<String>): UsersGetMethod {
        this.fields = fields
        return this
    }

    fun setNameCase(nameCase: NameCase): UsersGetMethod {
        this.nameCase = nameCase
        return this
    }

    override val classRef = UsersGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<UserXtrCounters>>>() {}
    }
}
