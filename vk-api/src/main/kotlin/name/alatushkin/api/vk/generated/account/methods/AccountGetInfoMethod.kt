@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.account.Info
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.getInfo]
 *
 * Returns current account info.
 *
 * @property fields Fields to return. Possible values: *'country' — user country,, *'https_required' — is "HTTPS only" option enabled,, *'own_posts_default' — is "Show my posts only" option is enabled,, *'no_wall_replies' — are wall replies disabled or not,, *'intro' — is intro passed by user or not,, *'lang' — user language. By default: all.
 */
class AccountGetInfoMethod(
        fields: Array<String>? = null
) : VkMethod<Info>(
    "account.getInfo",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Info>>() {}
), UserMethod {

    var fields: Array<String>? by props

    init {
        this.fields = fields
    }

    fun setFields(fields: Array<String>): AccountGetInfoMethod {
        this.fields = fields
        return this
    }
}
