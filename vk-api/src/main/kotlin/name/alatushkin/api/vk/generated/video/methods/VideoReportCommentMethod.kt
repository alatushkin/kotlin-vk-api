@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.Reason
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.reportComment]
 *
 * Reports (submits a complaint about) a comment on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property commentId ID of the comment being reported.
 * @property reason Reason for the complaint: , 0 – spam , 1 – child pornography , 2 – extremism , 3 – violence , 4 – drug propaganda , 5 – adult material , 6 – insult, abuse
 */
class VideoReportCommentMethod(
    ownerId: Long,
    commentId: Long,
    reason: Reason? = null
) : VkMethod<Boolean>(
    "video.reportComment",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var commentId: Long by props
    var reason: Reason? by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
        this.reason = reason
    }
}
