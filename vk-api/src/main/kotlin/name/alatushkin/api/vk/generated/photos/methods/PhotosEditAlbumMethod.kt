@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.editAlbum]
 *
 * Edits information about a photo album.
 *
 * @property albumId ID of the photo album to be edited.
 * @property title New album title.
 * @property description New album description.
 * @property ownerId ID of the user or community that owns the album.
 * @property privacyView 
 * @property privacyComment 
 * @property uploadByAdminsOnly 
 * @property commentsDisabled 
 */
class PhotosEditAlbumMethod(
    albumId: Long,
    title: String? = null,
    description: String? = null,
    ownerId: Long? = null,
    privacyView: Array<String>? = null,
    privacyComment: Array<String>? = null,
    uploadByAdminsOnly: Boolean? = null,
    commentsDisabled: Boolean? = null
) : VkMethod<Boolean>(
    "photos.editAlbum",
    mutableMapOf(),
    successReference()
), UserMethod {

    var albumId: Long by props
    var title: String? by props
    var description: String? by props
    var ownerId: Long? by props
    var privacyView: Array<String>? by props
    var privacyComment: Array<String>? by props
    var uploadByAdminsOnly: Boolean? by props
    var commentsDisabled: Boolean? by props

    init {
        this.albumId = albumId
        this.title = title
        this.description = description
        this.ownerId = ownerId
        this.privacyView = privacyView
        this.privacyComment = privacyComment
        this.uploadByAdminsOnly = uploadByAdminsOnly
        this.commentsDisabled = commentsDisabled
    }
}
