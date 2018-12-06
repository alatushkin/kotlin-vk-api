@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.newsfeed.GetBannedResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.getBanned]
 *
 * Returns a list of users and communities banned from the current user's newsfeed.
 *
 * @property fields Profile fields to return.
 * @property nameCase Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class NewsfeedGetBannedMethod(
    fields: Array<String>? = null,
    nameCase: NameCase? = null
) : VkMethod<GetBannedResponse>(
    "newsfeed.getBanned",
    mutableMapOf(),
    successReference()
), UserMethod {

    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    init {
        this.fields = fields
        this.nameCase = nameCase
    }
}
