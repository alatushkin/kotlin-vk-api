@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.video.Video
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.getVideos]
 *
 * Returns a list of videos that the current user has liked.
 *
 * @property offset Offset needed to return a specific subset of videos.
 * @property count Number of videos to return.
 * @property extended Return an additional information about videos. Also returns all owners profiles and groups.
 */
class FaveGetVideosMethod(
        offset: Long? = null,
        count: Long? = null,
        extended: Boolean? = null
) : VkMethod<VkList<Video>>(
    "fave.getVideos",
    mutableMapOf(),
    object : TypeReference<VkResponse<VkList<Video>>>() {}
), UserMethod {

    var offset: Long? by props
    var count: Long? by props
    var extended: Boolean? by props

    init {
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
}
