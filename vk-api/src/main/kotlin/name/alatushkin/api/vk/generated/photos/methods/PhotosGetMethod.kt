package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.AlbumId
import name.alatushkin.api.vk.generated.photos.Photo

/**
 *  Returns a list of a user's or community's photos.
 *
 *  [https://vk.com/dev/photos.get]
 *  @property [owner_id] ID of the user or community that owns the photos. Use a negative value to designate a community ID.
 *  @property [album_id] Photo album ID. To return information about photos from service albums, use the following string values: 'profile, wall, saved'.
 *  @property [photo_ids] Photo IDs.
 *  @property [rev] Sort order: '1' — reverse chronological, '0' — chronological
 *  @property [feed_type] Type of feed obtained in 'feed' field of the method.
 *  @property [feed] unixtime, that can be obtained with [vk.com/dev/newsfeed.get|newsfeed.get] method in date field to get all photos uploaded by the user on a specific day, or photos the user has been tagged on. Also, 'uid' parameter of the user the event happened with shall be specified.
 *  @property [photo_sizes] '1' — to return photo sizes in a [vk.com/dev/photo_sizes|special format]
 *  @property [offset] null
 *  @property [count] null
 */
class PhotosGetMethod() : VkMethod<VkList<Photo>>(
    "photos.get",
    mutableMapOf()
) {

    var ownerId: Long? by props
    var albumId: AlbumId? by props
    var photoIds: Array<String>? by props
    var rev: Boolean? by props
    var feedType: String? by props
    var feed: Long? by props
    var photoSizes: Boolean? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        ownerId: Long? = null,
        albumId: AlbumId? = null,
        photoIds: Array<String>? = null,
        rev: Boolean? = null,
        feedType: String? = null,
        feed: Long? = null,
        photoSizes: Boolean? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.albumId = albumId
        this.photoIds = photoIds
        this.rev = rev
        this.feedType = feedType
        this.feed = feed
        this.photoSizes = photoSizes
        this.offset = offset
        this.count = count
    }

    fun setOwnerId(ownerId: Long): PhotosGetMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumId(albumId: AlbumId): PhotosGetMethod {
        this.albumId = albumId
        return this
    }

    fun setPhotoIds(photoIds: Array<String>): PhotosGetMethod {
        this.photoIds = photoIds
        return this
    }

    fun setRev(rev: Boolean): PhotosGetMethod {
        this.rev = rev
        return this
    }

    fun setFeedType(feedType: String): PhotosGetMethod {
        this.feedType = feedType
        return this
    }

    fun setFeed(feed: Long): PhotosGetMethod {
        this.feed = feed
        return this
    }

    fun setPhotoSizes(photoSizes: Boolean): PhotosGetMethod {
        this.photoSizes = photoSizes
        return this
    }

    fun setOffset(offset: Long): PhotosGetMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): PhotosGetMethod {
        this.count = count
        return this
    }

    override val classRef = PhotosGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Photo>>>() {}
    }
}
