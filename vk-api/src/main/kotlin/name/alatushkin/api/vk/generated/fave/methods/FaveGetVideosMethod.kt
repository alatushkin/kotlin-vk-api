@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.video.Video
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var offset: Long? by props
    var count: Long? by props
    var extended: Boolean? by props

    init {
        this.offset = offset
        this.count = count
        this.extended = extended
    }
}
