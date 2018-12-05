@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.Reason
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.report]
 *
 * Reports (submits a complaint about) a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property reason Reason for the complaint: '0' – spam, '1' – child pornography, '2' – extremism, '3' – violence, '4' – drug propaganda, '5' – adult material, '6' – insult, abuse
 */
class PhotosReportMethod(
        ownerId: Long,
        photoId: Long,
        reason: Reason? = null
) : VkMethod<Boolean>(
    "photos.report",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long by props
    var photoId: Long by props
    var reason: Reason? by props

    init {
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
}
