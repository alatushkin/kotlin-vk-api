package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.BanUserReason

/**
 *  Adds a user to a community blacklist.
 *
 *  [https://vk.com/dev/groups.banUser]
 *  @property [group_id] Community ID.
 *  @property [user_id] User ID.
 *  @property [end_date] Date (in Unix time) when the user will be removed from the blacklist.
 *  @property [reason] Reason for ban: '1' — spam, '2' — verbal abuse, '3' — strong language, '4' — irrelevant messages, '0' — other (default)
 *  @property [comment] Text of comment to ban.
 *  @property [comment_visible] '1' — text of comment will be visible to the user,, '0' — text of comment will be invisible to the user. By default: '0'.
 */
class GroupsBanUserMethod() : VkMethod<Boolean>(
    "groups.banUser",
    HashMap()
) {

    var groupId: Long? by props
    var userId: Long? by props
    var endDate: Long? by props
    var reason: BanUserReason? by props
    var comment: String? by props
    var commentVisible: Boolean? by props

    constructor(
        groupId: Long? = null,
        userId: Long? = null,
        endDate: Long? = null,
        reason: BanUserReason? = null,
        comment: String? = null,
        commentVisible: Boolean? = null
    ) : this() {
        this.groupId = groupId
        this.userId = userId
        this.endDate = endDate
        this.reason = reason
        this.comment = comment
        this.commentVisible = commentVisible
    }

    fun setGroupId(groupId: Long): GroupsBanUserMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): GroupsBanUserMethod {
        this.userId = userId
        return this
    }

    fun setEndDate(endDate: Long): GroupsBanUserMethod {
        this.endDate = endDate
        return this
    }

    fun setReason(reason: BanUserReason): GroupsBanUserMethod {
        this.reason = reason
        return this
    }

    fun setComment(comment: String): GroupsBanUserMethod {
        this.comment = comment
        return this
    }

    fun setCommentVisible(commentVisible: Boolean): GroupsBanUserMethod {
        this.commentVisible = commentVisible
        return this
    }

    override val classRef = GroupsBanUserMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
