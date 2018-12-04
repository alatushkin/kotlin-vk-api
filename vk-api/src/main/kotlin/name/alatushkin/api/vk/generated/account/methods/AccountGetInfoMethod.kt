package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.account.Info

/**
 *  Returns current account info.
 *
 *  [https://vk.com/dev/account.getInfo]
 *  @property [fields] Fields to return. Possible values: *'country' — user country,, *'https_required' — is "HTTPS only" option enabled,, *'own_posts_default' — is "Show my posts only" option is enabled,, *'no_wall_replies' — are wall replies disabled or not,, *'intro' — is intro passed by user or not,, *'lang' — user language. By default: all.
 */
class AccountGetInfoMethod() : VkMethod<Info>(
    "account.getInfo",
    HashMap()
) {

    var fields: Array<String>? by props

    constructor(
        fields: Array<String>? = null
    ) : this() {
        this.fields = fields
    }

    fun setFields(fields: Array<String>): AccountGetInfoMethod {
        this.fields = fields
        return this
    }

    override val classRef = AccountGetInfoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Info>>() {}
    }
}
