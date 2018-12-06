@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.apps.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.apps.GetFriendsListType
import name.alatushkin.api.vk.generated.users.UserFull
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var count: Long? by props
    var type: GetFriendsListType? by props
    var fields: Array<String>? by props

    init {
        this.count = count
        this.type = type
        this.fields = fields
    }
}
