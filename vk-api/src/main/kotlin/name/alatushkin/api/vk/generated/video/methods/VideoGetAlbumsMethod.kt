@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.video.VideoAlbumFull
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.getAlbums]
 *
 * Returns a list of video albums owned by a user or community.
 *
 * @property ownerId ID of the user or community that owns the video album(s).
 * @property offset Offset needed to return a specific subset of video albums.
 * @property count Number of video albums to return.
 */
class VideoGetAlbumsMethod(
    ownerId: Long? = null,
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<VideoAlbumFull>>(
    "video.getAlbums",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.ownerId = ownerId
        this.offset = offset
        this.count = count
    }
}
