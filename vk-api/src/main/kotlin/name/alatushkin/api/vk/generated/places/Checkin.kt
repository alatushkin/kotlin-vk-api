package name.alatushkin.api.vk.generated.places

import name.alatushkin.api.vk.api.VkDate

open class Checkin(
    val id: Long,
    val userId: Long,
    val date: VkDate,
    val latitude: Long? = null,
    val longitude: Long? = null,
    val placeId: Long? = null,
    val text: String? = null,
    val distance: Long? = null,
    val placeTitle: String? = null,
    val placeCountry: Long? = null,
    val placeCity: Long? = null,
    val placeType: String? = null,
    val placeIcon: String? = null
)