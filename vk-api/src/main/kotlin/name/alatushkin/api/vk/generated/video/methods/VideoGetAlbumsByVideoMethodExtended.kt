@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.video.VideoAlbumFull
import name.alatushkin.api.vk.successReference

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
    successReference()
) {

    var targetId: Long? by props
    var ownerId: Long by props
    var videoId: Long by props

    init {
        this.targetId = targetId
        this.ownerId = ownerId
        this.videoId = videoId
    }
}
