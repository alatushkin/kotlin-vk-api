package name.alatushkin.api.vk.generated.groups

import name.alatushkin.api.vk.api.VkDate

open class BanInfo(
    val adminId: Long? = null,
    val date: VkDate? = null,
    val reason: BanInfoReason? = null,
    val comment: String? = null,
    val endDate: Long? = null
)
