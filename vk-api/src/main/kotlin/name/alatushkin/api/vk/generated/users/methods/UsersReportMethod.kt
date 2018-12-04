@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.users.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.users.ReportType
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/users.report]
 *
 * Reports (submits a complain about) a user.
 *
 * @property userId ID of the user about whom a complaint is being made.
 * @property type Type of complaint: 'porn' – pornography, 'spam' – spamming, 'insult' – abusive behavior, 'advertisment' – disruptive advertisements
 * @property comment Comment describing the complaint.
 */
class UsersReportMethod(
        userId: Long,
        type: ReportType,
        comment: String? = null
) : VkMethod<Boolean>(
    "users.report",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var userId: Long by props
    var type: ReportType by props
    var comment: String? by props

    init {
        this.userId = userId
        this.type = type
        this.comment = comment
    }

    fun setUserId(userId: Long): UsersReportMethod {
        this.userId = userId
        return this
    }

    fun setType(type: ReportType): UsersReportMethod {
        this.type = type
        return this
    }

    fun setComment(comment: String): UsersReportMethod {
        this.comment = comment
        return this
    }
}
