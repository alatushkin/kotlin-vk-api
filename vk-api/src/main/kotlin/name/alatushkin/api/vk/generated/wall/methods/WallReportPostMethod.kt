@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.Reason
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/wall.reportPost]
 *
 * Reports (submits a complaint about) a post on a user wall or community wall.
 *
 * @property ownerId ID of the user or community that owns the wall.
 * @property postId Post ID.
 * @property reason Reason for the complaint: '0' – spam, '1' – child pornography, '2' – extremism, '3' – violence, '4' – drug propaganda, '5' – adult material, '6' – insult, abuse
 */
class WallReportPostMethod(
    ownerId: Long,
    postId: Long,
    reason: Reason? = null
) : VkMethod<Boolean>(
    "wall.reportPost",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var postId: Long by props
    var reason: Reason? by props

    init {
        this.ownerId = ownerId
        this.postId = postId
        this.reason = reason
    }
}
