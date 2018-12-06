package name.alatushkin.api.vk.generated.ads

open class AdLayout(
    val id: Long,
    val campaignId: Long,
    val adFormat: Long,
    val costType: CostType,
    val video: Boolean? = null,
    val title: String,
    val description: String,
    val linkUrl: String,
    val linkDomain: String? = null,
    val previewLink: String? = null,
    val imageSrc: Long,
    val imageSrc2x: Long? = null
)
