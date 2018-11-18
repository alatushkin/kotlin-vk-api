package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.video.GetCatalogSectionExtendedResponse

/**
 *  Returns a separate catalog section
 *
 *  [https://vk.com/dev/video.getCatalogSection]
 *  @property [section_id] 'id' value returned with a block by the '' method.
 *  @property [from] 'next' value returned with a block by the '' method.
 *  @property [count] number of blocks to return.
 */
class VideoGetCatalogSectionMethodExtended() : VkMethod<GetCatalogSectionExtendedResponse>(
    "video.getCatalogSection",
    mutableMapOf("extended" to "1")
) {

    var sectionId: String? by props
    var from: String? by props
    var count: Long? by props

    constructor(
        sectionId: String? = null,
        from: String? = null,
        count: Long? = null
    ) : this() {
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

    override val classRef = VideoGetCatalogSectionMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GetCatalogSectionExtendedResponse>>() {}
    }
}
