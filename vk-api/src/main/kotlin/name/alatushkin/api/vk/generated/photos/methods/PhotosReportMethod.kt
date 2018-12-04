package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.Reason

/**
 *  Reports (submits a complaint about) a photo.
 *
 *  [https://vk.com/dev/photos.report]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [photo_id] Photo ID.
 *  @property [reason] Reason for the complaint: '0' – spam, '1' – child pornography, '2' – extremism, '3' – violence, '4' – drug propaganda, '5' – adult material, '6' – insult, abuse
 */
class PhotosReportMethod() : VkMethod<Boolean>(
    "photos.report",
    HashMap()
) {

    var ownerId: Long? by props
    var photoId: Long? by props
    var reason: Reason? by props

    constructor(
        ownerId: Long? = null,
        photoId: Long? = null,
        reason: Reason? = null
    ) : this() {
        this.ownerId = ownerId
        this.photoId = photoId
        this.reason = reason
    }

    fun setOwnerId(ownerId: Long): PhotosReportMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosReportMethod {
        this.photoId = photoId
        return this
    }

    fun setReason(reason: Reason): PhotosReportMethod {
        this.reason = reason
        return this
    }

    override val classRef = PhotosReportMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
