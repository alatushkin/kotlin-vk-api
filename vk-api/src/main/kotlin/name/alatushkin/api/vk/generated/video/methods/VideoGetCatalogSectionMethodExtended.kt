@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.video.GetCatalogSectionExtendedResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/video.getCatalogSection]
 *
 * Returns a separate catalog section
 *
 * @property sectionId 'id' value returned with a block by the '' method.
 * @property from 'next' value returned with a block by the '' method.
 * @property count number of blocks to return.
 */
class VideoGetCatalogSectionMethodExtended(
    sectionId: String,
    from: String,
    count: Long? = null
) : VkMethod<GetCatalogSectionExtendedResponse>(
    "video.getCatalogSection",
    mutableMapOf("extended" to "1"),
    successReference()
), UserServiceMethod {

    var sectionId: String by props
    var from: String by props
    var count: Long? by props

    init {
        this.sectionId = sectionId
        this.from = from
        this.count = count
    }
}
