package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.video.VideoTagInfo

/**
 *  Returns a list of videos with tags that have not been viewed.
 *
 *  [https://vk.com/dev/video.getNewTags]
 *  @property [offset] Offset needed to return a specific subset of videos.
 *  @property [count] Number of videos to return.
 */
class VideoGetNewTagsMethod() : VkMethod<VkList<VideoTagInfo>>(
    "video.getNewTags",
    HashMap()
) {

    var offset: Long? by props
    var count: Long? by props

    constructor(
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.offset = offset
        this.count = count
    }

    fun setOffset(offset: Long): VideoGetNewTagsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): VideoGetNewTagsMethod {
        this.count = count
        return this
    }

    override val classRef = VideoGetNewTagsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<VideoTagInfo>>>() {}
    }
}
