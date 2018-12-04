@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.video.GetCatalogSectionExtendedResponse
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
    object : TypeReference<VkSuccess<GetCatalogSectionExtendedResponse>>() {}
), UserServiceMethod {

    var sectionId: String by props
    var from: String by props
    var count: Long? by props

    init {
        this.sectionId = sectionId
        this.from = from
        this.count = count
    }

    fun setSectionId(sectionId: String): VideoGetCatalogSectionMethodExtended {
        this.sectionId = sectionId
        return this
    }

    fun setFrom(from: String): VideoGetCatalogSectionMethodExtended {
        this.from = from
        return this
    }

    fun setCount(count: Long): VideoGetCatalogSectionMethodExtended {
        this.count = count
        return this
    }
}
