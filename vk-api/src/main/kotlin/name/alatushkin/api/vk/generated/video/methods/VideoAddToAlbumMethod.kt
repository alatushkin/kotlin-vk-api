@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference

/**
 * [https://vk.com/dev/video.addToAlbum]
 *
 * null
 *
 * @property targetId 
 * @property albumId 
 * @property albumIds 
 * @property ownerId 
 * @property videoId 
 */
class VideoAddToAlbumMethod(
    targetId: Long? = null,
    albumId: Long? = null,
    albumIds: Array<Long>? = null,
    ownerId: Long,
    videoId: Long
) : VkMethod<Boolean>(
    "video.addToAlbum",
    mutableMapOf(),
    successReference()
) {

    var targetId: Long? by props
    var albumId: Long? by props
    var albumIds: Array<Long>? by props
    var ownerId: Long by props
    var videoId: Long by props

    init {
        this.targetId = targetId
        this.albumId = albumId
        this.albumIds = albumIds
        this.ownerId = ownerId
        this.videoId = videoId
    }
}
