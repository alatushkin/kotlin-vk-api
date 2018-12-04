package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.newsfeed.GetBannedResponse

/**
 *  Returns a list of users and communities banned from the current user's newsfeed.
 *
 *  [https://vk.com/dev/newsfeed.getBanned]
 *  @property [fields] Profile fields to return.
 *  @property [name_case] Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class NewsfeedGetBannedMethod() : VkMethod<GetBannedResponse>(
    "newsfeed.getBanned",
    mutableMapOf()
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

    fun setFields(fields: Array<String>): NewsfeedGetBannedMethod {
        this.fields = fields
        return this
    }

    fun setNameCase(nameCase: NameCase): NewsfeedGetBannedMethod {
        this.nameCase = nameCase
        return this
    }

    override val classRef = NewsfeedGetBannedMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<GetBannedResponse>>() {}
    }
}
