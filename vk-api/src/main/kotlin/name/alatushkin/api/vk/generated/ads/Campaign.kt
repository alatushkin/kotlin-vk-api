package name.alatushkin.api.vk.generated.ads

open class Campaign(
    val id: Long,
    val type: CampaignType,
    val name: String,
    val status: CampaignStatus,
    val dayLimit: String,
    val allLimit: String,
    val startTime: Long,
    val stopTime: Long
)
