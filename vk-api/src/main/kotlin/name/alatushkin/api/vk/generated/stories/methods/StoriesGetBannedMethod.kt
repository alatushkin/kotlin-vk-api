@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/stories.getBanned]
 *
 * Returns list of sources hidden from current user's feed.
 *
 * @property fields Additional fields to return
 */
class StoriesGetBannedMethod(
        fields: Array<String>? = null
) : VkMethod<VkList<Long>>(
    "stories.getBanned",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<Long>>>() {}
), UserMethod {

    var fields: Array<String>? by props

    init {
        this.fields = fields
    }

    fun setFields(fields: Array<String>): StoriesGetBannedMethod {
        this.fields = fields
        return this
    }
}
