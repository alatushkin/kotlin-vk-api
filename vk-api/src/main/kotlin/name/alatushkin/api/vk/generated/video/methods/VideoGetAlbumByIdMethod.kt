@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.video.VideoAlbumFull
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.getAlbumById]
 *
 * Returns video album info
 *
 * @property ownerId identifier of a user or community to add a video to. Use a negative value to designate a community ID.
 * @property albumId Album ID.
 */
class VideoGetAlbumByIdMethod(
    ownerId: Long? = null,
    albumId: Long
) : VkMethod<VideoAlbumFull>(
    "video.getAlbumById",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var albumId: Long by props

    init {
        this.ownerId = ownerId
        this.albumId = albumId
    }
}
