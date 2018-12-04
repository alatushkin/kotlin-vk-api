package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.wall.PostResponse

/**
 *  Adds a new post on a user wall or community wall. Can also be used to publish suggested or scheduled posts.
 *
 *  [https://vk.com/dev/wall.post]
 *  @property [owner_id] User ID or community ID. Use a negative value to designate a community ID.
 *  @property [friends_only] '1' — post will be available to friends only, '0' — post will be available to all users (default)
 *  @property [from_group] For a community: '1' — post will be published by the community, '0' — post will be published by the user (default)
 *  @property [message] (Required if 'attachments' is not set.) Text of the post.
 *  @property [attachments] (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, 'page' — wiki-page, 'note' — note, 'poll' — poll, 'album' — photo album, '<owner_id>' — ID of the media application owner. '<media_id>' — Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error will be thrown."
 *  @property [services] List of services or websites the update will be exported to, if the user has so requested. Sample values: 'twitter', 'facebook'.
 *  @property [signed] Only for posts in communities with 'from_group' set to '1': '1' — post will be signed with the name of the posting user, '0' — post will not be signed (default)
 *  @property [publish_date] Publication date (in Unix time). If used, posting will be delayed until the set time.
 *  @property [lat] Geographical latitude of a check-in, in degrees (from -90 to 90).
 *  @property [long] Geographical longitude of a check-in, in degrees (from -180 to 180).
 *  @property [place_id] ID of the location where the user was tagged.
 *  @property [post_id] Post ID. Used for publishing of scheduled and suggested posts.
 *  @property [guid]
 *  @property [mark_as_ads]
 */
class WallPostMethod() : VkMethod<PostResponse>(
    "wall.post",
    HashMap()
) {

    var ownerId: Long? by props
    var friendsOnly: Boolean? by props
    var fromGroup: Boolean? by props
    var message: String? by props
    var attachments: Array<String>? by props
    var services: String? by props
    var signed: Boolean? by props
    var publishDate: Long? by props
    var lat: Double? by props
    var long: Double? by props
    var placeId: Long? by props
    var postId: Long? by props
    var guid: String? by props
    var markAsAds: Boolean? by props

    constructor(
        ownerId: Long? = null,
        friendsOnly: Boolean? = null,
        fromGroup: Boolean? = null,
        message: String? = null,
        attachments: Array<String>? = null,
        services: String? = null,
        signed: Boolean? = null,
        publishDate: Long? = null,
        lat: Double? = null,
        long: Double? = null,
        placeId: Long? = null,
        postId: Long? = null,
        guid: String? = null,
        markAsAds: Boolean? = null
    ) : this() {
        this.ownerId = ownerId
        this.friendsOnly = friendsOnly
        this.fromGroup = fromGroup
        this.message = message
        this.attachments = attachments
        this.services = services
        this.signed = signed
        this.publishDate = publishDate
        this.lat = lat
        this.long = long
        this.placeId = placeId
        this.postId = postId
        this.guid = guid
        this.markAsAds = markAsAds
    }

    fun setOwnerId(ownerId: Long): WallPostMethod {
        this.ownerId = ownerId
        return this
    }

    fun setFriendsOnly(friendsOnly: Boolean): WallPostMethod {
        this.friendsOnly = friendsOnly
        return this
    }

    fun setFromGroup(fromGroup: Boolean): WallPostMethod {
        this.fromGroup = fromGroup
        return this
    }

    fun setMessage(message: String): WallPostMethod {
        this.message = message
        return this
    }

    fun setAttachments(attachments: Array<String>): WallPostMethod {
        this.attachments = attachments
        return this
    }

    fun setServices(services: String): WallPostMethod {
        this.services = services
        return this
    }

    fun setSigned(signed: Boolean): WallPostMethod {
        this.signed = signed
        return this
    }

    fun setPublishDate(publishDate: Long): WallPostMethod {
        this.publishDate = publishDate
        return this
    }

    fun setLat(lat: Double): WallPostMethod {
        this.lat = lat
        return this
    }

    fun setLong(long: Double): WallPostMethod {
        this.long = long
        return this
    }

    fun setPlaceId(placeId: Long): WallPostMethod {
        this.placeId = placeId
        return this
    }

    fun setPostId(postId: Long): WallPostMethod {
        this.postId = postId
        return this
    }

    fun setGuid(guid: String): WallPostMethod {
        this.guid = guid
        return this
    }

    fun setMarkAsAds(markAsAds: Boolean): WallPostMethod {
        this.markAsAds = markAsAds
        return this
    }

    override val classRef = WallPostMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<PostResponse>>() {}
    }
}
