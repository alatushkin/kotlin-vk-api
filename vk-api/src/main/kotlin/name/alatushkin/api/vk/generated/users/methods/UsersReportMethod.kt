@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.users.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.users.ReportType
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var userId: Long by props
    var type: ReportType by props
    var comment: String? by props

    init {
        this.userId = userId
        this.type = type
        this.comment = comment
    }
}
