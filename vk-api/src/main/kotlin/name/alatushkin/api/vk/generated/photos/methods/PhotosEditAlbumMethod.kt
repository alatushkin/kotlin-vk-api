@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
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
    object : TypeReference<VkSuccess<Boolean>>() {}
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

    fun setAlbumId(albumId: Long): PhotosEditAlbumMethod {
        this.albumId = albumId
        return this
    }

    fun setTitle(title: String): PhotosEditAlbumMethod {
        this.title = title
        return this
    }

    fun setDescription(description: String): PhotosEditAlbumMethod {
        this.description = description
        return this
    }

    fun setOwnerId(ownerId: Long): PhotosEditAlbumMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPrivacyView(privacyView: Array<String>): PhotosEditAlbumMethod {
        this.privacyView = privacyView
        return this
    }

    fun setPrivacyComment(privacyComment: Array<String>): PhotosEditAlbumMethod {
        this.privacyComment = privacyComment
        return this
    }

    fun setUploadByAdminsOnly(uploadByAdminsOnly: Boolean): PhotosEditAlbumMethod {
        this.uploadByAdminsOnly = uploadByAdminsOnly
        return this
    }

    fun setCommentsDisabled(commentsDisabled: Boolean): PhotosEditAlbumMethod {
        this.commentsDisabled = commentsDisabled
        return this
    }
}
