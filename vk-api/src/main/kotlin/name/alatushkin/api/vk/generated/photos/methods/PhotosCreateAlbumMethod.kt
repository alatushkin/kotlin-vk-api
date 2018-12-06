@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.photos.PhotoAlbumFull
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.createAlbum]
 *
 * Creates an empty photo album.
 *
 * @property title Album title.
 * @property groupId ID of the community in which the album will be created.
 * @property description Album description.
 * @property privacyView 
 * @property privacyComment 
 * @property uploadByAdminsOnly 
 * @property commentsDisabled 
 */
class PhotosCreateAlbumMethod(
    title: String,
    groupId: Long? = null,
    description: String? = null,
    privacyView: Array<String>? = null,
    privacyComment: Array<String>? = null,
    uploadByAdminsOnly: Boolean? = null,
    commentsDisabled: Boolean? = null
) : VkMethod<PhotoAlbumFull>(
    "photos.createAlbum",
    mutableMapOf(),
    successReference()
), UserMethod {

    var title: String by props
    var groupId: Long? by props
    var description: String? by props
    var privacyView: Array<String>? by props
    var privacyComment: Array<String>? by props
    var uploadByAdminsOnly: Boolean? by props
    var commentsDisabled: Boolean? by props

    init {
        this.title = title
        this.groupId = groupId
        this.description = description
        this.privacyView = privacyView
        this.privacyComment = privacyComment
        this.uploadByAdminsOnly = uploadByAdminsOnly
        this.commentsDisabled = commentsDisabled
    }
}
