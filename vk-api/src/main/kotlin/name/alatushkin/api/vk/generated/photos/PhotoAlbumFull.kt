package name.alatushkin.api.vk.generated.photos

open class PhotoAlbumFull(
    val id: Long,
    val thumbId: Long? = null,
    val thumbSrc: String? = null,
    val ownerId: Long,
    val title: String,
    val description: String? = null,
    val created: Long,
    val updated: Long,
    val size: Long,
    val privacyView: Array<String>? = null,
    val privacyComment: Array<String>? = null,
    val uploadByAdminsOnly: Boolean? = null,
    val commentsDisabled: Boolean? = null,
    val canUpload: Boolean? = null,
    val thumbIsLast: Boolean? = null,
    val sizes: Array<PhotoSizes>? = null
)
