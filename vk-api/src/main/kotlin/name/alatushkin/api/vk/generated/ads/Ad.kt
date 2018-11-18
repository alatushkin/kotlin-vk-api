package name.alatushkin.api.vk.generated.ads


open class Ad(
    val id: Long,
    val campaignId: Long,
    val adFormat: Long,
    val costType: CostType,
    val cpc: Long? = null,
    val cpm: Long? = null,
    val impressionsLimit: Long? = null,
    val impressionsLimited: Boolean? = null,
    val adPlatform: String? = null,
    val allLimit: Long,
    val category1Id: Long? = null,
    val category2Id: Long? = null,
    val status: AdStatus,
    val name: String,
    val approved: AdApproved,
    val video: Boolean? = null,
    val disclaimerMedical: Boolean? = null,
    val disclaimerSpecialist: Boolean? = null,
    val disclaimerSupplements: Boolean? = null
)