@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.video.GetUserVideosExtendedResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.getUserVideos]
 *
 * Returns list of videos in which the user is tagged.
 *
 * @property userId User ID.
 * @property offset Offset needed to return a specific subset of videos.
 * @property count Number of videos to return.
 */
class VideoGetUserVideosMethodExtended(
        userId: Long? = null,
        offset: Long? = null,
        count: Long? = null
) : VkMethod<GetUserVideosExtendedResponse>(
    "video.getUserVideos",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkSuccess<GetUserVideosExtendedResponse>>() {}
), UserMethod {

    var userId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.userId = userId
        this.offset = offset
        this.count = count
    }

    fun setUserId(userId: Long): VideoGetUserVideosMethodExtended {
        this.userId = userId
        return this
    }

    fun setOffset(offset: Long): VideoGetUserVideosMethodExtended {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): VideoGetUserVideosMethodExtended {
        this.count = count
        return this
    }
}
