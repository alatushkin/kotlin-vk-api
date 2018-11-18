package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Edits information about a photo album.
 *
 *  [https://vk.com/dev/photos.editAlbum]
 *  @property [album_id] ID of the photo album to be edited.
 *  @property [title] New album title.
 *  @property [description] New album description.
 *  @property [owner_id] ID of the user or community that owns the album.
 *  @property [privacy_view] null
 *  @property [privacy_comment] null
 *  @property [upload_by_admins_only] null
 *  @property [comments_disabled] null
 */
class PhotosEditAlbumMethod() : VkMethod<Boolean>(
    "photos.editAlbum",
    HashMap()
) {

    var albumId: Long? by props
    var title: String? by props
    var description: String? by props
    var ownerId: Long? by props
    var privacyView: Array<String>? by props
    var privacyComment: Array<String>? by props
    var uploadByAdminsOnly: Boolean? by props
    var commentsDisabled: Boolean? by props

    constructor(
        albumId: Long? = null,
        title: String? = null,
        description: String? = null,
        ownerId: Long? = null,
        privacyView: Array<String>? = null,
        privacyComment: Array<String>? = null,
        uploadByAdminsOnly: Boolean? = null,
        commentsDisabled: Boolean? = null
    ) : this() {
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

    override val classRef = PhotosEditAlbumMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
