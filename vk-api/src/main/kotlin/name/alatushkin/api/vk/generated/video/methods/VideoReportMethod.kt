@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.Reason
import name.alatushkin.api.vk.successReference
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
    successReference()
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
}
