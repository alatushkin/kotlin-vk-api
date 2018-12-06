@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
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
class VideoGetAlbumsByVideoMethod(
    targetId: Long? = null,
    ownerId: Long,
    videoId: Long
) : VkMethod<Array<Long>>(
    "video.getAlbumsByVideo",
    mutableMapOf(),
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
