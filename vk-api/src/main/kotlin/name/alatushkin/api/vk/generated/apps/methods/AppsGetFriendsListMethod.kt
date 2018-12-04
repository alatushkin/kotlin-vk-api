@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.apps.GetFriendsListType
import name.alatushkin.api.vk.generated.users.UserFull
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/apps.getFriendsList]
 *
 * Creates friends list for requests and invites in current app.
 *
 * @property count List size.
 * @property type List type. Possible values: * 'invite' — available for invites (don't play the game),, * 'request' — available for request (play the game). By default: 'invite'.
 * @property fields Additional profile fields, see [vk.com/dev/fields|description].
 */
class AppsGetFriendsListMethod(
        count: Long? = null,
        type: GetFriendsListType? = null,
        fields: Array<String>? = null
) : VkMethod<VkList<UserFull>>(
    "apps.getFriendsList",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<UserFull>>>() {}
), UserMethod {

    var count: Long? by props
    var type: GetFriendsListType? by props
    var fields: Array<String>? by props

    init {
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
}
