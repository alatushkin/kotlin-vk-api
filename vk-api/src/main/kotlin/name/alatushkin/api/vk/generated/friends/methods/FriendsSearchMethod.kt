package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.users.UserFull

/**
 *  Returns a list of friends matching the search criteria.
 *
 *  [https://vk.com/dev/friends.search]
 *  @property [user_id] User ID.
 *  @property [q] Search query string (e.g., 'Vasya Babich').
 *  @property [fields] Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online',
 *  @property [name_case] Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 *  @property [offset] Offset needed to return a specific subset of friends.
 *  @property [count] Number of friends to return.
 */
class FriendsSearchMethod() : VkMethod<VkList<UserFull>>(
    "friends.search",
    HashMap()
) {

    var userId: Long? by props
    var q: String? by props
    var fields: Array<String>? by props
    var nameCase: NameCase? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        userId: Long? = null,
        q: String? = null,
        fields: Array<String>? = null,
        nameCase: NameCase? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.userId = userId
        this.q = q
        this.fields = fields
        this.nameCase = nameCase
        this.offset = offset
        this.count = count
    }

    fun setUserId(userId: Long): FriendsSearchMethod {
        this.userId = userId
        return this
    }

    fun setQ(q: String): FriendsSearchMethod {
        this.q = q
        return this
    }

    fun setFields(fields: Array<String>): FriendsSearchMethod {
        this.fields = fields
        return this
    }

    fun setNameCase(nameCase: NameCase): FriendsSearchMethod {
        this.nameCase = nameCase
        return this
    }

    fun setOffset(offset: Long): FriendsSearchMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): FriendsSearchMethod {
        this.count = count
        return this
    }

    override val classRef = FriendsSearchMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<UserFull>>>() {}
    }
}
