@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.putTag]
 *
 * Adds a tag on a video.
 *
 * @property userId ID of the user to be tagged.
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 * @property taggedName Tag text.
 */
class VideoPutTagMethod(
        userId: Long,
        ownerId: Long? = null,
        videoId: Long,
        taggedName: String? = null
) : VkMethod<Long>(
    "video.putTag",
    mutableMapOf(),
    object : TypeReference<VkResponse<Long>>() {}
), UserMethod {

    var userId: Long by props
    var ownerId: Long? by props
    var videoId: Long by props
    var taggedName: String? by props

    init {
        this.userId = userId
        this.ownerId = ownerId
        this.videoId = videoId
        this.taggedName = taggedName
    }

    fun setUserId(userId: Long): VideoPutTagMethod {
        this.userId = userId
        return this
    }

    fun setOwnerId(ownerId: Long): VideoPutTagMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoPutTagMethod {
        this.videoId = videoId
        return this
    }

    fun setTaggedName(taggedName: String): VideoPutTagMethod {
        this.taggedName = taggedName
        return this
    }
}
