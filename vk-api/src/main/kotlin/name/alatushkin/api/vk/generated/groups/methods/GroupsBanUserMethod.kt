@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.groups.BanUserReason
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.banUser]
 *
 * Adds a user to a community blacklist.
 *
 * @property groupId Community ID.
 * @property userId User ID.
 * @property endDate Date (in Unix time) when the user will be removed from the blacklist.
 * @property reason Reason for ban: '1' — spam, '2' — verbal abuse, '3' — strong language, '4' — irrelevant messages, '0' — other (default)
 * @property comment Text of comment to ban.
 * @property commentVisible '1' — text of comment will be visible to the user,, '0' — text of comment will be invisible to the user. By default: '0'.
 */
class GroupsBanUserMethod(
    groupId: Long,
    userId: Long,
    endDate: Long? = null,
    reason: BanUserReason? = null,
    comment: String? = null,
    commentVisible: Boolean? = null
) : VkMethod<Boolean>(
    "groups.banUser",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props
    var userId: Long by props
    var endDate: Long? by props
    var reason: BanUserReason? by props
    var comment: String? by props
    var commentVisible: Boolean? by props

    init {
        this.groupId = groupId
        this.userId = userId
        this.endDate = endDate
        this.reason = reason
        this.comment = comment
        this.commentVisible = commentVisible
    }
}
