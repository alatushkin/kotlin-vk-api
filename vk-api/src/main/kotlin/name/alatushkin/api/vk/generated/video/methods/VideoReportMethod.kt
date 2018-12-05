@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.Reason
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.report]
 *
 * Reports (submits a complaint about) a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 * @property reason Reason for the complaint: '0' – spam, '1' – child pornography, '2' – extremism, '3' – violence, '4' – drug propaganda, '5' – adult material, '6' – insult, abuse
 * @property comment Comment describing the complaint.
 * @property searchQuery (If the video was found in search results.) Search query string.
 */
class VideoReportMethod(
        ownerId: Long,
        videoId: Long,
        reason: Reason? = null,
        comment: String? = null,
        searchQuery: String? = null
) : VkMethod<Boolean>(
    "video.report",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long by props
    var videoId: Long by props
    var reason: Reason? by props
    var comment: String? by props
    var searchQuery: String? by props

    init {
        this.ownerId = ownerId
        this.videoId = videoId
        this.reason = reason
        this.comment = comment
        this.searchQuery = searchQuery
    }

    fun setOwnerId(ownerId: Long): VideoReportMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoReportMethod {
        this.videoId = videoId
        return this
    }

    fun setReason(reason: Reason): VideoReportMethod {
        this.reason = reason
        return this
    }

    fun setComment(comment: String): VideoReportMethod {
        this.comment = comment
        return this
    }

    fun setSearchQuery(searchQuery: String): VideoReportMethod {
        this.searchQuery = searchQuery
        return this
    }
}
