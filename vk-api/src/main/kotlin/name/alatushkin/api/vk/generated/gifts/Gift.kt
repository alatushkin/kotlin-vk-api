package name.alatushkin.api.vk.generated.gifts

import name.alatushkin.api.vk.api.VkDate

open class Gift(
    val id: Long? = null,
    val fromId: Long? = null,
    val message: String? = null,
    val date: VkDate? = null,
    val gift: Layout? = null,
    val privacy: GiftPrivacy? = null,
    val giftHash: String? = null
)
