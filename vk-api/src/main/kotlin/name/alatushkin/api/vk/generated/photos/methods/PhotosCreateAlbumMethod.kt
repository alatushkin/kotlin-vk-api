package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.photos.PhotoAlbumFull

/**
 *  Creates an empty photo album.
 *
 *  [https://vk.com/dev/photos.createAlbum]
 *  @property [title] Album title.
 *  @property [group_id] ID of the community in which the album will be created.
 *  @property [description] Album description.
 *  @property [privacy_view]
 *  @property [privacy_comment]
 *  @property [upload_by_admins_only]
 *  @property [comments_disabled]
 */
class PhotosCreateAlbumMethod() : VkMethod<PhotoAlbumFull>(
    "photos.createAlbum",
    HashMap()
) {

    var title: String? by props
    var groupId: Long? by props
    var description: String? by props
    var privacyView: Array<String>? by props
    var privacyComment: Array<String>? by props
    var uploadByAdminsOnly: Boolean? by props
    var commentsDisabled: Boolean? by props

    constructor(
        title: String? = null,
        groupId: Long? = null,
        description: String? = null,
        privacyView: Array<String>? = null,
        privacyComment: Array<String>? = null,
        uploadByAdminsOnly: Boolean? = null,
        commentsDisabled: Boolean? = null
    ) : this() {
        this.title = title
        this.groupId = groupId
        this.description = description
        this.privacyView = privacyView
        this.privacyComment = privacyComment
        this.uploadByAdminsOnly = uploadByAdminsOnly
        this.commentsDisabled = commentsDisabled
    }

    fun setTitle(title: String): PhotosCreateAlbumMethod {
        this.title = title
        return this
    }

    fun setGroupId(groupId: Long): PhotosCreateAlbumMethod {
        this.groupId = groupId
        return this
    }

    fun setDescription(description: String): PhotosCreateAlbumMethod {
        this.description = description
        return this
    }

    fun setPrivacyView(privacyView: Array<String>): PhotosCreateAlbumMethod {
        this.privacyView = privacyView
        return this
    }

    fun setPrivacyComment(privacyComment: Array<String>): PhotosCreateAlbumMethod {
        this.privacyComment = privacyComment
        return this
    }

    fun setUploadByAdminsOnly(uploadByAdminsOnly: Boolean): PhotosCreateAlbumMethod {
        this.uploadByAdminsOnly = uploadByAdminsOnly
        return this
    }

    fun setCommentsDisabled(commentsDisabled: Boolean): PhotosCreateAlbumMethod {
        this.commentsDisabled = commentsDisabled
        return this
    }

    override val classRef = PhotosCreateAlbumMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<PhotoAlbumFull>>() {}
    }
}
