package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.newsfeed.GetBannedExtendedResponse

/**
 *  Returns a list of users and communities banned from the current user's newsfeed.
 *
 *  [https://vk.com/dev/newsfeed.getBanned]
 *  @property [fields] Profile fields to return.
 *  @property [name_case] Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class NewsfeedGetBannedMethodExtended() : VkMethod<GetBannedExtendedResponse>(
    "newsfeed.getBanned",
    mutableMapOf("extended" to "1")
) {

    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    constructor(
        fields: Array<String>? = null,
        nameCase: NameCase? = null
    ) : this() {
        this.fields = fields
        this.nameCase = nameCase
    }

    fun setFields(fields: Array<String>): NewsfeedGetBannedMethodExtended {
        this.fields = fields
        return this
    }

    fun setNameCase(nameCase: NameCase): NewsfeedGetBannedMethodExtended {
        this.nameCase = nameCase
        return this
    }

    override val classRef = NewsfeedGetBannedMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GetBannedExtendedResponse>>() {}
    }
}
