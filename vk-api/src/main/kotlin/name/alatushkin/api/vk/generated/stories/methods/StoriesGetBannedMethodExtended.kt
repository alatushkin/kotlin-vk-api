@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.stories.GetBannedExtendedResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/stories.getBanned]
 *
 * Returns list of sources hidden from current user's feed.
 *
 * @property fields Additional fields to return
 */
class StoriesGetBannedMethodExtended(
    fields: Array<String>? = null
) : VkMethod<GetBannedExtendedResponse>(
    "stories.getBanned",
    mutableMapOf("extended" to "1"),
    successReference()
), UserMethod {

    var fields: Array<String>? by props

    init {
        this.fields = fields
    }
}
