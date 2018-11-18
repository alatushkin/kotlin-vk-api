package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Hides a video catalog section from a user.
 *
 *  [https://vk.com/dev/video.hideCatalogSection]
 *  @property [section_id] 'id' value returned with a block to hide by the '' method.
 */
class VideoHideCatalogSectionMethod() : VkMethod<Boolean>(
    "video.hideCatalogSection",
    HashMap()
) {

    var sectionId: Long? by props

    constructor(
        sectionId: Long? = null
    ) : this() {
        this.sectionId = sectionId
    }

    fun setSectionId(sectionId: Long): VideoHideCatalogSectionMethod {
        this.sectionId = sectionId
        return this
    }

    override val classRef = VideoHideCatalogSectionMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
