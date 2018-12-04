@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.video.VideoAlbumFull

/**
 * [https://vk.com/dev/video.getAlbumsByVideo]
 *
 * null
 *
 * @property targetId 
 * @property ownerId 
 * @property videoId 
 */
class VideoGetAlbumsByVideoMethodExtended(
        targetId: Long? = null,
        ownerId: Long,
        videoId: Long
) : VkMethod<VkList<VideoAlbumFull>>(
    "video.getAlbumsByVideo",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkSuccess<VkList<VideoAlbumFull>>>() {}
) {

    var targetId: Long? by props
    var ownerId: Long by props
    var videoId: Long by props

    init {
        this.targetId = targetId
        this.ownerId = ownerId
        this.videoId = videoId
    }

    fun setTargetId(targetId: Long): VideoGetAlbumsByVideoMethodExtended {
        this.targetId = targetId
        return this
    }

    fun setOwnerId(ownerId: Long): VideoGetAlbumsByVideoMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoGetAlbumsByVideoMethodExtended {
        this.videoId = videoId
        return this
    }
}
