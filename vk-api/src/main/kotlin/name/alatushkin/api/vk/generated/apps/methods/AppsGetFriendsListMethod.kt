package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.apps.GetFriendsListType
import name.alatushkin.api.vk.generated.users.UserFull

/**
 *  Creates friends list for requests and invites in current app.
 *
 *  [https://vk.com/dev/apps.getFriendsList]
 *  @property [count] List size.
 *  @property [type] List type. Possible values: * 'invite' — available for invites (don't play the game),, * 'request' — available for request (play the game). By default: 'invite'.
 *  @property [fields] Additional profile fields, see [vk.com/dev/fields|description].
 */
class AppsGetFriendsListMethod() : VkMethod<VkList<UserFull>>(
    "apps.getFriendsList",
    HashMap()
) {

    var count: Long? by props
    var type: GetFriendsListType? by props
    var fields: Array<String>? by props

    constructor(
        count: Long? = null,
        type: GetFriendsListType? = null,
        fields: Array<String>? = null
    ) : this() {
        this.count = count
        this.type = type
        this.fields = fields
    }

    fun setCount(count: Long): AppsGetFriendsListMethod {
        this.count = count
        return this
    }

    fun setType(type: GetFriendsListType): AppsGetFriendsListMethod {
        this.type = type
        return this
    }

    fun setFields(fields: Array<String>): AppsGetFriendsListMethod {
        this.fields = fields
        return this
    }

    override val classRef = AppsGetFriendsListMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<UserFull>>>() {}
    }
}
