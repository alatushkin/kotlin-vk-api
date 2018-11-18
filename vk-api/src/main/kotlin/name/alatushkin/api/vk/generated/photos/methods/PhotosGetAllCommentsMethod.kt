package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.CommentXtrPid

/**
 *  Returns a list of comments on a specific photo album or all albums of the user sorted in reverse chronological order.
 *
 *  [https://vk.com/dev/photos.getAllComments]
 *  @property [owner_id] ID of the user or community that owns the album(s).
 *  @property [album_id] Album ID. If the parameter is not set, comments on all of the user's albums will be returned.
 *  @property [need_likes] '1' — to return an additional 'likes' field, '0' — (default)
 *  @property [offset] Offset needed to return a specific subset of comments. By default, '0'.
 *  @property [count] Number of comments to return. By default, '20'. Maximum value, '100'.
 */
class PhotosGetAllCommentsMethod() : VkMethod<VkList<CommentXtrPid>>(
    "photos.getAllComments",
    HashMap()
) {

    var ownerId: Long? by props
    var albumId: Long? by props
    var needLikes: Boolean? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        ownerId: Long? = null,
        albumId: Long? = null,
        needLikes: Boolean? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.albumId = albumId
        this.needLikes = needLikes
        this.offset = offset
        this.count = count
    }

    fun setOwnerId(ownerId: Long): PhotosGetAllCommentsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumId(albumId: Long): PhotosGetAllCommentsMethod {
        this.albumId = albumId
        return this
    }

    fun setNeedLikes(needLikes: Boolean): PhotosGetAllCommentsMethod {
        this.needLikes = needLikes
        return this
    }

    fun setOffset(offset: Long): PhotosGetAllCommentsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): PhotosGetAllCommentsMethod {
        this.count = count
        return this
    }

    override val classRef = PhotosGetAllCommentsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<CommentXtrPid>>>() {}
    }
}
