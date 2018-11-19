package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Edits a post on a user wall or community wall.
 *
 *  [https://vk.com/dev/wall.edit]
 *  @property [owner_id] User ID or community ID. Use a negative value to designate a community ID.
 *  @property [post_id] Post ID.
 *  @property [friends_only] (Applies only when editing a scheduled post.), '1' — post will be available to friends only, '0' — post will be available to all users (default)
 *  @property [message] (Required if 'attachments' is not set.) Text of the post.
 *  @property [attachments] (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media application owner. '<media_id>' — Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error is thrown."
 *  @property [services] (Applies only to a scheduled post.) List of services or websites where status will be updated, if the user has so requested. Sample values: 'twitter', 'facebook'.
 *  @property [signed] (Applies only to a post that was created "as community" on a community wall.), '1' — to add the signature of the user who created the post
 *  @property [publish_date] (Applies only to a scheduled post.) Publication date (in Unix time). If used, posting will be delayed until the set time.
 *  @property [lat] Geographical latitude of the check-in, in degrees (from -90 to 90).
 *  @property [long] Geographical longitude of the check-in, in degrees (from -180 to 180).
 *  @property [place_id] ID of the location where the user was tagged.
 *  @property [mark_as_ads]
 */
class WallEditMethod() : VkMethod<Boolean>(
    "wall.edit",
    HashMap()
) {

    var ownerId: Long? by props
    var postId: Long? by props
    var friendsOnly: Boolean? by props
    var message: String? by props
    var attachments: Array<String>? by props
    var services: String? by props
    var signed: Boolean? by props
    var publishDate: Long? by props
    var lat: Double? by props
    var long: Double? by props
    var placeId: Long? by props
    var markAsAds: Boolean? by props

    constructor(
        ownerId: Long? = null,
        postId: Long? = null,
        friendsOnly: Boolean? = null,
        message: String? = null,
        attachments: Array<String>? = null,
        services: String? = null,
        signed: Boolean? = null,
        publishDate: Long? = null,
        lat: Double? = null,
        long: Double? = null,
        placeId: Long? = null,
        markAsAds: Boolean? = null
    ) : this() {
        this.ownerId = ownerId
        this.postId = postId
        this.friendsOnly = friendsOnly
        this.message = message
        this.attachments = attachments
        this.services = services
        this.signed = signed
        this.publishDate = publishDate
        this.lat = lat
        this.long = long
        this.placeId = placeId
        this.markAsAds = markAsAds
    }

    fun setOwnerId(ownerId: Long): WallEditMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPostId(postId: Long): WallEditMethod {
        this.postId = postId
        return this
    }

    fun setFriendsOnly(friendsOnly: Boolean): WallEditMethod {
        this.friendsOnly = friendsOnly
        return this
    }

    fun setMessage(message: String): WallEditMethod {
        this.message = message
        return this
    }

    fun setAttachments(attachments: Array<String>): WallEditMethod {
        this.attachments = attachments
        return this
    }

    fun setServices(services: String): WallEditMethod {
        this.services = services
        return this
    }

    fun setSigned(signed: Boolean): WallEditMethod {
        this.signed = signed
        return this
    }

    fun setPublishDate(publishDate: Long): WallEditMethod {
        this.publishDate = publishDate
        return this
    }

    fun setLat(lat: Double): WallEditMethod {
        this.lat = lat
        return this
    }

    fun setLong(long: Double): WallEditMethod {
        this.long = long
        return this
    }

    fun setPlaceId(placeId: Long): WallEditMethod {
        this.placeId = placeId
        return this
    }

    fun setMarkAsAds(markAsAds: Boolean): WallEditMethod {
        this.markAsAds = markAsAds
        return this
    }

    override val classRef = WallEditMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
