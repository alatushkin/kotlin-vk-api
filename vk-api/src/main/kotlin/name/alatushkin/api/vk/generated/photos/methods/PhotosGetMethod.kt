@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.photos.AlbumId
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/photos.get]
 *
 * Returns a list of a user's or community's photos.
 *
 * @property ownerId ID of the user or community that owns the photos. Use a negative value to designate a community ID.
 * @property albumId Photo album ID. To return information about photos from service albums, use the following string values: 'profile, wall, saved'.
 * @property photoIds Photo IDs.
 * @property rev Sort order: '1' — reverse chronological, '0' — chronological
 * @property feedType Type of feed obtained in 'feed' field of the method.
 * @property feed unixtime, that can be obtained with [vk.com/dev/newsfeed.get|newsfeed.get] method in date field to get all photos uploaded by the user on a specific day, or photos the user has been tagged on. Also, 'uid' parameter of the user the event happened with shall be specified.
 * @property photoSizes '1' — to return photo sizes in a [vk.com/dev/photo_sizes|special format]
 * @property offset 
 * @property count 
 */
class PhotosGetMethod(
    ownerId: Long? = null,
    albumId: AlbumId? = null,
    photoIds: Array<String>? = null,
    rev: Boolean? = null,
    feedType: String? = null,
    feed: Long? = null,
    photoSizes: Boolean? = null,
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<Photo>>(
    "photos.get",
    mutableMapOf(),
    successReference()
), UserServiceMethod {

    var ownerId: Long? by props
    var albumId: AlbumId? by props
    var photoIds: Array<String>? by props
    var rev: Boolean? by props
    var feedType: String? by props
    var feed: Long? by props
    var photoSizes: Boolean? by props
    var offset: Long? by props
    var count: Long? by props

    init {
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
}
