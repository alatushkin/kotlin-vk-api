package name.alatushkin.api.vk.generated.groups

import name.alatushkin.api.vk.generated.places.PlaceMin

open class GroupSettings(
    val title: String? = null,
    val description: String? = null,
    val address: String? = null,
    val place: PlaceMin? = null,
    val wall: Long? = null,
    val photos: Long? = null,
    val video: Long? = null,
    val audio: Long? = null,
    val docs: Long? = null,
    val topics: Long? = null,
    val wiki: Long? = null,
    val obsceneFilter: Boolean? = null,
    val publicCategory: Long? = null,
    val publicSubcategory: Long? = null,
    val publicCategoryList: Array<GroupPublicCategoryList>? = null,
    val obsceneStopwords: Boolean? = null,
    val obsceneWords: String? = null,
    val access: Long? = null,
    val subject: Long? = null,
    val subjectList: Array<SubjectItem>? = null,
    val rss: String? = null,
    val website: String? = null
)