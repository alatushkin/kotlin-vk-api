package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.photos.GetCommentsResponse
import name.alatushkin.api.vk.generated.photos.Sort

/**
 *  Returns a list of comments on a photo.
 *
 *  [https://vk.com/dev/photos.getComments]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [photo_id] Photo ID.
 *  @property [need_likes] '1' — to return an additional 'likes' field, '0' — (default)
 *  @property [start_comment_id]
 *  @property [offset] Offset needed to return a specific subset of comments. By default, '0'.
 *  @property [count] Number of comments to return.
 *  @property [sort] Sort order: 'asc' — old first, 'desc' — new first
 *  @property [access_key]
 *  @property [fields]
 */
class PhotosGetCommentsMethod() : VkMethod<GetCommentsResponse>(
    "photos.getComments",
    mutableMapOf()
) {

    var ownerId: Long? by props
    var photoId: Long? by props
    var needLikes: Boolean? by props
    var startCommentId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var sort: Sort? by props
    var accessKey: String? by props
    var fields: Array<String>? by props

    constructor(
        ownerId: Long? = null,
        photoId: Long? = null,
        needLikes: Boolean? = null,
        startCommentId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        sort: Sort? = null,
        accessKey: String? = null,
        fields: Array<String>? = null
    ) : this() {
        this.ownerId = ownerId
        this.photoId = photoId
        this.needLikes = needLikes
        this.startCommentId = startCommentId
        this.offset = offset
        this.count = count
        this.sort = sort
        this.accessKey = accessKey
        this.fields = fields
    }

    fun setOwnerId(ownerId: Long): PhotosGetCommentsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosGetCommentsMethod {
        this.photoId = photoId
        return this
    }

    fun setNeedLikes(needLikes: Boolean): PhotosGetCommentsMethod {
        this.needLikes = needLikes
        return this
    }

    fun setStartCommentId(startCommentId: Long): PhotosGetCommentsMethod {
        this.startCommentId = startCommentId
        return this
    }

    fun setOffset(offset: Long): PhotosGetCommentsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): PhotosGetCommentsMethod {
        this.count = count
        return this
    }

    fun setSort(sort: Sort): PhotosGetCommentsMethod {
        this.sort = sort
        return this
    }

    fun setAccessKey(accessKey: String): PhotosGetCommentsMethod {
        this.accessKey = accessKey
        return this
    }

    fun setFields(fields: Array<String>): PhotosGetCommentsMethod {
        this.fields = fields
        return this
    }

    override val classRef = PhotosGetCommentsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<GetCommentsResponse>>() {}
    }
}
