@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.video.GetExtendedResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.get]
 *
 * Returns detailed information about videos.
 *
 * @property ownerId ID of the user or community that owns the video(s).
 * @property videos Video IDs, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", Use a negative value to designate a community ID. Example: "-4363_136089719,13245770_137352259"
 * @property albumId ID of the album containing the video(s).
 * @property count Number of videos to return.
 * @property offset Offset needed to return a specific subset of videos.
 */
class VideoGetMethodExtended(
        ownerId: Long? = null,
        videos: Array<String>? = null,
        albumId: Long? = null,
        count: Long? = null,
        offset: Long? = null
) : VkMethod<GetExtendedResponse>(
    "video.get",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkSuccess<GetExtendedResponse>>() {}
), UserMethod {

    var ownerId: Long? by props
    var videos: Array<String>? by props
    var albumId: Long? by props
    var count: Long? by props
    var offset: Long? by props

    init {
        this.ownerId = ownerId
        this.videos = videos
        this.albumId = albumId
        this.count = count
        this.offset = offset
    }

    fun setOwnerId(ownerId: Long): VideoGetMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setVideos(videos: Array<String>): VideoGetMethodExtended {
        this.videos = videos
        return this
    }

    fun setAlbumId(albumId: Long): VideoGetMethodExtended {
        this.albumId = albumId
        return this
    }

    fun setCount(count: Long): VideoGetMethodExtended {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): VideoGetMethodExtended {
        this.offset = offset
        return this
    }
}
