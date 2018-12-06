package name.alatushkin.api.vk.generated.account

import name.alatushkin.api.vk.api.VkBirthDate
import name.alatushkin.api.vk.generated.common.Country
import name.alatushkin.api.vk.generated.common.Object
import name.alatushkin.api.vk.generated.common.Sex
import name.alatushkin.api.vk.generated.users.UserMin

open class UserSettings(
    val firstName: String? = null,
    val lastName: String? = null,
    val maidenName: String? = null,
    val screenName: String? = null,
    val sex: Sex? = null,
    val relation: Long? = null,
    val relationPartner: UserMin? = null,
    val relationPending: Long? = null,
    val relationRequests: Array<UserMin>? = null,
    val bdate: VkBirthDate? = null,
    val bdateVisibility: Long? = null,
    val homeTown: String? = null,
    val country: Country? = null,
    val city: Object? = null,
    val status: String? = null,
    val phone: String? = null,
    val nameRequest: NameRequest? = null
)
