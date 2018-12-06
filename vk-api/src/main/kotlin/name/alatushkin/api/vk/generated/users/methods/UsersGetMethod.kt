@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.users.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.users.UserXtrCounters
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/users.get]
 *
 * Returns detailed information on users.
 *
 * @property userIds User IDs or screen names ('screen_name'). By default, current user ID.
 * @property fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'contacts', 'education', 'online', 'counters', 'relation', 'last_seen', 'activity', 'can_write_private_message', 'can_see_all_posts', 'can_post', 'universities',
 * @property nameCase Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class UsersGetMethod(
    userIds: Array<String>? = null,
    fields: Array<String>? = null,
    nameCase: NameCase? = null
) : VkMethod<Array<UserXtrCounters>>(
    "users.get",
    mutableMapOf(),
    successReference()
), UserServiceMethod {

    var userIds: Array<String>? by props
    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    init {
        this.userIds = userIds
        this.fields = fields
        this.nameCase = nameCase
    }
}
