package name.alatushkin.api.vk.generated.pages


open class Wikipage(
    val id: Long,
    val groupId: Long,
    val title: String,
    val whoCanView: PrivacySettings,
    val whoCanEdit: PrivacySettings,
    val views: Long,
    val editorId: Long? = null,
    val editorName: String? = null,
    val creatorId: Long? = null,
    val creatorName: Long? = null
)