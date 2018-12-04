package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.video.Video

/**
 *  Returns a list of videos that the current user has liked.
 *
 *  [https://vk.com/dev/fave.getVideos]
 *  @property [offset] Offset needed to return a specific subset of videos.
 *  @property [count] Number of videos to return.
 *  @property [extended] Return an additional information about videos. Also returns all owners profiles and groups.
 */
class FaveGetVideosMethod() : VkMethod<VkList<Video>>(
    "fave.getVideos",
    HashMap()
) {

    var offset: Long? by props
    var count: Long? by props
    var extended: Boolean? by props

    constructor(
        offset: Long? = null,
        count: Long? = null,
        extended: Boolean? = null
    ) : this() {
        this.offset = offset
        this.count = count
        this.extended = extended
    }

    fun setOffset(offset: Long): FaveGetVideosMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): FaveGetVideosMethod {
        this.count = count
        return this
    }

    fun setExtended(extended: Boolean): FaveGetVideosMethod {
        this.extended = extended
        return this
    }

    override val classRef = FaveGetVideosMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<Video>>>() {}
    }
}
