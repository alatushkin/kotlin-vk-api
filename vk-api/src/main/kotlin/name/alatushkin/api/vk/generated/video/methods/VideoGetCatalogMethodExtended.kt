@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.video.GetCatalogExtendedResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/video.getCatalog]
 *
 * Returns video catalog
 *
 * @property count number of catalog blocks to return.
 * @property itemsCount number of videos in each block.
 * @property from parameter for requesting the next results page. Value for transmitting here is returned in the 'next' field in a reply.
 * @property filters list of requested catalog sections
 */
class VideoGetCatalogMethodExtended(
    count: Long? = null,
    itemsCount: Long? = null,
    from: String? = null,
    filters: Array<String>? = null
) : VkMethod<GetCatalogExtendedResponse>(
    "video.getCatalog",
    mutableMapOf("extended" to "1"),
    successReference()
), UserServiceMethod {

    var count: Long? by props
    var itemsCount: Long? by props
    var from: String? by props
    var filters: Array<String>? by props

    init {
        this.count = count
        this.itemsCount = itemsCount
        this.from = from
        this.filters = filters
    }
}
