package name.alatushkin.api.vk.generated.users

import name.alatushkin.api.vk.generated.common.Sex
import name.alatushkin.api.vk.generated.newsfeed.GetSuggestedSourcesResponse

open class UserXtrType(
    val type: UserType? = null,
    override val sex: Sex? = null,
    override val screenName: String? = null,
    override val photo50: String? = null,
    override val photo100: String? = null,
    override val online: Boolean? = null,
    override val onlineMobile: Boolean? = null,
    override val onlineApp: Long? = null,
    override val id: Long,
    override val firstName: String,
    override val lastName: String,
    override val deactivated: String? = null,
    override val hidden: Long? = null
) : User,
    GetSubscriptionsExtendedResponse,
    GetSuggestedSourcesResponse
