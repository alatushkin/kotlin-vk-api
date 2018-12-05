@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 * [https://vk.com/dev/video.getAlbumsByVideo]
 *
 * null
 *
 * @property targetId 
 * @property ownerId 
 * @property videoId 
 */
class VideoGetAlbumsByVideoMethod(
        targetId: Long? = null,
        ownerId: Long,
        videoId: Long
) : VkMethod<Array<Long>>(
    "video.getAlbumsByVideo",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<Long>>>() {}
) {

    var targetId: Long? by props
    var ownerId: Long by props
    var videoId: Long by props

    init {
        this.targetId = targetId
        this.ownerId = ownerId
        this.videoId = videoId
    }

    fun setTargetId(targetId: Long): VideoGetAlbumsByVideoMethod {
        this.targetId = targetId
        return this
    }

    fun setOwnerId(ownerId: Long): VideoGetAlbumsByVideoMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoGetAlbumsByVideoMethod {
        this.videoId = videoId
        return this
    }
}
